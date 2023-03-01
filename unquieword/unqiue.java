package unquieword;
// In This we have number of Words & Line in file 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class unqiue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int charsCount = 0;
        int wordsCount = 0;
        int linesCount = 0;        
//        Scanner in = null;
        File file = new File("E:\\College\\4th Year\\KmeanGit\\Group-project-4th-tgpcet\\sampledataset.txt");
        
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))){
        	while (scanner.hasNextLine()) {
                String tmpStr = scanner.nextLine();
                if (!tmpStr.equalsIgnoreCase("")) {
                    String replaceAll = tmpStr.replaceAll("\\s+", "");
                    charsCount += replaceAll.length();
                    wordsCount += tmpStr.split("\\s+").length;
                }
                ++linesCount;
            }        	
        }
        catch(Exception e){
        	e.printStackTrace();
        }
        System.out.println("# of chars: " + charsCount);
        System.out.println("# of words: " + wordsCount);
        System.out.println("# of lines: " + linesCount);
        System.out.println("# of bytes: " + file.length());
	}
}

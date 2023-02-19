package fileredaer;
// This one is perfect which we can work on
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//This project sub section
public class fileReader {

	public static void main(String[] args) {
		
		String line;  
        int count = 0;  
  
        //Opens a file in read mode  
        FileReader file;
		try {
			file = new FileReader("E:\\College\\4th Year\\KmeanGit\\Group-project-4th-tgpcet\\sampledataset.txt");
			BufferedReader br = new BufferedReader(file);  
			  
	        //Gets each line till end of file is reached  
	        try {
				while((line = br.readLine()) != null) {  
				    //Splits each line into words  
				    String words[] = line.split("");  
				    //Counts each word  
				    count = count + words.length;  
  
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
	  
	        
	        try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		System.out.println("Number of character present in given file: " + count);  
    }  
		
}

package unquieword;
//This program give us to most repeated single word in file are ex the 66 time
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class printunqiueword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String line,word="";
		int count = 0, maxCount=0;
		
		ArrayList<String> words = new ArrayList<String>();
		
		try {
		FileReader file = new FileReader("E:\\College\\4th Year\\KmeanGit\\Group-project-4th-tgpcet\\sampledataset.txt");
		BufferedReader br =new BufferedReader(file);
		while((line=br.readLine())!=null) {
			String string[] = line.toLowerCase().split("([,.\\s]+)");
			for(String s: string){
			words.add(s);
			}
		}
		
		 for(int i = 0; i < words.size(); i++){  
	            count = 1;  
	            //Count each word in the file and store it in variable count  
	            for(int j = i+1; j < words.size(); j++){  
	                if(words.get(i).equals(words.get(j))){  
	                    count++;  
	                }   
	            }  
	            
	            if(count > maxCount){  
	                maxCount = count;  
	                word = words.get(i);  
	            }  
	        }
		 System.out.println("Most repeated word: " + word);
		 System.out.println("Most repeated time: " + count);
		 System.out.println("Most repeated Maxcount: " +maxCount );
	        br.close();  
		}
		catch(Exception e) {e.printStackTrace();}
	       
	}
	
}

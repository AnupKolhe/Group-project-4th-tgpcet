package unquieword;
//This File top 10 word repeated is given 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

public class tenreaptedword {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		LinkedHashMap<String, Integer> wordcount =
	            new LinkedHashMap<String, Integer>();
	    try { 
	        BufferedReader in = new BufferedReader(
	                                  new FileReader("C:\\Users\\91913\\Desktop\\sampledataset.txt"));
	        String str;

	        while ((str = in.readLine()) != null) { 
	            str = str.toLowerCase(); // convert to lower case 
	            String[] words = str.split("\\s+"); //split the line on whitespace, would return an array of words

	            for( String word : words ) {
	              if( word.length() == 0 ) {
	                continue; 
	              }

	              Integer occurences = wordcount.get(word);

	              if( occurences == null) {
	                occurences = 1;
	              } else {
	                occurences++;
	              }

	              wordcount.put(word, occurences);
	            }
	         } 
	        } 
	    catch(Exception e){
	        System.out.println(e);
	    }
	    ArrayList<Integer> values = new ArrayList<Integer>();
	    values.addAll(wordcount.values());
	    Collections.sort(values, Collections.reverseOrder());
	    int last_i = -1;
	    for (Integer i : values.subList(0, 9)) { 
	        if (last_i == i) // without duplicates
	            continue;
	        last_i = i;
	            for (String s : wordcount.keySet()) { 
	            if (wordcount.get(s) == i) // which have this value  
	               System.out.println(s+ " " + i);

	    }
	    } 
		
	}

}

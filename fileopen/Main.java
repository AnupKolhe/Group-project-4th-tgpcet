package fileopen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
// In this we will make and Open file
		
		File file = new File("C:\\Users\\91913\\Desktop\\sampledataset.txt");
		Scanner scan = new Scanner(file);
		
		while(scan.hasNextLine()) {
		System.out.println(scan.nextLine());
		}
	}

}

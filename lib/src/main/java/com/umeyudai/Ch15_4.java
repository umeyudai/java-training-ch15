package com.umeyudai;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class Ch15_4 {
    public static void main(String[] args) {
		Path path = Paths.get("mydata.txt");
		try {
			Scanner sc = new Scanner(path);
			while(sc.hasNext()) {
				int number = sc.nextInt();
				String name = sc.next();
				double score = sc.nextDouble();
			
				System.out.println("|"+number+"|\t|"+name+"|\t|"+score+"|");
			}
			
		} 
		catch (IOException e) {
			e.printStackTrace(); 
		}

	}
}

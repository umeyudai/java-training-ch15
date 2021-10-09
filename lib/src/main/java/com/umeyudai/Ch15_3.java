package com.umeyudai;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class Ch15_3 {
    public static void main(String[] args) {
		Path path = Paths.get("mydata.txt");
		try(BufferedWriter out = Files.newBufferedWriter(path, 
												StandardOpenOption.CREATE, 	
												StandardOpenOption.APPEND );) {
			out.write(3002 + "\t");
			out.write("鈴木一郎" + "\t");
			out.write(82.6 + "\n");
				
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

package com.umeyudai;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;

public class Ch15_6 {
    public static void main(String[] args) {
		
		String path = "books.dat";

		try(ObjectInputStream in = 
				new ObjectInputStream(new BufferedInputStream(
										new FileInputStream(path)));){
			
			long isbn = in.readLong();
			String title = in.readUTF();
			LocalDate date = (LocalDate)in.readObject();
			
			System.out.println(isbn + "\t" + title + "\t" + date);
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

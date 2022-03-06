package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNewFile {

	public static void main(String[] args) throws IOException {
		File file = new File("temp.txt");
		if (file.createNewFile()) {
			System.out.println("file is created");
		} else {
			System.out.println("file already exist");
		} 
		
		FileWriter wr = new FileWriter(file);
		
		wr.write("I am writing to the file");
		wr.close();
		
		

	}

}


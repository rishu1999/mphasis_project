package filehandlingdemo;

		import java.io.File;
		import java.io.FileNotFoundException;
		import java.io.FileWriter;
		import java.io.IOException;
		import java.util.Scanner;

		public class Filehandling {

			public static void main(String[] args)  throws IOException {
				Scanner in = new Scanner(System.in);
				
				System.out.print("Enter file name: ");
				String fileName = in.nextLine();
				
				// creating file
				File file = new File(fileName);
				if (file.createNewFile()) {
					System.out.println("file is created with the name " + fileName + "!\n");
				} else {
					System.out.println("file " + fileName + " already exist!" + "\n");
				} 
				
				//write and append to the file.
				
				System.out.println("Write something to append to the file:-");
				Scanner input = new Scanner(System.in);
				String content = input.nextLine();
				
				FileWriter wr = new FileWriter(file, true);
				
				wr.write(content + " ");
				wr.close();
				
				
				// reading from the file
				System.out.println("\nreading file...");
				Scanner read;
				try {
					read = new Scanner(file);
					while(read.hasNextLine()) {
						System.out.println(read.nextLine());
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("\n\nreading file completed!");
				
			

			}

		
	}



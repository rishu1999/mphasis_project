package filehandling;


	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Scanner;

	public class UpdateFile{

		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			File fl = new File("temp.txt");
			
			FileWriter wr = new FileWriter(fl, true);
			
			String content = "adding to the file";
			
			wr.write(" " + content);
			wr.close();
			
			// reading and outputing to the console
			Scanner scan = new Scanner(fl);
			while(scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
			
			

		}


	}



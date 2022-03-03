package filehandling;

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;

	public class Readfile {

		public static void main(String[] args) {
			File f = new File("temp.txt");
			
			Scanner read;
			try {
				read = new Scanner(f);
//				String l = read.nextLine();
//				System.out.println(l);
				while(read.hasNextLine()) {
					System.out.println(read.nextLine());
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
					

		}

	}


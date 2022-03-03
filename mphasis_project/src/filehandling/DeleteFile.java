package filehandling;


	import java.io.File;
	import java.io.IOException;

	public class DeleteFile{

		public static void main(String[] args) {
			
			File fl = new File("test.text");
			
			try {
				if (fl.createNewFile()) {
					System.out.println("file is created");
				} else {
					System.out.println("file already exist");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(fl.delete()) {
				System.out.println("file deleted");
			}
			

		}



	}



package AccessSpecifier;


public class Pubaccessspecifiers {

	public void display() 
    { 
        System.out.println("This is Public Access Specifiers"); 
    } 
}


class accessSpecifiers4 {

	public static void main(String[] args) {
		
		Pubaccessspecifiers obj = new Pubaccessspecifiers(); 
        obj.display();  
		
	}
}
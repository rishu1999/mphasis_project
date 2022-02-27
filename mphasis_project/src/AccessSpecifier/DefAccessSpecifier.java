package AccessSpecifier;


class DefAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
} 

 class accessSpecifiers1 {

	public static void main(String[] args) {
		//default
		System.out.println("Dafault Access Specifier");
		DefAccessSpecifier obj = new DefAccessSpecifier(); 		  
        obj.display(); 

	}
}


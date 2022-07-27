package Myjavaproject;

public class staticdemo {
	
	public static void name () {   // static method without parameters
		String fname="inaya";
		String lname= " sharif";
		System.out.println(  fname+  lname);
	}
	public static void name( String x,String y, int z) {   //static method with parameters
		
	System.out.println(x+y+z);
		
		
		
	}
	public static void main(String[] args) {   //for static method we don't need to create object in main method
		staticdemo.name();                    //call method by class name in main method
		staticdemo.name(" inaya", " sharif > ", 9);
		

	}

	
	
	
	
}

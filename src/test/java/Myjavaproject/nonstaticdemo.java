package Myjavaproject;

public class nonstaticdemo {
	
	public void name() {     // non-static method without parameter
		String fname=" israa ";
		String lname=" sharif ";		
		System.out.println(fname + lname);		
	}
	public void name(String x, String y, int z) { //non-static method with parameter
		System.out.println(x+ y+ z);
	}
	public static void main(String[] args) {
		 nonstaticdemo obj = new  nonstaticdemo(); //first create an object inside main the method
         obj.name();                                //then call method by object name
         obj.name(" israa ", "sharif >", 13);       //for same class create object one time.
         
         
	}

}

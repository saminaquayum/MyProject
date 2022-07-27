package Myjavaproject;

public class returntype {
	// return type method(non-static)
	public int add() { // not void;;;;return type means method could be int,string,double,char.
		int x = 30; //
		int y = 70;
		int z = x + y;
		return z; // must mention "return" keyword
		// for return type we can not systemout here,,have to do it inside main method
	}

	public static int add1() {
		int x = 20;
		int y = 20;
		int p = x + y;
		return p;

	}

	public static void main(String[] args) {
		returntype test = new returntype();
		test.add();
		System.out.println("Result add() = "+test.add()); // for return type systemout here
		returntype.add1();
		
		System.out.println("result add1()="+returntype.add1());
		
		returntype test1 = new returntype();
		test1.add2();

	}

	public void add2() { // regular non static method
		int x = 30;
		int y = 70;
		int z = x + y;
		System.out.println("resulta add2()="+z);

	}

}

package Myjavaproject;

import java.util.HashMap;

public class HashMapgroupstudy {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //HashMap<Integer,String> studentid =new  HashMap<Integer,String>();
		 
//  studentid.put(1,"salina");
//  studentid.put(2," rumana");
//  studentid.put(3, "tasnia");	
//  studentid.put(4,"islam");
//  studentid.put(5,"samina");
//  studentid.put(6,"eva");
//  
//  System.out.println(studentid);
//  studentid.get(1);
//  System.out.println(studentid.get(1));
//  
//	 for(int i:studentid.keySet()){
//     System.out.println(i);
//  
//  }
  HashMap<String,String> studentid =new  HashMap<String,String>();
		studentid.put("1122", "salina");
		studentid.put("2233", "rumana");
		studentid.put("3232", "tasnia");
		studentid.put("1234", "islam");
		studentid.put("5515", "samina");
		studentid.put("1266", "eva");
  System.out.println(studentid.get("1122"));
  for(String j: studentid.keySet()) {
	//System.out.println(j);
	System.out.println("keys:" + j +  "   values:"+ studentid.get(j));
	}
  
  
  
  
}
}

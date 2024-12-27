package com.clone.equal.method;

public class Sample1 {
	int id;
	String name;
	String city;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 sample=new Sample1(); // 1001
		sample.id=101;
		sample.name="ajay";
		sample.city="pune";
		
		Sample1 sample2=new Sample1(); // 1005
		sample2.id=102;
		sample2.name="vinit";
		sample2.city="mumbai";
		
		sample=sample2; //1005 will be assigned to sample-1005
		                     
							//1005==1005
		System.out.println(sample.equals(sample2));

	}

}

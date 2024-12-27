package com.clone.equal.method;

public class Sample {
	int id;
	String name;
	String city;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample sample=new Sample(); // 1001
		sample.id=101;
		sample.name="ajay";
		sample.city="pune";
		
		Sample sample1=new Sample(); // 1005
		sample1.id=102;
		sample1.name="vinit";
		sample1.city="mumbai";
		                     
							//1001==1005
		System.out.println(sample.equals(sample1));

	}

}

package com.clone.methods;

public class Demo implements Cloneable {
	int a;

	@Override
	public String toString() {
		return "Demo [a=" + a + "]";
	}


	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Demo demo1 = new Demo();
		demo1.a = 25;

		System.out.println("First Object data is >>" + demo1.a);

		Object demo2 = demo1.clone();

		System.out.println("Second Object data is>>" + demo2);

	}

}

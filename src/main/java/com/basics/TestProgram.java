package com.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestProgram {

	public static void main(String[] args) throws IOException {

		byte b = 1;
		int c = 1;
		long d = 9087898769l;

		int e = (int) (b + c + d);
		String a = "hello";

		// System.out.println(a+e);
		TestProgram tp=new TestProgram();
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter a value");
		int value1 = Integer.parseInt(obj.readLine());

		System.out.println("Enter a Value Again");
		int value2 = Integer.parseInt(obj.readLine());
		
		
		System.out.println("Enter");
       int number = obj.read();

		System.out.println(number);

		System.out.println("total=" + (value1 + value2));
	}

}

package com.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplyUsingDouble {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enetr a Value one");
		long value1 = Long.parseLong(bf.readLine());

		System.out.println("Enter a value two");
		long value2 = Long.parseLong(bf.readLine());

		System.out.println("Enter a value 3");
		long value3 = Long.parseLong(bf.readLine());

		long output = value1 * value2 * value3;
		System.out.println(output);
	}

}

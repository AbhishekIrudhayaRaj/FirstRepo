package com.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SimpleInterest extends TestProgram{

	public static void main(String[] args) throws NumberFormatException, IOException  {
	
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The  celcius");
        float celcius= Float.parseFloat(bf.readLine());
		
      
	float farenheit=9*celcius/5+32;
	System.out.println("Fareneit :"+farenheit);
	
	String a="hello";
	Scanner sc=new Scanner(System.in);
	BufferedReader bf1=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println(sc instanceof Scanner);
	
	TestProgram tp=new TestProgram();
	SimpleInterest si=new SimpleInterest();
	System.out.println(tp instanceof SimpleInterest);
	
	 
	}

}

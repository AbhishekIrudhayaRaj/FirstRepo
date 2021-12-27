package com.basics;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
Scanner obj =new Scanner(System.in);

System.out.println("Enter any number between 1 to 7");

char a=obj,nextnextChar();

switch(a)
{
case 1: System.out.println("It's Sunday");
		break;
case 2: System.out.println("It's Monday");
		break;		
case 3: System.out.println("It's Tuesday");
		break;
case 4: System.out.println("It's Wednesday");
		break;
case 5: System.out.println("It's Thursday");
		break;		
case 6: System.out.println("It's Fridday");
		break;
case 7: System.out.println("It's Saturday");
		break;
default:System.out.println("Wrong input !! ");		

}

	}
}

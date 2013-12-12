package com.gopu.functioncall;
import java.util.Scanner;


class Main {

	public static void main(String args[])
	{
		//Type 1
		System.out.println("You will see a simple message display");
		Child chld = new Child();
		chld.DisplayMsg();
		
		//Type 2
		String name;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name...");
		name = input.nextLine();
		chld.DisplayName(name);
		
		input.close();
		
		
	}
}

package entity;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner	read = new Scanner(System.in);
		String	input = read.nextLine();
		
		switch(input)
		{
		case	"yes"	:	System.out.println("yes_01"); break;
		case	"Yes"	:	System.out.println("yes_02"); break;
		case	"YES"	:	System.out.println("yes_03"); break;
		default			:	System.out.println("no"); break;
		}
		
		
		read.close();
		return;
	}
}

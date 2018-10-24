package controller;

import java.util.Scanner;

public class ExemploScanner {
public static void main(String [] args) {
	
	Scanner scan = new Scanner(System.in);  
                                                     //reads a whole line	
	System.out.println("Enter your name:");
	String s1 = scan.nextLine();
	System.out.println("Your nrame is: " + s1);
	                                                 //reads only one word
	                                                 //To read the entire name add Line to scan.next
	System.out.println("City name:");
	//String s2 = scan.mext();
	String s2 = scan.nextLine();                     
	System.out.println("City name is: " + s2);
	                                                 //reads an integer
	System.out.println("Enter whole number:");
	int x = scan.nextInt();
	                                                 //reading a double
	System.out.println("Enter double value:");
	double y = scan.nextDouble();
	
	System.out.println("Number are " + x + " and " + y + " and their product is " +(x * y));
	
	scan.close();
	
	System.out.println("The End.");
}
	

}

package com.learning.core.day2seesion1;

	import java.util.Scanner;
	public class MonthName {
	   public static void main(String[] args) {
	       // Array to store month names
	       String[] months = {
	           "January", "February", "March", "April", "May", "June",
	           "July", "August", "September", "October", "November", "December"
	       };
	       Scanner scanner = new Scanner(System.in);
	       int monthNumber;
	       // Prompt user for input and handle invalid input
	       while (true) {
	           System.out.print("Enter a number between 1 and 12: ");
	           if (scanner.hasNextInt()) {
	               monthNumber = scanner.nextInt();
	               if (monthNumber >= 1 && monthNumber <= 12) {
	                   System.out.println("The name of the month is: " + months[monthNumber -1]);
	                   break;
	               } else {
	                   System.out.println("Invalid input.");
	               }
	           } else {
	               System.out.println("Invalid input.");
	               scanner.next(); // Clear the invalid input
	           }
	       }
	       scanner.close();
	   }
	
}

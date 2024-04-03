package com.learning.core.day1session2;
	import java.util.Scanner;
	public class Bingo {
	   public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       // Accepting two numbers from the user
	       System.out.print("Enter two numbers (separated by space) between 1 and 40: ");
	       int num1 = scanner.nextInt();
	       int num2 = scanner.nextInt();
	       // Creating a single-dimensional array of five integer elements ranging from 1 to 40
	       int[] array = {5, 19, 30, 8, 17};
	       // Comparing the input numbers with the array elements
	       boolean foundNum1 = false;
	       boolean foundNum2 = false;
	       for (int i = 0; i < array.length; i++) {
	           if (num1 == array[i]) {
	               foundNum1 = true;
	           }
	           if (num2 == array[i]) {
	               foundNum2 = true;
	           }
	       }
	       // Displaying the result
	       if (foundNum1 && foundNum2) {
	           System.out.println("Bingo");
	       } else {
	           System.out.println("Not found");
	       }
	       scanner.close();
	   }
	}


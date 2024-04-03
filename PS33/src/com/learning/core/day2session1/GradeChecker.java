package com.learning.core.day2session1;

	import java.util.Scanner;
	public class GradeChecker {
	   public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       // Prompt user for input
	       System.out.print("Enter the total marks: ");
	       int totalMarks = scanner.nextInt();
	       System.out.print("Enter the marks obtained: ");
	       int marksObtained = scanner.nextInt();
	       // Calculate percentage
	       double percentage = (marksObtained * 100.0) / totalMarks;
	       // Check the grade based on percentage
	       char grade;
	       if (percentage >= 60) {
	           grade = 'A';
	       } else if (percentage >= 45) {
	           grade = 'B';
	       } else if (percentage >= 35) {
	           grade = 'C';
	       } else {
	           grade = 'F';
	       }
	       // Print the grade
	       System.out.println("The grade is: " + grade);
	       scanner.close();
	   }
	}

package com.gradecalculator;
import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		System.out.println("Enter no.of.subjects: ");
		Scanner sc = new Scanner(System.in);
		int noOfSub = sc.nextInt();
		int totalMarks = 0;
		
		for(int i=1;i<=noOfSub;i++) {
			System.out.println("Enter marks obtained in subject " +i+ " (out of 100): ");
			int marks = sc.nextInt();
			totalMarks+= marks;
			
			
		}
		double averagePercentage = (double)totalMarks/noOfSub;
		   
		 String grade;
	        if (averagePercentage >= 90) {
	            grade = "A+";
	        } else if (averagePercentage >= 80) {
	            grade = "A";
	        } else if (averagePercentage >= 70) {
	            grade = "B+";
	        } else if (averagePercentage >= 60) {
	            grade = "B";
	        } else if (averagePercentage >= 50) {
	        	grade = "C"; 
	        } else {
	        	grade = "U";
	        }
	        
	        System.out.println("\nTotal Marks: " + totalMarks);
	        System.out.println("Average Percentage: " + averagePercentage + "%");
	        System.out.println("Grade: " + grade);
	        
	        
	        
	        
	        
	        
	        
	        
		

	}

}

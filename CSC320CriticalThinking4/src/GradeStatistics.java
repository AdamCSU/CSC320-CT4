/*Colorado State University Global 
#24SD-CSC320-2: Programming 1
#Dr. Douglas Mujeye
#September 15, 2024*/

import java.util.Scanner;

public class GradeStatistics {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = 10;  //number of test scores
		double total = 0;  //total of all test scores
		double maxGrade = 0;  //setting max to 0, max grade should be higher in comparison
		double minGrade = 100;  //setting min to 100, min grade should be higher in comparison
		
		for(int i = 1; i <= count; i++) { 
			System.out.println("Enter grade " + i + ":");  //taking 10 test scores
			while(true) {
				if(scanner.hasNextDouble()) {
					double grade = scanner.nextDouble();
					total = total + grade;
					if(grade > maxGrade) {  //checking if user inputted grade is greater than max if so new max
						maxGrade = grade;
					}
					if(grade < minGrade) {  //checking if user inputted grade is lower than min if so new min
						minGrade = grade;
					}
					break;
				} else {
					System.out.println("Enter a valid number: ");
					scanner.next();
					}
				}
			}
		double gradeAverage = total / count;  //finding out grade average
		
		System.out.println("Average grade: " + gradeAverage);  //printing grade average, max grade, min grade
		System.out.println("Maximum grade: " + maxGrade);  
		System.out.println("Minimum grade: " + minGrade);  
		
		scanner.close();
		}	
	}


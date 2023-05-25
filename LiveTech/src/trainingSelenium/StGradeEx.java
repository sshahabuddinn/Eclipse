package trainingSelenium;

import java.util.Scanner;

public class StGradeEx {

	public static void main(String[] args) {
		
		// To find student grade on given marks
		
		int stMarks;
		String stGrade="";
		
		
		// To read student marks from console\
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student marks");
		stMarks=sc.nextInt();
				
		if(stMarks>=90){
			stGrade="A";
		}
		
		else if (stMarks>=80){
			stGrade="B";
		}
		
		else if (stMarks>=70) {
			stGrade="C";
		}
		
		else {
			
			stGrade="D";
		}
	
	    System.out.println("Student marks are:"+stMarks);
	    System.out.println("Student Grade is:"+stGrade);
	
		}
	
	}

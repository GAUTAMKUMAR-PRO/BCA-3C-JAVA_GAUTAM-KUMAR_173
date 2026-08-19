//Writr A Java Program to Evaluate Student Performance Using If-Else Statements.

import java.util.Scanner;

public class prog7_3{

		public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("enter your score :");
		int score = scn.nextInt();
		
		if(score >=90){
		 System.out.print("outstandin");
		}
		else if(score>=70 && score<=89){
		  System.out.println("average guy");
		}
		else{
		 System.out.println("poor performance");
		}
		}
}

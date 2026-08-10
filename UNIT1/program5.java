//WRITE A JAVA PROGRAM TO GET A DIFFERENT VALUES FROM USER AT RUNTIME USING SCANNER.

import java.util.Scanner;

	class demo{
			
			public static void main(String[] args){
			Scanner scn= new Scanner(System.in);
			
			System.out.print("enter your name:");
			String name = scn.nextLine();
			
			System.out.print("enter your age:");
			int age = scn.nextInt();
			
			System.out.print("enter your percentage:");
			float percentage = scn.nextFloat();
			
			System.out.print("enter you gender:");
			 String gender = scn.next();
			 
			 System.out.println("your entered name is:" + name);
			 System.out.println("your entered age is :" + age);
			 System.out.println("your entered percentage is:" + percentage);
			 System.out.println("your entered gender is :" + gender);
            
		
            
            
			}
			
	}

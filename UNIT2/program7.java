// write a java program of overloading take a input from user?

import java.util.Scanner;

public class program7{
    void sum(int A,int B){
        System.out.println("sum of two numbers A+B"+(A+B));
    }

    void sum(int A,int B,int C){
        System.out.println("sum of three number A+B+C"+(A+B+C));
    }
  
 public static void main(String[]args){
    
Scanner sc=new Scanner(System.in);


System.out.println("enter the first number:");
int A=sc.nextInt();
System.out.println("enter the second number:");
int B=sc.nextInt();
System.out.println("enter the third number:");
int C=sc.nextInt();

program7 obj=new program7();
obj.sum(A,B);
obj.sum(A,B,C);
    }

}





    


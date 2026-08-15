//WRITE A JAVA PROGRAM USE TO IF ELSE CONDOTION//
import java .util.Scanner;
public class pro72 {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);  
        
        System.out.println("enter the youe age:");
        int age=sc.nextInt();
        System.out.println("your age is: " + age);
        if(age>18){

            System.out.println("you are eligible for voting");
        }
            else{

                System.out.println("you are not eligible for voting");



            
        }
    }
    
}

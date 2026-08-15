//write a Java Program to Accept a User's Name and Number and Print a Welcome Message Using a for Loop//
import java.util.Scanner;

public class pro67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Hello, " + name + "!");
        
        System.out.println("enter a number:");
        int n= sc.nextInt();

        System.out.println("the number is:" + n);
        int i ;
        
         for(i=0;i<=n;i++)
            {
            
            System.out.println(i+" welcome "+name);
                    i++;
         }


        }
    }


//write a Java Program to Print Numbers from 0 to N Using do-while Loop//

import java.util.Scanner;
public class pro66 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

      
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int i = 0;

        do{
            System.out.println(i);
            i++;
        }
        while(i <= n);
    }
}


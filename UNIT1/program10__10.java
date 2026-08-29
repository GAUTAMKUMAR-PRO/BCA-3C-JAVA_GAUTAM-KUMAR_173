//WRITE A JAVA PROGRAM OF 1D ARRAY?
import java.util.Scanner;
public class oneDarray{

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int[] marks= new int[5];

        System.out.println("enter 5 elements:");
    
        for(int i=0;i<5;i++){
        marks[i]=sc.nextInt();
        }

        System.out.println("elements of 1D Array");
        for(int i=0;i<5;i++){
            System.out.println(marks[i]);
        }


    
    }
}

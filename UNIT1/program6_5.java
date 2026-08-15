//write a java program to get a number from user and  run a while loop according to given number.
import java.util.Scanner;
public class pro65 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

            int i=0;
            while(i<=n){
                System.out.println(i);
                i++;

            }

        }
    }
    

import java.util.Scanner;

public class studentgrade {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("enter you student s, marks:");
        int marks = sc.nextInt();

        if(marks>=90){

    System.out.println("grade:A+");
    System.out.println("result:pass");
        }

        else if(marks>=80){

            System.out.println("grade:A");
            System.out.println("result:pass");

        }

        else if(marks>=70){
            System.out.println("grade:B+");
            System.out.println("result:pass");
        }
        else if(marks>=60){
            System.out.println("grade:c");
            System.out.println("result:pass");

        }
        else if(marks>=50){
        System.out.println("grade:d");
        System.out.println("result:pass");
        }
        else {
            System.out.println("grade:f");
            System.out.println("result:fail");


        }

        sc.close();
        
    }
    
}

//write a Java Program to Print Pattern 3 (Mirror Pattern)
public class program9_2 {

    public static void main(String[]args){

        int n=8;

        for(int i=2;i<=n;i++){

            for(int j=2;j<=n-i;j++){

                System.out.print("");
            }

            for(int j=1;j<=i;j++){

            System.out.print("*");
            }

            System.out.println();
        }


    }    
}

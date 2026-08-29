//write a java program to print the pattern2.it is a mirror of pattern1?
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

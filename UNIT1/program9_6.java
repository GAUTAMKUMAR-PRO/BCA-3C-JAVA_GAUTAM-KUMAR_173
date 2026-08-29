//write a Java Program to Print Number Pattern
public class program9_6 {
    
    public static void main(String[]args){

    int num=4;

        for(int row=1;row<=5;row++){

            for(int cols=1;cols<=row;cols++){
                System.out.print(num+"");
                num++;
            }

            System.out.println();
            
        }
    }
    
}

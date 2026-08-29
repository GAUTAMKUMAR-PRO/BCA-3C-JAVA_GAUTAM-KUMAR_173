//write a Java Program to Print Reverse Number Pattern
public class program9_8 {
    
    
    public static void main(String[]args){

    

        for(int row=5;row>=1;row--){

            for(int cols=1;cols<=row;cols++){
                System.out.print(cols+"");
                
            }

            System.out.println();
            
        }
    }
    
}

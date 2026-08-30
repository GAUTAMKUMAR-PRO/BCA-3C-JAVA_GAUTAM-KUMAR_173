// write a java program of overloading?
public class program5 {

    void add(int A,int B){

        System.out.println("sum of A+B"+(A+B));
    }
    
    void add(int A, int B,int C){

        System.out.println("sum of A+B+C"+(A+B+C));
    }



    public static void main(String[]args)
    {
        program5 obj=new program5();
        obj.add(20,30);
        obj.add(20,40,60);
    }
 }

 

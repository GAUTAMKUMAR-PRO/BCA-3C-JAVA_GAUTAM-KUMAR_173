// write a java program of overridding?
class A{
    void sum(int A,int B)
{
    System.out.println("sum of A+B"+(A+B));
}

}


class B extends A{

void sum(int A,int B){

    System.out.println("sum of  A+B"+(A+B));


}

}

public class program6{

    public static void main(String[]args){
        B sum=new B();
        sum.sum(40,50);
        sum.sum(50,80);


    }
}

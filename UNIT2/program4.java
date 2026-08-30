//write a java program of addition subtraction multiplication division and modulus using inheritence?
import java.util.Scanner;

class calculation {
    int a,b;
    void add() {

    System.out.println("add="+(a+b));

    }
    


void sub(){

    System.out.println("sub="+(a-b));

}

void multiplay(){

    System.out.println("mul="+(a*b));

}

void divide(){
    System.out.println("divide="+(a/b));
}

void modulus(){
    System.out.println("modulus="+(a%b));
}

}

class operation extends calculation{
    Scanner sc=new Scanner(System.in);

    void datanumber(){
        System.out.println("enter the  number a:");
        a=sc.nextInt();

        System.out.println("enter the  number b:");
        b=sc.nextInt();

    }
}

public class program4{
    public static void main(String[]args){

        operation unit=new operation();
        unit.datanumber();
        unit.add();
        unit.sub();
        unit.multiplay();
        unit.divide();
        unit.datanumber();
        unit.modulus();


    }
}

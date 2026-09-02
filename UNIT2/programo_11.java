// write a java program of encapsulation?

import java.util.Scanner;
public class program11 {
    private String name;

    public void getname() {

        System.out.println(" your name:" + name);

        
    }

    public void setname(String name){
        this.name=name;
    }

    public static void main(String[]args){
        program11 obj=new program11();
        Scanner sc=new Scanner (System.in);
        System.out.println("enter your name:");
        String name=sc.nextLine();
        obj.setname(name);
        obj.getname();
    }

}

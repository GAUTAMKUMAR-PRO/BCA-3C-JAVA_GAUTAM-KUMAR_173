// write a java program of interface?
interface Animal{

    void makesound();
    void run();

}

class Dog implements Animal{
public void makesound(){
    System.out.println("dog barks!");

}

public void run(){
    System.out.println("dog runs fast");
}

}

class Cat implements Animal{

    public void makesound(){
        System.out.println("cat meows meows");
    }
    public void run(){
        System.out.println("cat runs fast");
    }

    }

    public class program16{
        public static void main(String[]args){
            Dog obj=new Dog();
            Cat obj1=new Cat();
            obj.makesound();
            obj.run();
            obj1.makesound();
            obj1.run();
        }
    }

    


// write  a java program using abstract?
abstract class Animal {

    public abstract void Animalsound();

    public void sleep()
    
{

    

    System.out.println("the dog is sleeping");

    System.out.println("Zzzzzzzz");

}

}

class Dog extends Animal

    {

     @Override
    public void Animalsound()
    {
        System.out.println("the dog says:woof woof");
    }

}

public class program10{

    public static void main(String []args)
    {
        Dog obj=new Dog();
        obj.Animalsound();
        obj.sleep();
        
    }

}


//write a java program of hierarchical inheritence?
class Animal {
    void eat()
    {

        System.out.println("dog is eating");
    }

    
}

class Dog extends Animal
{

    void bark()
    {
        System.out.println("dog  is  barking");

    }
}

class Cat extends Animal{
    void play()
    {
        System.out.println("cat is playing");
        }
}

  public class program3{

    public static void main(String[] args) {
         Dog myd=new Dog();
    
       myd.eat();
        myd.bark();

        Cat c= new Cat();
        c.eat();
        c.play();

    }
  }
    



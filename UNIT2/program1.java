//write a java program of single inheritence?
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

  public class program1{

    public static void main(String[] args) {

        Dog d =new Dog();
        d.eat();
        d.bark();

    }
  }

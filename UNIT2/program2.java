//write a java program to multilevel inheritence?
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

class Puppy extends Dog{
    void play()
    {
        System.out.println("puppy is playing");
        }
}

  public class program2{

    public static void main(String[] args) {

        Puppy p =new Puppy();
        p.eat();
        p.bark();
        p.play();

    }
  }
    


// write a java program using super keyword?
class Animal {

    String name = "Animal";

    Animal() {
        System.out.println("Animal constructor called");
    }

    void display() {
        System.out.println("This is Animal class");
    }
}

class Dog extends Animal {

    String name = "Dog";

    Dog() {
        super();
    }

    void display() {
        System.out.println("Child class name: " + name);
        System.out.println("Parent class name: " + super.name);
        super.display();
    }
}

public class program9 {

    public static void main(String[] args) {

        Dog obj = new Dog();
        obj.display();
    }
}

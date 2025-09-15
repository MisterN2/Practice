class Animal {
    public void makeSound() {

    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}


class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}


class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Moo");
    }
}


public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        dog.makeSound();
        cat.makeSound();
        cow.makeSound();
    }
}

abstract class Animal {
    String name;
    int age;

    Animal(String N, int A) {
        this.name = N;
        this.age = A;
    }

    abstract void makeSound();

    public void eat() {
        System.out.println(name + " is eating...");
    }
}

class RobotDog extends Animal {
    String batteryLevel;

    RobotDog(String N, int A, String batteryType) {
        super(N, A);
        this.batteryLevel = batteryType;
    }

    @Override
    void makeSound() {
        System.out.println("Beep! Woof! (Robot Dog sound)");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("RobotDog uses electricity instead of food.");
    }

    void recharge() {
        System.out.println(name + "..........." + batteryLevel);
    }
}


class Animal_Bad {
    String name;

    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class RobotDogBad extends Animal_Bad {
    int batteryLevel;
    void makeSound(String sound) {
        System.out.println(sound);
    }
}


class AnimalB {
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class RobotDogB extends AnimalB {
    @Override
    void makeSound() {
        System.out.println("Beep! Woof! (Robot Dog sound)");
    }
}


public class Main {
    public static void main(String[] args) {
        RobotDog M1 = new RobotDog("Rex", 2, "Lithium");
        M1.makeSound();
        M1.eat();
        M1.recharge();

        System.out.println(" Bad Design Example:");

        Animal_Bad a1 = new Animal_Bad();
        a1.makeSound();

        RobotDogBad d1 = new RobotDogBad();
        d1.makeSound("Beep Beep!");

        System.out.println("Fixed Design Example");
        AnimalB D1 = new RobotDogB();
        D1.makeSound();
    }
}

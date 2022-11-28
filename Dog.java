package task1;

public class Dog extends Animal implements SpeakAble, RunAble, SwimAble{

    public Dog(String name, String breed, String colour, int countLegs, int age) {
        super(name, breed, colour, countLegs, age);
    }

    @Override
    public String speak() {
        return "гав - гав";
    }

    @Override
    public String run() {
        return "50 км/ч";
    }

    @Override
    public String swim() {
        return "4 км/ч";
    }
    
}

package task1;

public class Cat extends Animal implements SpeakAble, RunAble, SwimAble{

    public Cat(String name, String breed, String colour, int countLegs, int age) {
        super(name, breed, colour, countLegs, age);
    }

    @Override
    public String speak() {
        return "мяу - мяу";
    }

    @Override
    public String run() {
        return "50 км/ч";
    }

    @Override
    public String swim() {
        return "2 км/ч";
    }
    
}

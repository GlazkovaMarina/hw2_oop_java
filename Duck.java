package task1;

public class Duck extends Animal implements SpeakAble, FlyAble, RunAble, SwimAble{

    public Duck(String name, String breed, String colour, int countLegs, int age) {
        super(name, breed, colour, countLegs, age);
    }

    @Override
    public String speak() {
        return "га - га - га";
    }
    @Override
    public String fly() {
        return "100 км/ч";
    }

    @Override
    public String run() {
        return "10 км/ч";
    }

    @Override
    public String swim() {
        return "15 км/ч";
    }

    
    
}

package task1;

public class Fish extends Animal implements SwimAble{

    public Fish(String name, String breed, String colour, int countLegs, int age) {
        super(name, breed, colour, countLegs, age);
    }
    @Override
    public String swim() {
        return "12 км/ч";
    }
}

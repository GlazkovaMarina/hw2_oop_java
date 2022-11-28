package task1;

/**
 * Реализовать абстрактный класс Animal и его наследники Cat,
 *  Dog, и прочее. Родитель имеет в себе общие данные 
 * (пример: кличка, количествор лап, какие звуки издают и тд),
 *  а наследники собственные параметры (тип перемещения).
 */
public abstract class Animal{
    protected String name;
    protected String breed;
    protected String colour;
    protected int countLegs; 
    protected int age;

    public Animal(String name, String breed, String colour, int countLegs, int age) {
        this.name = name;
        this.breed = breed;
        this.colour = colour;
        this.countLegs = countLegs;
        this.age = age;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getCountLegs() {
        return countLegs;
    }

    public void setCountLegs(int countLegs) {
        this.countLegs = countLegs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return getName();
    }
}
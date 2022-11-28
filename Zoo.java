package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
    private List<Animal> animals; 
    public Zoo(){
        animals = new ArrayList<>(Arrays.asList(
        new Cat("Barsik", "vislaux", "black", 4, 6),
        new Dog("Sedi", "ratviler", "brown", 4, 2), 
        new Fish("Nemo", "polosatik", "yellow", 0, 1),
        new Duck("Du", "black", "black", 2, 2)
                                                ));

    }
    public void talk(){
        for (SpeakAble animal : getSpeakAbles()) {
            System.out.printf("%s; %s \n", animal.toString(), animal.speak());
        }
    }
    public List<SpeakAble> getSpeakAbles(){
        List<SpeakAble> result = new ArrayList<>();
        for (Animal speakItem: animals) {
            if (speakItem instanceof SpeakAble){
                result.add((SpeakAble)speakItem);
            }
        }
        result.add(new Radio());
        return result;
    }

    public List<RunAble> getRunAbles(){
        List<RunAble> result = new ArrayList<>();
        for (Animal runItem: animals) {
            if (runItem instanceof RunAble){
                result.add((RunAble)runItem);
            }
        }
        return result;
    }

    public List<FlyAble> getFlyAbles(){
        List<FlyAble> result = new ArrayList<>();
        for (Animal flyItem: animals) {
            if (flyItem instanceof FlyAble){
                result.add((FlyAble)flyItem);
            }
        }
        return result;
    }
    public List<SwimAble> getSwimAbles(){
        List<SwimAble> result = new ArrayList<>();
        for (Animal swimItem: animals) {
            if (swimItem instanceof SwimAble){
                result.add((SwimAble)swimItem);
            }
        }
        return result;
    }

    public void run(){
        for (RunAble animal : getRunAbles()) {
            System.out.printf("%s; %s\n", animal.toString(), animal.run());
        }
    }
    public void fly(){
        for (FlyAble animal : getFlyAbles()) {
            System.out.printf("%s; %s\n", animal.toString(), animal.fly());
        }
    }
    public void swim(){
        for (SwimAble animal : getSwimAbles()) {
            System.out.printf("%s; %s\n", animal.toString(), animal.swim());
        }
    }
}

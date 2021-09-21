package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    private final Animal animal;

    public AnimalsCage(@Qualifier("Dog") Animal animal) {
        this.animal = animal;
    }

    @Autowired
    private Timer timer = new Timer();

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(this.timer.getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return this.timer;
    }
}

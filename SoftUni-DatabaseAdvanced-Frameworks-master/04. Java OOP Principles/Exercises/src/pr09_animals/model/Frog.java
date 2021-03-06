package pr09_animals.model;

import pr09_animals.constants.Constants;

public class Frog extends Animal {

    public Frog(String name, int age, String gender, String type) {
        super(name, age, gender, type);
    }


    @Override
    public String produceSound() {
        return Constants.FROG_SOUND;
    }
}

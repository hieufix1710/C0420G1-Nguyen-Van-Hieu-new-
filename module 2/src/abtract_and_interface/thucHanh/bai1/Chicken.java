package abtract_and_interface.thucHanh.bai1;

public class Chicken extends Animal implements Idible {

    @Override
    public String makeSound() {
        return "Chick Chick";
    }

    @Override
    public String howToEat() {
        return "Chicken eating by mount :D";
    }
}

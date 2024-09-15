package Abstraction;

public class Bently extends Gadi {

    public Bently() {
        super(4); // So we have initialized a parameterized constructor in the parent class and so
                          // to inherit the responsibility the child class has to call the constructor and to do that we use super()
    }

    @Override
    public void makesound() {
        System.out.println("Grrrrrrr...wroom wroom wrooooom ratatata");
    }

    @Override
    public void getsetgo() {
        System.out.println("Wooho, damn the power of the car is hell good");
    }
}

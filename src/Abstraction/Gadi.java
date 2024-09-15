package Abstraction;

public abstract class Gadi implements Transport {
    private int nooftires;
    public abstract void makesound(); // abstract method
    public Gadi(int nooftires){
        this.nooftires = nooftires;
    }

    public int getNooftires(){
        return nooftires;
    }

    public void commute(){
        System.out.println("Mai toh chala gadi leke");
    }
}

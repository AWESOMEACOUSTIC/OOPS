package Abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
        //Gadi car = new Gadi(4);  // after making gadi a abstract class we can't make objects
        Bently bent = new Bently();
        bent.makesound();
        bent.commute();

        // Parent class declaring some responsibilites are known as abstract methods
    }

}

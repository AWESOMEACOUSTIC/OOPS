package Inheritance;

public class execute_vechile {
    public static void main(String[] args) {
        Vechile veh = new Vechile();
        twowheeler bike = new twowheeler();
        veh.community();
        bike.community();
        bike.balance();
        luna_bajaj luna = new luna_bajaj();
        luna.community();
        luna.balance();
        luna.start();
    }
}

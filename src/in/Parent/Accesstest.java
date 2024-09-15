package in.Parent;

public class Accesstest {
    public static void main(String[] args) {
        car car = new car();
        car.color = "red";
        car.model = "Swift";
        car newcar = new  car("Black", "BMW",1, 120000);
        System.out.println(newcar);
        System.out.println(car);
    }
}

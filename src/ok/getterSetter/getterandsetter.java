package ok.getterSetter;
import in.Parent.Packages;
public class getterandsetter {
    public static void main(String[] args) {
        Packages std = new Packages();
        // Student code
        std.registration = "22BCT0043";
        std.Name = "Aesh";
        std.degree = "B.Tech";
        String store = std.getinfo();
        System.out.println("Registration Number: "+ store);
        Packages student = new Packages();
        student.setinfo("22bci0185", "Gourav", "InfoSec", 8.71, 662,0);
        System.out.println(student);

        // Bank code
        Packages bank = new Packages(2478321, 2272.12, "22PKO2123K1993");
        System.out.println(bank);
        bank.withdraw(400);
        bank.deposit(9212);
        System.out.println(bank);
    }
}

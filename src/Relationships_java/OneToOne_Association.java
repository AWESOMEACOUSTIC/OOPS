package Relationships_java;

class Passport{
    private String passportNumber;

    public Passport(String passportNumber){
        this.passportNumber = passportNumber;
    }

    public String getPassport(){
        return this.passportNumber;
    }
}

class Student{
    private String name;
    private Passport passport;

    public Student(String name, Passport passport){
        this.name = name;
        this.passport = passport;
    }

    public void getDetails(){
        System.out.println("Student Name: " + this.name);
        System.out.println("Passport Number: " + passport.getPassport());
    }
}

public class OneToOne_Association {
    public static void main(String[] args) {
        Passport passport = new Passport("7881K89IOA5");
        Student std = new Student("Aditya", passport);
        std.getDetails();
    }
}

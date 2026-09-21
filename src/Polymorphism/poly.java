package Polymorphism;


class Parent{
    int a;
    int b;

    void add(int a, int b){
        System.out.println("The sum is " +  a + " & " + b);
    }
    void add(double a, double b){
        System.out.println("The sum is " +  a + " & " + b);
    }
    void add(double a, float b, int c){
        System.out.println("The sum is " +  a + " & " + b + " or " + c);
    }

    static void printName(String name){
        System.out.println("hey, " + name);
    }
}

class child extends Parent{
    @Override
    void add(int a, int b){
        System.out.println("Hey this is a method override");
    }
//    @Override
//    void printName(String name){
//        System.out.println("hello, " + name + " how are ya? ");
//    }
    // so a child class cannot override its parents static method
}

public class poly {
    public static void main(String[] args){
        Parent ob1 = new Parent();
        // This is where compile time polymorphism takes place
        // as it understand in compile time when to invoke which method
        ob1.add(2,3);
        ob1.add(8.78, 6.31);
        ob1.add(9.01, 3.21f, 8);
        // after all the static binding, it is converted into byte code by java compiler

        // now the byte code is executed by jvm, -> class loading appears
        // Just in time execution takes place where the byte code is converted into native machine code of hardware
        // dynamic binding

        child ob_ch1 = new child();
        ob_ch1.add(8,8); // this is where dynamic binding happens when it takes time to understand which method is being called
        // where inheritance and overriding happens
        // after dynamic binding the program execution happens and then the memory management where garbage collector come into the picture
    }
}



package Java_InnerClasses;

/*
* To call the inner class, first we need to tie it up with the instance of the outer class
* so it is tied to the instance of the outer class
* It can access all because the outer instance is also invoked giving access to all
*/


class outer{
    public static int val = 10;
    public String name = "adi";

    class Inner{
        public void execute(){
            System.out.println("Non Static inner class is executed " + val + " and " + name);
        }
    }
    public void execute(){
        System.out.println("This is the outer class");
        Inner innerclass = new Inner();
        innerclass.execute();
    }
}

public class nonStatic_innerClass {
    public static void main(String[] args) {
        outer.Inner example = new outer().new Inner();  // first it will take the outer class object then inner class object to initialize an instance of inner class
        example.execute();
    }
}

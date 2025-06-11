package Java_InnerClasses;

/*
* class defined inside a method or a block
* can access all of the outer but effectively final local variables of the method
* */

class Bahar{
    public int val = 10;
    public String name = "Avengers";

    public void execute(){
        final int x = 19;
        class andar{
            public void execute(){
                System.out.println("I am the inner class " + x); // can access effectively final variable only
                System.out.println("count: " + val); // it is accessible and we can even update the value
            }
        }
        val += 10;
        andar innerEx = new andar();
        innerEx.execute();
    }
}

public class local_innerClass {
    public static void main(String[] args) {
        Bahar outerEx = new Bahar();
        outerEx.execute();
    }
}

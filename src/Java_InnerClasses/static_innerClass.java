package Java_InnerClasses;

/*
Definition: Any class that is defined inside another class
Types: Static nested inner class, Non-static inner class, Local Inner Class, Anonymous Class
*/

/*
point-1 -> Static Inner Class -> uses static keyword
point-2 -> It can access only static members of the class
point-3 -> It requires the instance of the innerclass to execute it's method from the outerclass
*/
class outerClass{
    static int val = 10;
    String name = "AESH";

    static class inner{
        public void execute(){
            System.out.println("The inner class is executed " + val); // satisfies point-1
            // here we cannot access name variable because it is non-static member.
        }
    }

    public void execute(){
        inner ex = new inner();  // point-3 satisfies
        ex.execute();
    }
}


public class static_innerClass {
    public static void main(String[] args) {
        outerClass.inner innerVar = new outerClass.inner();
        innerVar.execute(); // satisfies point 2

        outerClass outerVar = new outerClass();
        outerVar.execute();
    }
}

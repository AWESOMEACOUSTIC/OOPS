package try_catch;
import java.util.Scanner;
public class exc1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number a: ");

        try{
            int a = input.nextInt();;
            System.out.println("Enter number b: ");
            int b = input.nextInt();
            int[] c = new int[5];
            int divide = a/b;
            c[6] = a/b;
            System.out.printf("Result is %d",c[6]);
            System.out.println("Result :" + divide);
        }
        catch (NumberFormatException | ArithmeticException exception){
            System.out.println(exception.getMessage() + ", enter valid number");
        }
        catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Array is out of bound");
        }
        catch(Throwable th){
            System.out.printf("%s, General Exception",th.getMessage());      // It is the exception other than the mentioned exception mentioned or initialized above
            throw th;
        }                                                   // Let just say if an exception occured while giving the input then it will print the general exception
    }
}

/*
Types of Exception
Java Defined Exception                    Build-in Exception [Existing Exceptions]
                                          Checked Exceptions        Unchecked Exceptions
Checked Exceptions : Generally exception is occured  and must be handled
Unchecked Exceptions the can or cannot be handled. That's your choice whether you want to handle the exception or not


Two Keywords : Throw and Throws
Throws : Used in the method signature to indicate that the method might throw exceptions of specified types
         Method may throw multiple exceptions
         A method declared with throws requires the calling method to handle

public void printName (String name)
    throws IllegalArgumentException {   --> Throws can be declared with any of the exception (checked or unchecked exception)
        if (name.contains("-")) {
            throw new IllegalArgumentException("Name contains -");
        }
        System.out.println(name);
}

Throw : Used to explicitly throw an exception from any method or block of code
        You can throw either a new instance pf an exception or an existing exception object using throw.
        By using throw, you cannot throw more than one exception.

void teachClass() throws BookNot FoundException {
    boolean bookFound = locateBook();
    if (!bookFound)
        throw new BookNot FoundException();  --> Exception object
    else {
        readBook();
        explainContents();
    }
}


 */

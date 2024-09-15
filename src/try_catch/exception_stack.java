package try_catch;
import java.util.Scanner;

public class exception_stack {
    public static void main(String[] args) {
        a();
    }
    private static void a(){
        b();
    }
    private static void b(){
        c();
    }
    private static void c(){
        d();
    }
    private static void d(){
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
        }
    }
}

// main() -> a() -> b() -> c() -> d()
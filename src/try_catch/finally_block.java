package try_catch;

public class finally_block {
    public static void main(String[] args) {
        try{
            try{
                int result = 1/0;
            }
            catch(Throwable t){
                System.out.println("Something caught");
            }
            finally{
                System.out.println("Finally will always be printed regardless of try-catch");
            }
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        finally {
            System.out.println("Finally");
        }
    }
}


/*

Executes code after try-catch blocks, used mainly for cleanup operations.
Always run regardless of whether an exception is thrown or caught in the try-catch block
Ideal for closing resources like files or database connections to prevent resource leak

*/
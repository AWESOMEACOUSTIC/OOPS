package try_catch;

public class custom_exceptions extends Exception {
    private double degrees;
    public custom_exceptions(double degrees){
        this.degrees = degrees;
    }
    public String getMessage(){
        return "This temperature (" + degrees + "C) isn't in the normal range.";
    }
    public double getDegrees(){
        return degrees;
    }

    public static void main(String[] args) {
        custom_exceptions deg = new custom_exceptions(5.44);
        System.out.println(deg.getMessage());
        System.out.println(deg.getDegrees());
    }
}


// custom exceptions are user-defined exception classes that extend either exception(for checked exceptions) or runtime exception(for unchecked exceptions).
// They are created to represent specific error conditions relevant to an application.
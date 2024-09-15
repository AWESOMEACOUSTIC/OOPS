package try_catch;

public class ques1 {
    public static void main(String[] args) {
        int[] numerators = {10, 200, 30, 40};
        int [] denominators = {1, 2, 0, 4};
        for(int i = 0; i<numerators.length; i++){
            System.out.println(divide(numerators[i], denominators[i]));
        }
        System.out.println("Sabas");
    }
//    public static int divide(int a, int b){
//        return a/b;
//    }
// will give run-time error
// No problem in compilation cause the code is working but when it processes the 30/0 will crashed and due to this will give runtime error

    public static int divide(int a, int b){
        try{
            return a/b;
        }catch (ArithmeticException e){  // it throws an exception as a object in the runtime
            System.out.println(e);
            return -1;
        }
    }
}

//Every class that we make extends a default object class which calls toString method
package Collections_And_Generics;

public class Variable_Arguments {
    public static void main(String... args) {
      //  System.out.println(sum(4,5));
       // System.out.println(sum(new int[]{5,6}));
        System.out.println(sum(4,5,6)); //The first two numbers must be init
        System.out.println(sumati()); // valid
        System.out.println(sumati(6,7,8,9)); //var args
    }

    public static int sumati( int... a){
        int sum =0;
        for (int i : a){
            sum+=i;
        }
        return sum;
    }
    public static int sum( int first, int second, int... a){
        int sum =0;
        for (int i : a){
            sum+=i;
        }
        return sum;
    }


//    public static int sum(int[] a){
//        int sum =0;
//            for (int i : a){
//                sum+=i;
//            }
//        return sum;
//    }
//
//
//    public static int sum(int a, int b){
//        return a+b;
//    }
}


/*
* Var args allow methods to accept any number of arguments.
* Declared using an ellipsis(...)
* Must be the last in the method's parameters
* */
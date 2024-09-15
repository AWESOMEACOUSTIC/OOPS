package in.Parent;

import java.lang.reflect.Array;

public class Arrayoperaions {
    private int[] numbers;

    public Arrayoperaions(int[] numbers){
        this.numbers = numbers;
    }

    public static void main(String[] args) {
        Arrayoperaions arr = new Arrayoperaions(new int[]{1,3,4,5,7});
      //  Arrayoperaions.Statistics stats = new Arrayoperaions.Statistics();  --> It will show errors because statistics is a inner class
        // Statistics class refers to the outer class's objects, so we will refer it to the outer objects name to access the Statistics class
        Arrayoperaions.Statistics stats = arr.new Statistics();
        System.out.println(stats.mean());
    }
    private  class Statistics{
        double mean(){
            double sum = 0;
            for(int number : numbers){
                sum += number;
            }
            return sum/numbers.length;
        }
        double median(){
            return 0;
        }
    }
}

package Collections_And_Generics.Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class List_Interface {
    public static void main(String[] args) {
        // Declaring a List
        ArrayList  strList = new ArrayList<>(); // any type of objects can be added to the list
        ArrayList<String> empty = new ArrayList<>(); // Now it will store only string types
        // append
        strList.add("Aditya"); // <> is a generic and compile time
        strList.add("Aesh");
        strList.add("Yash");
        strList.add("Sushi");
        strList.add(0,"Panigrahy");  // to add in the middle of the list
        System.out.println(strList.get(0)); // to get the value from the list -> .get(index value)
        strList.remove(1); // to remove element from the list
        for(int i =0; i< strList.size();i++){
            System.out.println(strList.get(i));
        }
        if(strList.contains("Aesh")){
            System.out.println("Aesh exsits"); // checks if the mentioned value is present in the lists or not

        }
        for(String emp : empty){
            System.out.println(emp);
        }
    }
}

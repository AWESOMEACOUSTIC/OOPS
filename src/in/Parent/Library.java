package in.Parent;

public class Library {
    private String itemid;
    private String title;
    private String author;

    public void checkout(){
        System.out.println("Checkout");
    }
    public void returnitem(){
        System.out.println("Returning the item");
    }
}

package Netflix;


class User{
    String userName;
    String email;
    int maxScreen;

    // Default constructor when incomplete user signup
    public User(){
        this.userName = "Guest";
        this.email = "guest@streaming.com";
        this.maxScreen = 1;
        System.out.println("A default user with username " + this.userName + " was created having an email " + this.email);
    }

    // Parameterized constructor when successful signup
    public User(String userName, String email, int maxScreen){
        this.userName = userName;
        this.email = email;
        this.maxScreen = maxScreen;
    }

    // Constructor overloading and chaining when user sign in through OAuth
    public User(String userName, String email){
        this(userName, email, 2);  // constructor chaining using this keyword
    }

    // copy constructor means create a new object using existing user's data
    public User(User exisitingUser){
        this.userName = exisitingUser.userName + "_sub";
        this.email = exisitingUser.email;
        this.maxScreen = exisitingUser.maxScreen + 1;
    }
}

class SecuredUser{
    private String email;
    private String planType;
    public boolean isActive;
    protected int walletBalance;

    public SecuredUser(String email, String planType){
        this.email = email;
        setPlan(planType);
        this.isActive = true;
        this.walletBalance = 0;
    }

    public String getPlanType(){
       return this.planType;
    }

    public void setPlan(String planType){
        if(planType.equals("basic") || planType.equals("pro") || planType.equals("ultra")){
            this.planType = planType;
        }else{
            throw new IllegalArgumentException("Invalid Plan Selected");
        }
    }

}

interface downloadable{
    public void download();
}

abstract class BaseContent{
    protected String title;
    protected int duration;

    public BaseContent(String title, int duration){
        this.title = title;
        this.duration = duration;
    }

    public abstract String getContentType();

    public void play(){
        System.out.println("buffering " + this.title );
    }

    public void stop(){
        System.out.println("Movie is stopped playing");
    }
}

// single inheritance
class Movie extends BaseContent implements downloadable{
    private boolean hasEndedCreditSequence;

    public Movie(String title, int duration, boolean hasEndedCreditSequence){
        super(title, duration);
        this.hasEndedCreditSequence = hasEndedCreditSequence;
    }

//    method overloading
    public void play(boolean hasEndedCreditSequence){
        if(hasEndedCreditSequence){
            System.out.println("The credit sequence has ended");
        }else{
            System.out.println("The credit sequence is yet to end");
        }
    }

    @Override
    public String getContentType(){
        return "Movie";
    }

    @Override
    public void download(){
        System.out.println(this.title
                + " is being downloaded for offline viewing");
    }
}

// Hierarchical Inheritance
class LiveSport extends BaseContent{
    protected int liveScore;
    public LiveSport(String title, int liveScore){
        super(title, 0);
        this.liveScore = liveScore;
    }

    @Override
    public String getContentType(){
        return "Live Sport";
    }
}

public class streaming {
    public static void main(String[] args) {
        User admin = new User("aditya", "adityapanigrahy@gmail.com", 2);
        User brother_admin = new User(admin);

        SecuredUser basicUser = new SecuredUser("basic@example.com", "basic");

        //this is called upcasting which means the reference type is BaseContent but the object type is Movie. So the compiler will allow
        // to access variables and methods that exist in BaseContent, it will not allow you to access variables and methods of Movie
        BaseContent movie = new Movie("sholay", 89, true);

        // Here the reference type and object type is same that means you can access variables and methods from both parent and child class
        Movie movie_ag = new Movie("igloo", 90, false);
        // movie.play(true); -> will give error
        // movie.play() -> it will run
        // movie_ig.play() and movie_ig.play(true) both will work

        downloadable dl = (Movie) movie; // interface reference
        dl.download();

    }
}

/*
* Most Important Interview Question
* Is Java a fully object-oriented program? If not state your reason
* No java is not a fully object-oriented program because
* 1. It has primitive types that are not objects
* 2. It supports static variables and methods which means they belong to class but not to the object
* 3. The driver class main also has static method so every java application starts using a static method\
* JVM calls main without creating an object
* */
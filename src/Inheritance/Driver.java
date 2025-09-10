package Inheritance;

/**
 * The Car class demonstrates encapsulation and abstraction.
 * Encapsulation is achieved by making the data fields (isEngineOn, speed) private
 * and providing public methods (startEngine, accelerate) to interact with them.
 * Abstraction is achieved because the user only needs to call accelerate()
 * without knowing the complex internal logic it hides (like increaseFuelFlow).
 */
class Car {

    // 1. ENCAPSULATION: Data is private and bundled with methods.
    private boolean isEngineOn;
    private int speed;

    // Public methods provide controlled access to the private data.
    public void startEngine() {
        this.isEngineOn = true;
        System.out.println("Engine started.");
    }

    /**
     * 2. ABSTRACTION: This method provides a simple way to accelerate
     * without exposing the underlying complex operations.
     */
    public void accelerate(int amount) {
        if (isEngineOn) {
            // Complex internal logic is hidden from the user.
            increaseFuelFlow();
            adjustSparkTiming();
            this.speed += amount;
            System.out.println("Car is moving at " + this.speed + " km/h.");
        } else {
            System.out.println("Please start the engine first.");
        }
    }

    // These private methods are part of the hidden implementation details.
    private void increaseFuelFlow() {
        // In a real car, this would contain complex logic.
        // For this example, we can add a simple print statement.
        System.out.println("-> Internal: Fuel flow increased.");
    }

    private void adjustSparkTiming() {
        // In a real car, this would contain complex logic.
        // For this example, we can add a simple print statement.
        System.out.println("-> Internal: Spark timing adjusted.");
    }

    // A "getter" method to allow read-only access to the speed.
    public int getSpeed() {
        return this.speed;
    }
}

/**
 * The Driver class contains the main method to run the program.
 * This is the entry point of the application.
 */
public class Driver {
    public static void main(String[] args) {
        // Create an instance of the Car class.
        Car myCar = new Car();

        // The driver interacts with the simple, abstract interface.
        // They don't know or care about fuel flow or spark timing.
        myCar.startEngine();
        myCar.accelerate(50);
    }
}

// Example of constructor modifiers in Java

// Public class
public class Main {
    // Public constructor - accessible from anywhere
    public Main() {
        System.out.println("Public constructor called");
    }
    
    // Private constructor - only accessible within this class
    private Main(int x) {
        System.out.println("Private constructor called with: " + x);
    }
    
    // Protected constructor - accessible within package and subclasses
    protected Main(String s) {
        System.out.println("Protected constructor called with: " + s);
    }
    
    // Default/package-private constructor - accessible only within package
    Main(double d) {
        System.out.println("Default constructor called with: " + d);
    }
    
    // Example of using a private constructor (Factory pattern)
    public static Main createInstance() {
        return new Main(42); // Using private constructor internally
    }
    
    public static void main(String[] args) {
        // Public constructor
        Main obj1 = new Main();
        
        // Private constructor - accessed via factory method
        Main obj2 = Main.createInstance();
        
        // Protected constructor
        Main obj3 = new Main("test");
        
        // Default constructor
        Main obj4 = new Main(3.14);
    }
}
public class Main{

    // Instance variable
    int a = 100;
    // Static variable
    static int b = 200;

    int num1 = 1;
    static int num2 = 2;
    public static void main(String[] args){
        //  Internal (or) primitive variable - These are variables that store simple values directly, such as int, double, char, boolean.
        //  Referenced variables - These variables store references (addresses) to objects, not the actual object data. Example : String,Array. 

        // Instance Variables 
        /*
            1.Declares inside the class and outside the main method.
            2.Instance variable stores in the heap memory -> while accessing we need to create object so stores in the heap memory.
            3.Default values for this variables are provided by JVM.
            4.Accessed via objects only.
            5.Instance variables are object level variables. 
        */
        // Static variables
        /*
            1.JVM provides the default variables.
            2.Memory is assigned to this variables when the class loades.
            3.Static variables stores in the stack memeory we dont need to create the objects.
            4.Accessed via 3 ways but preferable way is via class.
                I. ClassName.variable_name
                II. ObjectName.varable_name
                III. variable_name
            5.Static variables are class level variables.  
        */
        // Local variables (or) Block level variables
        /*
            1.JVM doesn't provide the default variables.
            2.Stores in stack memory.
            3.Local variables are block level varibles (They can accessed only inside the block which we declared)
        */

        // Accessing the Instance variable
        // Firstly, we need to create the object to the class where the variable presents.

        // System.out.println(a);  // Cannot make a static reference to the non-static field "a"
        Main obj = new Main();
        System.out.println(obj.a); // Output:100

        // Acessing Static variables
        // we can access the static variable without creating objects.
        System.out.println(b);      // Directly accessing with out any reference
        System.out.println(Main.b); // Accessing via class name
        Main obj1 =  new Main(); 
        System.out.println(obj1.b);  // Accessing via object

        // Block level Elements

        if(true){
            int x = 180;
            System.out.println(x);
        }
        // System.out.println(x);   // x cannot be resolved to a variable

        System.out.println("--------------------------------------");
        Main obj2 = new Main();
        System.out.println("Before Reassigning => num1 : "+ obj2.num1 + " & num2 : " + obj2.num2);
        obj2.num1 = 10;
        obj2.num2 = 20;
        System.out.println("After Reassigning => num1 : "+ obj2.num1 + " & num2 : " + obj2.num2);
        Main obj3 = new Main();
        // Static varible value copied from the above obj2 
        // Instance variable values are varies when we create the new object 
            // Reason -> Static variables objects doesn't creted every time.
        System.out.println("After Reassigning => num1 : "+ obj3.num1 + " & num2 : " + obj3.num2);
    }
}
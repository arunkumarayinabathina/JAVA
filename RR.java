// // Java code to illustrate usage of super()
 
// class Parent {
//     Parent()
//     {
//         System.out.println("Parent class's No " + 
//                               " arg constructor");
//     }
// }
 
// class Child extends Parent {
//     Child()
//     {
//         super();
//         System.out.println("Flow comes back from " + 
//                         "Parent class no arg const");
//     }
//     public static void main(String[] args)
//     {
//         new Child();
//         System.out.println("Inside Main");
//     }
// }



// Java program to illustrate usage of
// this() as first statement
 
class RR {
    RR()
    {
        // Uncommenting below line causes compilation
        // error because this() should be first statement
        // System.out.println("Compile Time
        // Error");
        this(51);
        System.out.println(
            "Non param");
    }
    RR(int k)
    {
        System.out.println("RR class's 1 arg const");
    }

    public static void main(String[] args)
    {
        new RR();
        System.out.println(" Inside main & quot;");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Java Primitive Data Types and Their Ranges");
        System.out.println("==========================================");
        
        // 1. byte - 8-bit signed integer
        // Range: -128 to 127 (-2^7 to 2^7-1)
        byte byteValue = 100;
        System.out.println("byte: " + byteValue);

        // 2. short - 16-bit signed integer
        // Range: -32,768 to 32,767 (-2^15 to 2^15-1)
        short shortValue = 25000;
        System.out.println("short: " + shortValue);

        
        // 3. int - 32-bit signed integer
        // Range: (-2^31 to 2^31-1)
        int intValue = 1000000;
        System.out.println("int: " + intValue);
        
        // 4. long - 64-bit signed integer
        // Range: (-2^63 to 2^63-1)
        long longValue = 123456789012345L;
        System.out.println("long: " + longValue);

        
        // 5. float - 32-bit floating point
        // Range:after decimal point we can kept only upto 6 decimal points
        float floatValue = 3.14159f;
        System.out.println("float: " + floatValue);

        // 6. double - 64-bit floating point
        // Range: we can keep above 6 decimal digits
        double doubleValue = 3.141592653589793;
        System.out.println("double: " + doubleValue);
        
        // 7. char - 16-bit Unicode character
        char charValue = 'A';
        System.out.println("char: " + charValue);

        
        // 8. boolean - true or false
        // Range: true or false (no numerical range)
        boolean booleanValue = true;
        System.out.println("boolean: " + booleanValue);



        // Variable Naming Rules in Java
        System.out.println("\nVariable Naming Rules in Java");
        System.out.println("==============================");
        
        // 1. Can contain letters, digits, underscore (_) and dollar sign ($)
        int validName123 = 100;
        int _startWithUnderscore = 200;
        int $startWithDollar = 300;
        
        // 2. Must begin with a letter, underscore (_) or dollar sign ($)
        // int 1invalidName = 100; // Invalid - cannot start with a digit
        
        // 3. Cannot use reserved keywords as variable names
        // int class = 100; // Invalid - 'class' is a reserved keyword
        
        // 4. Case sensitive - 'count' and 'Count' are different variables
        int count = 1;
        int Count = 2;
        
        // 5. No length limit, but should be meaningful and not too long  below 15 chars
        int thisIsAVeryLongButStillValidVariableName = 500;
        
        // 6. camelCase for variables 
        int camelCaseExample = 10;
    }
}

package operators;

public class Main{
    // Static variables
    static int a = 10;
    static int b = 2;
    // Instance variables
    int c =  40;
    public static void main(String[] args){
        //  Arithematic operators 
        // [ + , - , * , / , %]
        int add = a + b;
        System.out.println(add);
        int sub = a - b;
        System.out.println(sub);
        int multi = a * b;
        System.out.println(multi);
        int quo = a/b;
        System.out.println(quo);
        int rem = a % b;
        System.out.println(rem);

        // Assignement operators 
        // [ = , += , -= , *= , /= , %= ]
        Main obj = new Main();
        obj.c = 50;
        System.out.println(obj.c);
        System.out.println(obj.c+=10);
        System.out.println(obj.c-=30);
        System.out.println(obj.c*=2);
        System.out.println(obj.c/=2);
        System.out.println(obj.c%=2);

        // Conditional or Comparison operators 
        // [ > , < , <= , >= , != , == ]
        if(true){
            int num1 = 30;
            int num2 = 40;
            // Block level variables
            System.out.println(num1<num2);
            System.out.println(num1>num2);
            System.out.println(num1<=num2);
            System.out.println(num1>=num2);
            System.out.println(num1>=num2);
            System.out.println(num1!=num2);
            System.out.println(num1==num2);
        }
        // Logical oeprators
        // [ && , || , ! ]
        int num1 = 100;
        int num2 = 200;

        System.out.println(num1<num2 && num1 == num2);
        System.out.println(num1<num2 || num1 == num2);
        System.out.println(!(num1<num2));


        // Bitwise operators
        // [ & , | , ^ , >> , << ]
        int n1  = 5;
        int n2 = 3;
        System.out.println(n1&n2);
        // Explanation   
        //  f -  8 4 2 1  => Binary conversion 
        //  5 -  0 1 0 1 
        //  3 -  0 0 1 1
        //  r -  0 0 0 1  => 1  { 1&1 - true , 0&0 = false , 0&1 = false , 1&0 = false }
        System.out.println(n1|n2);
        // Explanation
        //  f -  8 4 2 1  => Binary conversion 
        //  5 -  0 1 0 1 
        //  3 -  0 0 1 1
        //  r -  0 1 1 1  => 7  { 1&1 - true , 0&0 = false , 0&1 = true , 1&0 = true }
        System.out.println(n1^n2);
        // Explanation
        //  f -  8 4 2 1  => Binary conversion 
        //  5 -  0 1 0 1 
        //  3 -  0 0 1 1
        //  r -  0 1 1 0  => 6  { 1^1 = 0 , 0^0 = 0 , 0^1 = 1 , 1^0 = 1 }
        
        System.out.println(n1 >> 1);  // 5 >> 1 = 2
        // Explanation
        // 5 in binary:  0 1 0 1
        // Shift right:  0 0 1 0  => 2 (each bit moves right by 1 position, rightmost bit is discarded)
        
        System.out.println(n1 << 1);  // 5 << 1 = 10
        // Explanation
        // 5 in binary:  0 1 0 1
        // Shift left:   1 0 1 0  => 10 (each bit moves left by 1 position, leftmost bit is discarded)
        
        // Unary operators 
        // [ ++ , -- ]
        int temp1 = 200;
        System.out.println(temp1++); // o/p - 200  and increases by 1 
        System.out.println(++temp1); // o/p - 202

        int temp2 = 300;
        System.out.println(temp2--); // o/p - 300 and decreases by 1
        System.out.println(--temp2); // o/p - 298

        // Ternary operators
        // [ ?: ]
        System.out.println(true ? "fine" : "not fine");
        System.out.println(false ? "fine" : "not fine");
    }   
}
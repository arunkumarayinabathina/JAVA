public class Swap{
    public static void main(String[] args){
        int a =10;
        int b = 20;
        System.out.println("Before");
        System.out.println(a);
        System.out.println(b);
        
        // int temp ;
        // temp = a;
        // a = b;
        // b = temp;
        // System.out.println(a);
        // System.out.println(b);
        
        System.out.println("After");
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a);
        System.out.println(b);
       
        // a = 30
        // b = 30 - 20
        // a = 30 - 10;

    }
}
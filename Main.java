public class Main {
    static int a = 20;
    static int b = 30;
    public static void main(String[] args){
        if(a>b){
            System.out.println("'a' value is less than b.");
        }
        else{
            System.out.println("'a' value is greater than b.");
        }
        int num = 4;

        if(num%2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }



        int marks = 85;
        if(marks >= 90) {
            System.out.println("Grade: A+");
        }
        else if(marks >= 80) {
            System.out.println("Grade: A");
        }
        else if(marks >= 70) {
            System.out.println("Grade: B");
        }
        else if(marks >= 60) {
            System.out.println("Grade: C");
        }
        else if(marks >= 50) {
            System.out.println("Grade: D");
        }
        else {
            System.out.println("Grade: F - Failed");
        }


        int age = 25;
        boolean License = true;
        
        if(age >= 18) {
            if(License) {
                System.out.println("You can drive a car!");
            }
            else {
                System.out.println("You need a driving license first.");
            }
        }
        else {
            System.out.println("You are too young to drive.");
        }
    }
}

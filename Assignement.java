// Practice
// public class Main{
//     public static void main(String[] args){
//         // for loop to print numbers from 1 to 10
//         for(int i=1;i<=10;i++){
//             System.out.print(i+" ");
//         }
//         System.out.println();
//         // for loop to print even numbers from 2 to 20
//         for(int i=2;i<=20;i++){
//             if(i%2 == 0) System.out.print(i+" ");
//         } 
//         // while loop to print odd numbers from 1 to 19
//         int i = 1;
//         while (i < 20) {
//             if (i % 2 != 0) System.out.print(i + " ");
//             i++;
//         }
//         // do-while loop to print numbers from 10 to 1
//         i = 10;
//         do {
//             System.out.print(i + " ");
//             i--;
//         } while (i >= 1);
//     }
// }



//  Assignments
import java.util.Scanner;

public class Assignement {

    // 1. Age Category Checker
    public static String ageCalculator(){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age < 13) return "Child";
        else if (age>=13 && age<=19) return "Teenager";
        else if (age>= 20 && age<=59) return "Adult";
        return "Senior Citizen";
    }

    // 2. Electricity Bill Generator
    public static int Bill(int units){
        if(units<=100) return units*5;
        else if (units>100 && units<=200){
            return (units-100)*7 + 100*5;
        }
        else{
            return (units-300)*10+100*7+100*5;
        }
    }
    //3. Even or Odd Number
    public static boolean EvenOdd(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2 == 0) return true;
        return false;
    }

    // 4. Sum of First N Natural Numbers
    public static int SumOfNaturals(int n){
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum += i;
        }
        return sum;
    }

    // 5. Factorial of a Number
    public static int factorial(int n){
        int multi = 1;
        while(n>=1){
            multi = multi*n;
            n--;
        }
        return multi;
    }

    // 6. Reverse Digits of a Number
    public static int Reverse(int n){
        int rem,rev = 0;
        while(n!=0){
            rem = n %10;
            rev = rev * 10 + rem;
            n = n/10; 
        }
        return rev;
    }    

    // 7. Find Maximum of Three Numbers
    public static String Largest(int a, int b,int c){
        if(a>b && a>c){
            return "'A' is greater";
        }
        else if(b>a && b>c){
            return "'B' is greater";
        }
        return "'C' is greater";
    }

    // 8. Print All Even Numbers from 1 to 50
    public static void PrintEven(int n){
        for(int i=0;i<=n;i++) if(i%2 == 0) System.out.print(i+" ");
    }

    // 9. Loan Eligibility Checker
    public static boolean LoanCheck(int income,int age){
        if(income >= 30000 && age>= 21) return true;
        return false;
    }

    // 10. Multiplication Table Generator
    public static void MultiTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
    public static void main(String[] args){
        // System.out.println(ageCalculator()); 
        // System.out.println(Bill(102));
        // System.out.println(EvenOdd()?"even":"odd");
        // System.out.println(SumOfNaturals(3));
        // System.out.println(factorial(3));
        // System.out.println(Reverse(1234));
        // System.out.println(Largest(6,5,78));
        // PrintEven(50);
        // System.out.println(LoanCheck(32000, 22)?"Eligible":"Not Eligible");
        MultiTable(11);
    }
}

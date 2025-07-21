import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while(num!=0){
            int rem;
            rem = num%10;
            sum+=rem;
            num = num/10;
        }
        System.out.println(sum);
        sc.close();
    }
}

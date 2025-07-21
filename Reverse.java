public class Reverse{
    public static void main(String[] args){
        int num = 121;
        int temp = num;
        int rev = 0;
        while(num!=0){
            int dig;
            dig = num%10;
            rev = rev*10 + dig;
            num = num/10;
        }
        if(temp == rev){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not a Palindrom");
        }
    }
}
public class Armstron1 {
    public static void main(String[] args){
        int num = 153;
        int temp = num;
        int ams = 0;
        while(num!=0){
            int rem = 0;
            rem = num%10;
            ams = ams + (int) Math.pow(rem,3);
            num = num / 10;
        }
        if(ams == temp){
            System.out.println("Arm");
        }
        else{
            System.out.println("Not Arm");
        }
    }
}

public class Armstrong {
    // 153
    public static void main(String[] args){
        int num = 151;
        int temp1 = num;
        int temp2 = num;

        int c =0;
        // for counting of num of digits
        while(num!=0){
            c += 1;
            num = num/10;
        }
        int dig = 0;
        int ams = 0;
        while (temp1!=0) {
            dig = temp1%10;
            ams += ams + (int) Math.pow(dig,c);
            temp1 = temp1/10;
        }

        if(temp2 == ams){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}

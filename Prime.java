public class Prime {
    public static void main(String[] args){
        int num = 4;
        boolean c = false;
        // int c = 0;
        for(int i=2;i<num;i++){
            if(num%i == 0){
                c = true;
                break;
            }
        }
       if(c) System.out.println("Not prime");
       else System.out.println("Prime");
    }
}

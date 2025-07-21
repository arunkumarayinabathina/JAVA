public class Duplicate {
    public static void main(String[] args){
        int num =1234321;
        int[] arr = new int[10];
        while(num!=0){
            int dig;
            dig = num%10;
            arr[dig]++;
            num = num/10;
        }
        for(int i=1;i<10;i++){
            if(arr[i]>1)
            System.out.println(i+" - "+arr[i]);
        }
    }
}

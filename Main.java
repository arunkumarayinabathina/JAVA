// import java.util.Arrays;

import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        // int[] arr = new int[3];
        // arr[0] = 1;
        // arr[1] = 2;
        // arr[2] = 3;
        // for(int i=0;i<arr.length;i++){
        //     System.err.println(arr[i]);
        // }
        // System.out.println(Arrays.toString(arr));
        // for(int i:arr){
        //     System.out.println(i);
        // }


        int[][] arr = new int[3][5];
        // System.out.println(Arrays.deepToString(arr));
        arr[0][0] = 100;
        arr[0][1] = 100;
        arr[0][2] = 100;
        arr[0][3] = 100;
        arr[0][4] = 100;

        arr[1][0] = 200;
        arr[1][1] = 200;
        arr[1][2] = 200;
        arr[1][3] = 200;
        arr[1][4] = 200;

        arr[2][0] = 300;
        arr[2][1] = 300;
        arr[2][2] = 300;
        arr[2][3] = 300;
        arr[2][4] = 300;

        int bal = 0;
        for(int i=0;i<3;i++){
            bal=0;
            for(int j=0;j<5;j++){
                System.out.println("User - "+(i+1)+"  "+" transaction "+(j+1)+" = " +arr[i][j]);
                bal+=arr[i][j];
            }
            System.out.println("User - "+(i+1)+"   total : "+bal);
        }
    }
}
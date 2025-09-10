package Task;

import java.math.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {

        // FILE 1 :
        // PrintWriter pw = new PrintWriter("file1.txt");
        // pw.println("aaa");
        // pw.println("bbb");
        // pw.println("ccc");

        // FILE 2 :
        // PrintWriter pw1 = new PrintWriter("file2.txt");
        // pw1.println(666);
        // pw1.println(777);
        // pw1.println(888);
        // pw1.close();
        // pw.close();

        // FILE 3 :
        // BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
        // BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));

        // PrintWriter pw = new PrintWriter("file3.tx");
        // String i = br1.readLine();
        // while(i!=null){
        // pw.println(i);
        // i = br1.readLine();
        // }
        // String j = br2.readLine();
        // while(j!=null){
        // pw.println(j);
        // j = br2.readLine();
        // }
        // pw.close();
        // br1.close();
        // br2.close();



        // FILE 4 :
        // BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
        // BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));

        // PrintWriter pw = new PrintWriter("file4.tx");
        // String i = br1.readLine();
        // String j = br2.readLine();
        // while (i != null && j != null) {
        //     pw.println(i);
        //     pw.println(j);
        //     i = br1.readLine();
        //     j = br2.readLine();
        // }

        // pw.close();
        // br1.close();
        // br2.close();

        // FILE 5

        // PrintWriter pw = new PrintWriter("file5.txt");
        // pw.print(new BigInteger("555666777555444333777999"));
        // pw.close();


        // FILE 6
       BufferedReader br = new BufferedReader(new FileReader("file5.txt"));
        String line = br.readLine();
        br.close();

        StringBuilder unique = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (unique.indexOf(String.valueOf(c)) == -1) {
                unique.append(c);
            }
        }

        PrintWriter pw = new PrintWriter("file6.txt");
        pw.print(unique.toString());
        pw.close();
    }
}

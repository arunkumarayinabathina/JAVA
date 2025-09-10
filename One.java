import java.io.*;
public class One {
    public static void main(String[] args) throws IOException{
        // BufferReader
        // BufferWriter
        // PrintWritter

        // BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        FileWriter fr = new FileWriter("abc.txt",true);
        BufferedWriter bw = new BufferedWriter(fr);

        bw.write("Welcome to the file! 1st");
        bw.newLine();
        bw.write("Welcome to the file! 2nd");
        bw.newLine();
        bw.write("Welcome to the file! 3rd");
        bw.newLine();
        bw.flush();
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        // System.out.println(
        //     br.read()
        // );
        // int i = br.read();
        // while(i!=-1){
        //     System.out.print((char)i);
        //     i = br.read();
        // }

        // String i = br.readLine();
        // System.out.println(i); 


        String i = br.readLine();

        while(i!=null){
            System.out.println(i);
            i = br.readLine();
        }
        br.close();


        PrintWriter pw = new PrintWriter("xyz.txt");
        pw.print(123);
        pw.print("Welcome");
        pw.print("%%%%%");
        pw.print(true);
        pw.println(false);
        pw.println("End of the file");
        pw.close();
    }
}

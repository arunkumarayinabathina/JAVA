import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        File f = new File("Readme.md");
        File f1 = new File("InnerFolder");
        f1.mkdir();
        // f1.delete();
        System.out.println(f.createNewFile());
        System.out.print( f.exists());

        FileWriter fw = new FileWriter("Readme.md");
        fw.write("# Welcome to FileHandling\n");
        fw.write("writing into file\n");
        // fw.write(23);
        fw.flush();
        fw.close();

        FileReader fr = new FileReader("Readme.md");

        int i = fr.read();

        while(i!=-1){
            System.out.print((char)i);
            i = fr.read();
        }
        fr.close();



        File nestedFolder = new File(f1, "SubFolder");
        nestedFolder.mkdir();
        System.out.println("Nested folder created: " + nestedFolder.exists());

        File fileInNestedFolder = new File(nestedFolder, "nested.txt");
        FileWriter nestedWriter = new FileWriter(fileInNestedFolder);
        nestedWriter.write("This is a file inside a nested folder");
        nestedWriter.flush();
        nestedWriter.close();

    
        FileReader nestedReader = new FileReader(fileInNestedFolder);
        System.out.println("\nReading from nested file:");
        int j = nestedReader.read();
        while (j != -1) {
            System.out.print((char)j);
            j = nestedReader.read();
        }
        nestedReader.close();

        File driveFolder = new File("C:/TestFolder");
        driveFolder.mkdir();
        System.out.println("\nFolder on C: drive created");

    }
}
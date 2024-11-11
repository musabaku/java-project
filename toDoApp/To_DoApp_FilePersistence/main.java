package To_DoApp_FilePersistence;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws Exception {
//        String currentDir = System.getProperty("user.dir");
//        System.out.println("Current working directory: " + currentDir);

//        try(Scanner scanner = new Scanner(Paths.get("src/To_DoApp_FilePersistence/file.txt"))){
////        try(Scanner can = new Scanner(Paths.get("file.txt"))){
//        while (scanner.hasNextLine()){
//            String row = scanner.nextLine();
//            System.out.println(row);
//        }
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }
        PrintWriter printWriter = new PrintWriter(new FileWriter("file.txt",true));

        printWriter.println("zzzzzz");
        printWriter.println("zzzzzz");
        printWriter.println("zzzzzz");
        printWriter.println("zzzzzz");
        printWriter.println("zzzzzz");
        printWriter.close();
    }
}

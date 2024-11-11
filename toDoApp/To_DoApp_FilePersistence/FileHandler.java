package To_DoApp_FilePersistence;

import To_DoApp_MultiMode.Task;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {


    public void saveTask(ArrayList<Taskv2> tasks){
        System.out.println("in save task");
        try(PrintWriter printWriter = new PrintWriter(new FileWriter("src/To_DoApp_FilePersistence/file.txt", true))) {
            printWriter.println();
            printWriter.println(tasks.toString());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("done with savetask");
    }
    public ArrayList<Taskv2> loadTask(){
        ArrayList<Taskv2> tasks = new ArrayList<>();
        try(Scanner scanner = new Scanner(Paths.get("src/To_DoApp_FilePersistence/file.txt"))){
            while (scanner.hasNextLine()){
                String row = scanner.nextLine().trim();
                if(!row.isEmpty()) {
                    String[] parts = row.split(",");
                    tasks.add(new Taskv2(parts[0], parts[1]));
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return tasks;

    }

}

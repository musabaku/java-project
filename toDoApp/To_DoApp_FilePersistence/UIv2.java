package To_DoApp_FilePersistence;

import To_DoApp_MultiMode.TaskManager;

import java.util.Scanner;

public class UIv2 {

    public static void start(TaskManagerv2 taskManager,FileHandler fileHandler){
//        fileHandler.loadTask();
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Choose an action: \n1) Add task \n2) Remove task \n3) Display tasks");
                int user = Integer.valueOf(scanner.nextLine());
                switch (user) {
                    case 1:
                        System.out.println("Enter task description you want to add: ");
                        String userDescription = scanner.nextLine();
                        System.out.println("Enter How many days remaining for task to be completed: ");
                        String userDate = scanner.nextLine();
                        taskManager.addTask(userDescription,userDate);
                        break;
                    case 2:
                        taskManager.removeTasks(Integer.valueOf(scanner.nextLine()));
                        break;
//                    case 3:
//                        System.out.println("Enter task you want to mark as completed by number: ");
//                        taskManager.markTaskCompletedByIndex(Integer.valueOf(scanner.nextLine()));
//                        break;
                    case 3:
                        taskManager.displayTasks();
                        break;
//                    case 5:
//                        System.out.println("Enter task you want to mark as completed by text: ");
//                        markTaskCompletedByText(scanner.nextLine());
//
//                        break;
//                    case 6:
//                        viewCompletedTasks();
//                        break;

                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input exiting program");
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();
        TaskManagerv2 taskManager = new TaskManagerv2(fileHandler);
//        fileHandler.loadTask(taskManager);
        start(taskManager,fileHandler);
    }
}

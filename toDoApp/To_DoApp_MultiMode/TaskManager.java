package To_DoApp_MultiMode;

import java.util.ArrayList;

public class TaskManager {

    private static ArrayList<Task> tasks = new ArrayList<>();

    protected static Task getTask(int i) {
        return tasks.get(i);
    }

    protected static String  addTask(String description,String dueDate) {
        if(description==null || dueDate ==null){
            return "Wrong Input format. Enter task details properly!";
        }
        tasks.add(new Task(description,dueDate));
        return "Task Added successfully!";
    }

    protected static void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks added please select 1 and add task");
        } else {
            System.out.println("**********************");
            System.out.println("Your Tasks Are : ");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ") " + tasks.get(i).getDescription() + ". Complete Task in : "+tasks.get(i).getDueDays());
            }
            System.out.println("**********************");
        }
    }

    protected static void removeTasks(int i) {
        tasks.remove(i - 1);
    }
//
//    private static void markTaskCompletedByIndex(int i) {
//        tasks.set(i - 1, tasks.get(i - 1) + "-- Completed");
//    }
//
//    private static void markTaskCompletedByText(String text) {
//        for (int i = 0; i < tasks.size(); i++) {
//            if (tasks.get(i).toLowerCase().contains(text.toLowerCase())) tasks.set(i, tasks.get(i) + "-- Completed");
//        }
//
//    }

//    private static void viewCompletedTasks() {
////  ArrayList<String> list = new ArrayList<>();
////  list.add(t)
//
//        for (int i = 0; i < tasks.size(); i++) {
//            if (tasks.get(i).contains("Completed")) {
//                System.out.println(tasks.get(i));
//            }
//        }
//    }

}

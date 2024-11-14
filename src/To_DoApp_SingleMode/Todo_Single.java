package To_DoApp_SingleMode;

import java.util.ArrayList;
import java.util.Scanner;

public class Todo_Single {

    private static ArrayList<String> tasks = new ArrayList<>();
    private String description;
// private int id;

    private static String getTask(int i) {
        return tasks.get(i);
    }

    private static void addTask(String description) {
        tasks.add(description);
    }

    private static void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks added please select 1 and add task");
        } else {
            System.out.println("**********************");
            System.out.println("Your Tasks Are : ");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ") " + tasks.get(i));
            }
            System.out.println("**********************");
        }
    }
// this is a remove tasks function

    private static void removeTasks(int i) {
        tasks.remove(i - 1);
    }

    private static void markTaskCompletedByIndex(int i) {
        tasks.set(i - 1, tasks.get(i - 1) + "-- Completed");
    }

    private static void markTaskCompletedByText(String text) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).toLowerCase().contains(text.toLowerCase())) tasks.set(i, tasks.get(i) + "-- Completed");
        }

    }
// this is a view completed tasks function
    private static void viewCompletedTasks() {
//  ArrayList<String> list = new ArrayList<>();
//  list.add(t)

        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).contains("Completed")) {
                System.out.println(tasks.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Choose an action: \n1) Add task \n2) Remove task \n3) Mark task completed \n4) Display tasks \n5) Mark task as completed by text \n6) Display completed tasks\n");
                int user = Integer.valueOf(scanner.nextLine());
                switch (user) {
                    case 1:
                        System.out.println("Enter task you want to add: ");
                        addTask(scanner.nextLine());
                        break;
                    case 2:
                        System.out.println("Enter task you want to remove: ");
                        removeTasks(Integer.valueOf(scanner.nextLine()));
                        break;
                    case 3:
                        System.out.println("Enter task you want to mark as completed by number: ");
                        markTaskCompletedByIndex(Integer.valueOf(scanner.nextLine()));
                        break;
                    case 4:
                        displayTasks();
                        break;
                    case 5:
                        System.out.println("Enter task you want to mark as completed by text: ");
                        markTaskCompletedByText(scanner.nextLine());

                        break;
                    case 6:
                        viewCompletedTasks();
                        break;

                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input exiting program");
        } finally {
            scanner.close();
        }

    }
}




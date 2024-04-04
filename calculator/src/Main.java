import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1");
        int a = scanner.nextInt();
        System.out.println("Enter number 2");
        int b = scanner.nextInt();
        System.out.println("Do you want to add/subtract/multiply/divide write in sign");
        String c = scanner.next();
        int result=0;
        float s=0;
        if (c.equals("add")) {
            result = add(a, b);
        } else if (c.equals("subtract")) {
            result = subtract(a, b);
        } else if (c.equals("multiply")) {
            result = multiply(a, b);
        } else if (c.equals("divide")) {s = divide(a, b);
        }
        if(s!=0){
            System.out.println(s);
        }
        System.out.println(result);
    }

    public static int add(int a,int b){
        return a+b;
    }
    public static int subtract(int a,int b){
        return a-b;
    }
    public static int multiply(int a,int b){
        return a*b;
    }
    public static float divide(int a,int b){
        return (float) a/b;
    }
}
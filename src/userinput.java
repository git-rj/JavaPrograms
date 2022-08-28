import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        float a = sc.nextFloat();
        System.out.println("enter number 2");
        int b = sc.nextInt();
        float sum = a+b;
        System.out.println("the sum of a and b is");
        System.out.println(sum);
    }
}
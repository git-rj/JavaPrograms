import java.util.Scanner;

public class SumOfNumbers2
{
    public static void main(String args[])
    {
        float x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        x = sc.nextFloat();
        System.out.print("Enter the second number: ");
        y = sc.nextFloat();
        float sum = (x + y);
        System.out.println("The sum of two numbers x and y is: " + sum);
    }

    private static float sum(float x, float y) {
        return 0;
    }
}

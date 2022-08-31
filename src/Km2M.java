import java.util.Scanner;

public class Km2M
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter distance in KM");
        float km = s.nextFloat();
        float mile = (float)(km/1.609);
        System.out.println("Distance in miles is "+mile);

    }
}

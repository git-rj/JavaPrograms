import java.util.Scanner;

public class celsius2F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter value in celsius");
        float c = sc.nextFloat();
        float f = (float) ((c*1.8) + 32);
        System.out.println("The fahrenheit temp. is "+f);
    }
}

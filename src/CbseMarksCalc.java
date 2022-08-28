import java.util.Scanner;

public class CbseMarksCalc {
    public static void main(String[] args) {
        System.out.println("Enter numbers for calculating %age");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter MARKS 1");
        float a = s.nextFloat();
        System.out.println("Enter MARKS 2");
        float b = s.nextFloat();
        System.out.println("Enter MARKS 3");
        float c = s.nextFloat();
        System.out.println("Enter MARKS 4");
        float d = s.nextFloat();
        System.out.println("Enter MARKS 5");
        float e = s.nextFloat();
        System.out.println("Enter MARKS 6");
        float f = s.nextFloat();
        float sum = (a+b+c+d+e+f);
        System.out.println("Enter total marks");
        float total=s.nextFloat();
        float percentage = (float) ((sum / total) * 100);
        System.out.println("percentage::"+percentage);
    }
}


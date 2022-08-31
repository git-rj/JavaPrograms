import java.util.Scanner;

public class CWH_precedence {
    public static void main(String[] args) {
        /* float A= 6*5/4-3+3;
        System.out.println(A);
         (* , /) associativity L to R


        Scanner s = new Scanner(System.in);
        System.out.println("Enter acceleration a = ");
        int a =s.nextInt();
        System.out.println("Enter b = ");
        int b = s.nextInt();
        System.out.println("enter c");
        int c= s.nextInt();
        int d = b*b - (4*a*c)/(2*a);
        System.out.println("d" +d); */

        Scanner s = new Scanner(System.in);
        System.out.println("enter v");
        int v= s.nextInt();
        System.out.println("enter u");
        int u= s.nextInt();
        int sa2= v*v - u*u;
        System.out.println("2as = v^2-u^2 "+sa2);
    }
}


import java.util.Scanner;

public class roots {
    static double root(int a, int b, int c){

        double d = (b*b)-4*a*c;
        double x1 = (-b + Math.sqrt(d))/2*a;
        double x2 = (-b - Math.sqrt(d))/2*a;
        return x1+x2;
    }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in); 
            System.out.println("Enter the coefficients of the equvalent");
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            System.out.println("the sum of roots is " + root(a, b, c));
        }
}

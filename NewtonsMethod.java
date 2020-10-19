import java.util.Scanner;
public class NewtonsMethod {
    
    public static double f(double a) {
        return 6 * Math.pow(a, 4) - 13 * Math.pow(a, 3) - 18 * Math.pow(a, 2) + 7 * (a) + 6;
    }
    public static double d(double a) {
        return 24 * Math.pow(a, 3) - 39 * Math.pow(a, 2) - 36 * a + 7;
    }
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your guess for the root of this equation.\nThis program will give you the root closest to your guess.");
        double x0 = s.nextDouble();
        double x1 = x0 - f(x0)/d(x0);
        while (Math.abs(x0 - x1) > 0.00001) {
            x0 = x1;
            x1 = x0 - f(x0)/d(x0);
        }
        s.close();
        System.out.println("The root is " + x1);
    }
}

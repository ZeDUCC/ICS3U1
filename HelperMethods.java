import java.util.Scanner;

public class HelperMethods {
    public static void quadraticFormula(double a, double b, double c) {
        double root1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double root2 = (-b - Math.sqrt(b * b -  4 * a * c)) / (2 * a);
        if (root1 != root2) {
            System.out.println("The roots of your equation are: " + root1 + " and " + root2);
        } else {
            System.out.println("The root of your equation is: " + root1);
        }
    }
    public static void asymptoteFinder(int m, int n) {
        if (m == n) {
            System.out.println("The asymptote of your function is horizontal.");
        } else if (n > m) {
            System.out.println("The asymptote of your function is the x-axis.");
        } else {
            switch (m - n) {
                case 1: System.out.println("The asymptote is linear.");
                        break;
                case 2: System.out.println("The asymptote is quadratic.");
                        break;
                case 3: System.out.println("The asymptote is cubic.");
                        break;
                case 4: System.out.println("The asymptote is quartic.");
                        break;
                case 5: System.out.println("The asymptote is quintic.");
                        break;
                case 6: System.out.println("The asymptote is sextic.");
                        break;
                case 7: System.out.println("The asymptote is septic.");
                        break;
                case 8: System.out.println("The asymptote is octic.");
                        break;
                case 9: System.out.println("The asymptote is nonic.");
                        break;
                case 10: System.out.println("The asymptote is decic.");
                        break;
                default: System.out.println("The values you entered are invalid. Please restart and try again.");
        }
    }
    }
    public static double piApproximation(int n) {
        Scanner s = new Scanner(System.in);
        if (n < 0) {
            System.out.println ("You've entered a negative number.");
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            double piValue = Math.pow(-1, i) / (2 * i + 1);
            sum += piValue;
        }
        s.close();
        return 4 * sum;
    }
    
    public static void main(String[] args) {
        quadraticFormula(1, 4, 4);
        asymptoteFinder(4, 2);
        System.out.println("The value of pi is: " + piApproximation(10));
    }
}

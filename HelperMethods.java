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
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the HelperMethods program.");
        System.out.println("Enter 1 for quadraticFormula, 2 for asymptoteFinder, or 3 for piApproximation.");
        if (s.nextInt() == 1) {
            System.out.println("Enter your a-value: ");
            double a = s.nextDouble();
            System.out.println("Enter your b-value: ");
            double b = s.nextDouble();
            System.out.println("Enter your c-value: ");
            double c = s.nextInt();
            quadraticFormula(a, b, c);
        } else if (s.nextInt() == 2) {
            System.out.println("Enter the numerator's degree: ");
            int m = s.nextInt();
            System.out.println("Enter the denominator's degree: ");
            int n = s.nextInt();
            asymptoteFinder(m, n);
        } else if (s.nextInt() == 3) {
            System.out.println("Enter a positive integer: ");
            int n = s.nextInt();
            System.out.println("The value of pi is: " + piApproximation(n));
        }
    }
}

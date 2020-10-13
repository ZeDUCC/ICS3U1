import java.util.Scanner;
public class AsymptoteFinder {

    public static void main(final String[] args) {
        System.out.println("This program will determine the asymptote type of a rational function\ngiven the degrees of its numerator and denominator.\n");
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the numerator's degree:");
        int m = s.nextInt();
        System.out.println("Please enter the denominator's degree: ");
        int n = s.nextInt();
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
            }
        s.close();
        }
    }
}
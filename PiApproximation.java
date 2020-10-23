import java.util.Scanner;
public class PiApproximation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Pi Approximation program. This program will\napproximate the value of pi given an integer n.\n");
        loop:

        while (true) {
            System.out.println("Enter a positive integer.");
            int n = s.nextInt();
            if (n < 0) {
                System.out.println("You've entered a negative number.");
                continue;
            }
            double sum = 0;
            for (int i = 0; i < n; i++) {
                double piValue = Math.pow(-1, i) / (2*i + 1);
                sum += piValue;
            }
            System.out.println("The value of pi is " + 4 * sum);
            System.out.println("Want to try again? Type '1' for yes or '2' for no.");
            if (s.nextInt() != 1) {
                System.out.println("The program is now terminated.");
                break loop;
            }
        }
        s.close();
    }
}


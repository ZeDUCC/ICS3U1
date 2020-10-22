import java.util.Scanner;
public class PiApproximation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean status = true;
        loop:
        while (status) {
            System.out.println("Welcome to the Pi Approximation program. This program will\napproximate the value of pi given an integer n.\n");
            System.out.println("Enter a value.");
            int n = s.nextInt();
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


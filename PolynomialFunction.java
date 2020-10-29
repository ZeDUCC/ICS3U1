import java.util.Scanner;

public class PolynomialFunction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String function = new String("");
        double answer = 0;
        System.out.println("Please enter the coefficients of your function.");
        String[] coefficients = s.nextLine().split(" ");
        System.out.println("Now, enter the exponent of each term in order.");
        String[] exponents = s.nextLine().split(" ");
        System.out.println("Now, enter the value of x that you would like to evaluate for.");
        double x = s.nextDouble();
        if (exponents.length != coefficients.length) {
            System.out.println("The number of terms and exponents don't match. Please run the program again.");
        } else {
            for (int i = 0; i < exponents.length; i++) {
                if (!coefficients[i].contains("-") && i != 0) {
                    function += ("+" + coefficients[i] + "x^" + exponents[i] + " ");
                } else {
                    function += (coefficients[i] + "x^" + exponents[i] + " ");
                }
            }
            System.out.println("Your function is " + function);
        }
        for (int i = 0; i < exponents.length; i++) {
            answer += Double.parseDouble(coefficients[i]) * (Math.pow(x, Double.parseDouble(exponents[i])));
        }
        System.out.println("Your function at x = " + x + " is: f(" + x + ") = " + answer);
        s.close();
    }
}
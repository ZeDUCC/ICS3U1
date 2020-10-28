import java.util.Scanner;

public class PolynomialFunction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String function = new String("");
        System.out.println("Please enter the coefficients of your function.");
        String[] coefficients = s.nextLine().split(" ");
        System.out.println("Now, enter the exponent of each term in order.");
        String[] exponents = s.nextLine().split(" ");
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
            System.out.println(function);
        }
    }
}

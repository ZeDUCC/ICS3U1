import java.util.Scanner;

public class PowerRule {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String derivative1 = "";
        String derivative2 = "";
        System.out.println("Please enter the coefficient of each term in your function.");
        String[] coefficients = s.nextLine().split(" ");
        System.out.println("Please enter the exponent of each term in your function.");
        String[] exponents = s.nextLine().split(" ");
        if (exponents.length != coefficients.length) {
            System.out.println("The number of terms and exponents don't match. Please run the program again.");
        } else {
            for (int i = 0; i < coefficients.length; i++) {
                double coValue = Double.parseDouble(coefficients[i]);
                int expValue = Integer.parseInt(exponents[i]);
                if (coValue >= 0) {
                    derivative1 += "+";
                } else {
                    derivative1 += "";
                }
                if (expValue - 1 == 1 && coValue == 1) {
                    derivative1 += "+ x ";
                } else if (expValue - 1 == 0) {
                    derivative1 += coValue;
                } else if (expValue - 1 == 1) {
                    derivative1 += coValue * expValue + "x ";
                } else if (coValue == 1 && expValue - 1 != 0) {
                    derivative1 += "x^" + (expValue - 1);
                } else {
                    derivative1 += (coValue * expValue) + "x^" + (expValue - 1) + " ";
                }
            }
            loop:
            for (int i = 0; i < coefficients.length; i++) {
                double coValue = Double.parseDouble(coefficients[i]) * Integer.parseInt(exponents[i]);
                int expValue = Integer.parseInt(exponents[i]) - 1;
                if (coValue > 0) {
                    derivative2 += "+";
                } else if (coValue < 0){
                    derivative2 += "";
                } else {
                    derivative2 += "";
                }
                if (expValue - 1 == 1 && coValue == 1) {
                    derivative2 += "+ x ";
                } else if (expValue - 1 == 0) {
                    derivative2 += coValue;
                } else if (expValue - 1 == 1) {
                    derivative2 += coValue * expValue + "x ";
                } else if (coValue == 1 && expValue - 1 < 0) {
                    derivative2 += "";
                } else if (expValue < 0) {
                    continue loop;
                } else {
                    derivative2 += (coValue * expValue) + "x^" + (expValue - 1) + " ";
                }
            }
        System.out.println("The first derivative is: f'(x) = " + derivative1.substring(1));
        System.out.println("The second derivative is: f''(x) = " + derivative2.substring(1, derivative2.length() - 1));
    }
    }
}

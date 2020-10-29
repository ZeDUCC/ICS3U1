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
            for (String coefficient : coefficients) {
                double coValue = Double.parseDouble(coefficient);
                int expValue = Integer.parseInt(coefficient);
                if (expValue - 1 == 1 && coValue == 1) {
                    derivative1 += "+ x";
                } else if (expValue - 1 == 0 && coValue != 1) {
                    derivative1 += coValue + "x";
                } else if (coValue == 1 && expValue - 1 != 0) {
                    derivative1 += "x^" + (expValue - 1);
                } else {
                    if (coValue > 0) {
                        derivative1 += "+" + (coValue * expValue) + "x^" + (expValue - 1) + " ";
                    } else {
                        derivative1 += "-" + (coValue * expValue) + "x^" + (expValue - 1) + " ";
                    }
                }
            }
            String[] d2Terms = derivative1.split(" ");
            /*for (String term : d2Terms) {
                double coValue = Double.parseDouble(term.substring(0, term.indexOf("x")));
                int expValue = Integer.parseInt(term.substring(term.indexOf("^")));
                if (coValue > 0) {
                    derivative2 += "+" + (coValue * expValue) + "x^" + (expValue - 1) + " "; 
                } else {
                    derivative2 += "-" + (coValue * expValue) + "x^" + (expValue - 1) + " ";
                }
            }*/
        }
        System.out.println("The first derivative is " + derivative1);
        System.out.println("The second derivative is " + derivative2);
    }
}

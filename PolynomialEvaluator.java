//3.75/4

import java.util.Scanner;
import java.util.StringTokenizer;

public class PolynomialEvaluator {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the function that you would like to use.");
        StringTokenizer terms = new StringTokenizer(s.nextLine(), " ");
        System.out.println("Now, enter the value of x.");
        double x = s.nextDouble();
        double sum = 0;
        loop:
        while (terms.hasMoreTokens()) { 
            String term = terms.nextToken();
            if (term.contains("=") || term.contains("f")) {
                continue loop;
            }
            if (term.contains("x") && term.contains("^")) {
                double coefficient = Double.parseDouble(term.substring(0, term.indexOf("x")));
                int exponent = Integer.parseInt(term.substring(term.indexOf("^") + 1));
                sum += coefficient * (Math.pow(x, exponent));
            } else if (!term.contains("x") && term.contains("^")){
                sum += Math.pow(x, Integer.parseInt(term.substring(term.indexOf("^") + 1)));
            } else if (term.contains("x") && !term.contains("^")) {
                sum += x * Double.parseDouble(term.substring(0, term.indexOf("x")));
            } else {
                sum += Integer.parseInt(term);
            }
        }
    System.out.println("f(" + x + ") is " + sum);
    s.close();
    }
}

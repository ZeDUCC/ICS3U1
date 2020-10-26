import java.util.Scanner;

public class PolynomialEvaluator {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the function, f(x), that you would like to use.");
        String[] terms = s.nextLine().split(" ");
        System.out.println("Now, enter the value of x.");
        double x = s.nextDouble();
        double sum = 0;
        for (String term : terms) { 
            if (term.contains("x") && term.contains("^")) {
                double coefficient = Double.parseDouble(term.substring(0, term.indexOf("x")));
                int exponent = Integer.parseInt(term.substring(term.indexOf("^") + 1));
                sum += Math.pow(x, exponent) * coefficient;
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


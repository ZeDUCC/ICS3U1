import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[] coefficients = {"5", "3", "2", "1"};
        String[] exponents = {"5", "3", "2", "1"};
        String derivative2 = "";
        loop:
        for (int i = 0; i < coefficients.length; i++) {
            double coValue = Double.parseDouble(coefficients[i]) * Integer.parseInt(exponents[i]);
            int expValue = Integer.parseInt(exponents[i]) - 1;
            if (coValue > 0) {
                derivative2 += "+";
            } else if (coValue < 0){
                derivative2 += "-";
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
        System.out.println(derivative2.substring(1));
    }
}


import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String derivative1 = "+25.0x^4 +9.0x^2 +4.0x +1.0";
        String derivative2 = "";
        String[] d2Terms = derivative1.split(" ");
        for (String term : d2Terms) {
            double coValue = Double.parseDouble(term.substring(0, term.indexOf("x") - 1));
            int expValue = Integer.parseInt(term.substring(term.indexOf("^") + 1));
            if (coValue >= 0) {
                derivative2 += "+";
            } else {
                derivative2 += "-";
            }
            if (expValue - 1 == 1 && coValue == 1) {
                derivative2 += "+ x ";
            } else if (expValue - 1 == 0) {
                derivative2 += coValue;
            } else if (expValue - 1 == 1) {
                derivative2 += coValue * expValue + "x ";
            } else if (coValue == 1 && expValue - 1 != 0) {
                derivative2 += "x^" + (expValue - 1);
            } else {
                derivative2 += (coValue * expValue) + "x^" + (expValue - 1) + " ";
            }
        }
        System.out.println(derivative2);
    }
}


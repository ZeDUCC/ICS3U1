import java.util.Scanner;

public class BooleanTest {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your first value:");
        boolean a = s.nextBoolean();
        System.out.println("Enter your second value:");
        boolean b = s.nextBoolean();
        System.out.println("Enter your third value:");
        boolean c = s.nextBoolean();
        System.out.println("Enter your final value:");
        boolean d = s.nextBoolean();
        boolean endgate = ((a && b) || (c && d)) || ((c && a) || (a && d)) || ((c && a) || (a && d)) || ((d && b) || (b && c));
        System.out.println("The result is: " + endgate);
        s.close(); //this is a comment
    }
}

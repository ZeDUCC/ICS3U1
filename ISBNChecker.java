import java.util.Scanner;
public class ISBNChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("This program will check if that number is a valid ISBN number.");
        int sum = 0;
        loop:
        while (true) {
            System.out.println("Enter a 13-digit number.");
            String code = s.nextLine();
            if (code.length() != 13) {
                System.out.println("Your code is too short. Please try again.");
                continue loop;
            }
            for (int i = 0; i < 13; i++) {
                int x = Character.getNumericValue(code.charAt(i));
                if (i == 0 || (i % 2) == 0) {
                    sum += x;
                } else {
                    sum += (x * 3);
                }
            }
            if ((sum % 10) == 0) {
                System.out.println("This code is valid.");
                break loop;
            } else {
                System.out.println("This code is invalid.");
                break loop;
            }
            
        }
        s.close();
    }
}

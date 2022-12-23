import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Factorial fac = new Factorial();
        try {
            int k;
            Scanner in = new Scanner(System.in);
            System.out.println("Enter k: ");
            k = in.nextInt();
            System.out.println("First n factorials: ");
            System.out.println(fac.getFirstNFactorials(k));
            System.out.println("Factorial: ");
            System.out.println(fac.getFactorial(k));
        } catch (Incorrect e) {
            System.out.println(e.getMessage());
        }
    }
}


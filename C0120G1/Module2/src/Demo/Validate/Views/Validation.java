package Demo.Validate.Views;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Validation {
    public static int checkAndGetNumber(String contentEror) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(contentEror);
            }
        }
    }
}

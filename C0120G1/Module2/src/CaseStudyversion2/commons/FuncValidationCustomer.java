package CaseStudyversion2.commons;

import java.util.Scanner;

public class FuncValidationCustomer {
    public static String checkCustomer(String regex, String errorMess) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.nextLine();
            if (input.matches(regex)) {
                return input;
            } else {
                System.out.println(errorMess);
            }
        }
    }
}

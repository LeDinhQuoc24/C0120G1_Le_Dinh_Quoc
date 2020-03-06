package CaseStudyversion2.commons;


import java.util.InputMismatchException;
import java.util.Scanner;

import static CaseStudyversion2.views.MainRun.sc;
import static java.lang.Integer.parseInt;

public class FuncValidation {
    //Check Input String
    public static String checkString(String regex, String errorMess) {
        sc.nextLine();
        while (true) {
            String inputString = sc.nextLine();
            if (inputString.matches(regex)) {
                return inputString;
            } else {
                System.out.println(errorMess);
            }
        }
    }
    //Check Input Number Integer
    public static int checkNumberInteger(String regex,String errorMess) {
        while (true) {
            try {
                int inputInt = sc.nextInt();
                if ((inputInt+"").matches(regex)) {
                    return inputInt;
                }else{
                    throw new IllegalArgumentException();
                }
            } catch (InputMismatchException|IllegalArgumentException e) {
                System.out.println(errorMess);
                sc.nextLine();
            }
        }
    }


}

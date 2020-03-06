package CaseStudyversion2.commons;


import java.util.InputMismatchException;


import static CaseStudyversion2.views.MainRun.sc;


public class FuncValidationService {
    //Check Input String
    public static String checkString(String regex, String errorMess) {
        while (true) {
            String inputString = sc.nextLine();
            if (inputString.matches(regex)) {
                if( inputString.equals("byYear") || inputString.equals("byMonth") ||
                        inputString.equals("byDay") || inputString.equals("byHour")) {
                    System.out.println("Enter numberRent:from 1 to 299");
                    String regex1 = "^[1-9]|([1-9][0-9])|[1-2]([0-9]{1,2})$";
                    double numberRent = checkNumberInteger(regex1,"NumberRent failed");
                    return inputString + ": " + numberRent;
                }
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
                String inputInt = sc.nextLine();
                if (inputInt.matches(regex)) {
                    return Integer.parseInt(inputInt);
                }else{
                    throw new IllegalArgumentException();
                }
            } catch (InputMismatchException|IllegalArgumentException e) {
                System.out.println(errorMess);
            }
        }
    }
    //Check Input Number Double
    public static double checkNumberDouble(String regex,String errorMess) {
        while (true) {
            try {
                String inputDouble= sc.nextLine();
                if (inputDouble.matches(regex)) {
                    return Double.parseDouble(inputDouble);
                }else{
                    throw new IllegalArgumentException();
                }
            } catch (InputMismatchException|IllegalArgumentException e) {
                System.out.println(errorMess);
            }
        }
    }



}

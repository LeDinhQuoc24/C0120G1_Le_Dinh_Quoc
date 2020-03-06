package CaseStudyversion2.commons;


import static CaseStudyversion2.views.MainRun.sc;

public class FuncValidation {
    //Check Name Valid
    public static  String checkNameService(String regex, String errorMess) {
        while (true) {
            String nameService= sc.nextLine();
            if (nameService.matches(regex)) {
                return nameService;
            } else {
                System.out.println(errorMess);
            }
        }
    }
}

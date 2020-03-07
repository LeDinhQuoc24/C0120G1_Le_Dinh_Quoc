package CaseStudyversion2.commons;

import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.saveFileX;
import static CaseStudyversion2.views.MainRun.listCustomer;

public class SaveInformationCustomer {
    public static void saveInformationCustomer() {
        boolean check=saveFileX(listCustomer,"F:\\ProjectCodyGym\\C0120G1\\Module2\\src\\CaseStudyversion2\\data\\saveCustomer.csv");
        if (check) {
            System.out.println("Save Information Customer successfully");
        } else {
            System.out.println("Save Information Customer Failed,try again");
        }
    }
}

package CaseStudyversion2.commons;

import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.readFileX;
import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.saveFileX;
import static CaseStudyversion2.views.MainRun.listCustomer;
import static CaseStudyversion2.views.MainRun.pathCustomer;

public class SaveAndLoadInformationCustomer {
    public static void saveInformationCustomer() {
        boolean check=saveFileX(listCustomer,pathCustomer);
        if (check) {
            System.out.println("Save Information Customer successfully");
        } else {
            System.out.println("Save Information Customer Failed,try again");
        }
    }
    public static void loadInformationCustomer() {
        listCustomer=readFileX(pathCustomer );
    }
}

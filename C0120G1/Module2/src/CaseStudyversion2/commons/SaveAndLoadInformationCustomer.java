package CaseStudyversion2.commons;

import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.readFileX;
import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.saveFileX;
import static CaseStudyversion2.views.MainRun.listCustomer;

public class SaveAndLoadInformationCustomer {
    public static void saveInformationCustomer() {
        boolean check=saveFileX(listCustomer,"D:\\CodeGym\\ProjectCodeGym\\C0120G1_Le_Dinh_Quoc\\C0120G1\\Module2\\src\\CaseStudyversion2\\data2\\saveCustomer.csv");
        if (check) {
            System.out.println("Save Information Customer successfully");
        } else {
            System.out.println("Save Information Customer Failed,try again");
        }
    }
    public static void loadInformationCustomer() {
        listCustomer=readFileX("D:\\CodeGym\\ProjectCodeGym\\C0120G1_Le_Dinh_Quoc\\C0120G1\\Module2\\src\\CaseStudyversion2\\data2\\saveCustomer.csv" );
    }
}

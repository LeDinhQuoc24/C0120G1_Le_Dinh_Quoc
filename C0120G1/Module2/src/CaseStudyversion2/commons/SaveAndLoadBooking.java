package CaseStudyversion2.commons;

import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.readFileX;
import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.saveFileX;
import static CaseStudyversion2.views.MainRun.listBooking;


public class SaveAndLoadBooking {
    public static void saveBooking() {
        boolean check=saveFileX(listBooking,"D:\\CodeGym\\ProjectCodeGym\\C0120G1_Le_Dinh_Quoc\\C0120G1\\Module2\\src\\CaseStudyversion2\\data2\\saveBooking.csv");
        if (check) {
            System.out.println("Save Booking successfully");
        } else {
            System.out.println("Save  Booking Failed,try again");
        }
    }
    public static void loadBooking() {
        listBooking=readFileX("D:\\CodeGym\\ProjectCodeGym\\C0120G1_Le_Dinh_Quoc\\C0120G1\\Module2\\src\\CaseStudyversion2\\data2\\saveBooking.csv" );
    }
}

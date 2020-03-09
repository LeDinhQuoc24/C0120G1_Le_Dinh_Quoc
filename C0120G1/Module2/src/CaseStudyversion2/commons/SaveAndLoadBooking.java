package CaseStudyversion2.commons;

import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.readFileX;
import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.saveFileX;
import static CaseStudyversion2.views.MainRun.listBooking;
import static CaseStudyversion2.views.MainRun.pathBooking;


public class SaveAndLoadBooking {
    public static void saveBooking() {
        boolean check=saveFileX(listBooking,pathBooking);
        if (check) {
            System.out.println("Save Booking successfully");
        } else {
            System.out.println("Save  Booking Failed,try again");
        }
    }
    public static void loadBooking() {
        listBooking=readFileX(pathBooking );
    }
}

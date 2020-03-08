package CaseStudyversion2.commons;

import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.saveFileX;
import static CaseStudyversion2.views.MainRun.listCustomer;

public class SaveBooking {
    public static void saveBooking() {
        boolean check=saveFileX(listCustomer,"F:\\ProjectCodyGym\\C0120G1\\Module2\\src\\CaseStudyversion2\\data\\saveBooking.csv");
        if (check) {
            System.out.println("Save Booking successfully");
        } else {
            System.out.println("Save  Booking Failed,try again");
        }
    }
}

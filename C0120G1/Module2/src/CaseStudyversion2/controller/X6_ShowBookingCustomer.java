package CaseStudyversion2.controller;

import CaseStudyversion2.commons.Comparator;
import CaseStudyversion2.models.Customer;


import java.util.Collections;


import static CaseStudyversion2.commons.SaveAndLoadBooking.loadBooking;
import static CaseStudyversion2.views.MainRun.listBooking;


public class X6_ShowBookingCustomer {
    public static void showBookingCustomer() {
        loadBooking();
        System.out.println("Load file Information Booking successfully");
        System.out.println("\nxxxxxxxxxxxxx List Booking xxxxxxxxxxxxxxx\n\n");
        Comparator comparator = new Comparator();
        Collections.sort(listBooking,comparator);
        for (Customer customer : listBooking) {
                System.out.println(customer.showInfo()+"\n"+
                        "************Register Service**************\n"
                        +customer.getService().showInfo()+"\n");
        }
        System.out.println("\n");
    }
}

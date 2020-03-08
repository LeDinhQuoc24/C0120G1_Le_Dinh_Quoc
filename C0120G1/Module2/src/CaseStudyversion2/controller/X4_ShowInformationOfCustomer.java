package CaseStudyversion2.controller;

import CaseStudyversion2.commons.Comparator;
import CaseStudyversion2.models.Customer;
import java.util.Collections;
import static CaseStudyversion2.commons.SaveAndLoadInformationCustomer.loadInformationCustomer;
import static CaseStudyversion2.views.MainRun.listCustomer;


public class X4_ShowInformationOfCustomer {
    public static void showInformationOfCustomer() {
        loadInformationCustomer();
        System.out.println("Load file Information Customer successfully");
        System.out.println("\nxxxxxxxxxxxxx List Customer xxxxxxxxxxxxxxx\n\n");
        Comparator comparator = new Comparator();
        Collections.sort(listCustomer,comparator);
        for (Customer customer : listCustomer) {
            System.out.println(customer.showInfo()+"\n");
        }
        System.out.println("\n");
    }
}

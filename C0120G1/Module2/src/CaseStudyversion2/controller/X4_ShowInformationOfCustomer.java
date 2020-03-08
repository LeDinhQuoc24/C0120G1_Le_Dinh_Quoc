package CaseStudyversion2.controller;

import CaseStudyversion2.commons.Comparator;
import CaseStudyversion2.models.Customer;
import java.util.ArrayList;
import java.util.Collections;

import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.readFileX;
import static CaseStudyversion2.controller.X0_DisplayMenu.displayMenu;

public class X4_ShowInformationOfCustomer {
    public static void showInformationOfCustomer() {
        ArrayList<Customer> listCustomer=readFileX("F:\\ProjectCodyGym\\C0120G1\\Module2\\src\\CaseStudyversion2\\data\\saveCustomer.csv" );
        System.out.println("Load file Information Customer successfully");
        System.out.println("\nxxxxxxxxxxxxxList Customerxxxxxxxxxxxxxxx\n\n");
        Comparator comparator = new Comparator();
        Collections.sort(listCustomer,comparator);
        for (Customer customer : listCustomer) {
            if (customer.getService() == null) {
                System.out.println(customer.showInfo()+"\n");
            } else {
                System.out.println(customer.showInfo()+"\n"+
                        "************Register Service**************\n"
                        +customer.getService().showInfo()+"\n");
            }
        }
        System.out.println("\n");
        displayMenu();
    }
}

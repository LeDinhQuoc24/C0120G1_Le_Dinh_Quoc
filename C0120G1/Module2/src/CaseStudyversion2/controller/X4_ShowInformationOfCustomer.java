package CaseStudyversion2.controller;

import CaseStudyversion2.models.Customer;


import java.util.ArrayList;

import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.readFileX;
import static CaseStudyversion2.controller.X0_DisplayMenu.displayMenu;

public class X4_ShowInformationOfCustomer {
    public static void showInformationOfCustomer() {
        ArrayList<Customer> listCustomer=readFileX("F:\\ProjectCodyGym\\C0120G1\\Module2\\src\\CaseStudyversion2\\data\\saveCustomer.csv" );
        System.out.println("Load file Information Customer successfully");
        for (Customer customer : listCustomer) {
            System.out.println(customer.showInfo());
        }
        displayMenu();
    }
}

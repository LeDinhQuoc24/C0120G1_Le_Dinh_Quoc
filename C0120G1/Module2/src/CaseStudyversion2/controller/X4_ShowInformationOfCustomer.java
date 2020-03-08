package CaseStudyversion2.controller;

import CaseStudyversion2.commons.Comparator;
import CaseStudyversion2.models.Customer;
import CaseStudyversion2.models.House;
import CaseStudyversion2.models.Room;
import CaseStudyversion2.models.Villa;

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
        int i=1;
        for (Customer customer : listCustomer) {
            if (customer.getService() == null) {
                System.out.println("Số thứ tự: "+i+"\n"+customer.showInfo() + "\n"+"Status : Not registered");
            } else {
                if (customer.getService() instanceof Villa) {
                    System.out.println("Số thứ tự: "+i+"\n"+customer.showInfo() + "\n"+"Status : Registered Villa");
                }
                if (customer.getService() instanceof House) {
                    System.out.println("Số thứ tự: "+i+"\n"+customer.showInfo() + "\n"+"Status : Registered House");
                }
                if (customer.getService() instanceof Room) {
                    System.out.println("Số thứ tự: "+i+"\n"+customer.showInfo() + "\n"+"Status : Registered Room");
                }
            }
            i++;
        }
        System.out.println("\n");
    }
}

package CaseStudyversion2.controller;

import CaseStudyversion2.commons.Comparator;
import CaseStudyversion2.models.Customer;
import CaseStudyversion2.models.House;
import CaseStudyversion2.models.Room;
import CaseStudyversion2.models.Villa;

import java.util.Collections;

import static CaseStudyversion2.commons.SaveAndLoad.loadInformationCustomer;
import static CaseStudyversion2.views.MainRun.listCustomer;


public class X4_ShowInformationOfCustomer {
    public static void showInformationOfCustomer() {
        loadInformationCustomer();
        System.out.println("Load file Information Customer successfully");
        System.out.println("\nxxxxxxxxxxxxx List Customer xxxxxxxxxxxxxxx\n\n");
        Comparator comparator = new Comparator();
        Collections.sort(listCustomer,comparator);

        if (listCustomer.size() == 0) {
            System.out.println("List Customer is null");
        } else {
            for (int i = 1; i <= listCustomer.size(); i++) {
                if (listCustomer.get(i-1).getService() == null) {
                    System.out.println("Số thứ tự: "+i+"\n"+listCustomer.get(i-1).showInfo() + "\n"+"Status : Not registered");
                } else {
                    if (listCustomer.get(i-1).getService() instanceof Villa) {
                        System.out.println("Số thứ tự: "+i+"\n"+listCustomer.get(i-1).showInfo() + "\n"+"Status : Registered Villa");
                    }
                    if (listCustomer.get(i-1).getService() instanceof House) {
                        System.out.println("Số thứ tự: "+i+"\n"+listCustomer.get(i-1).showInfo() + "\n"+"Status : Registered House");
                    }
                    if (listCustomer.get(i-1).getService() instanceof Room) {
                        System.out.println("Số thứ tự: "+i+"\n"+listCustomer.get(i-1).showInfo() + "\n"+"Status : Registered Room");
                    }

                }
            }
            System.out.println("\n");
        }
    }
}

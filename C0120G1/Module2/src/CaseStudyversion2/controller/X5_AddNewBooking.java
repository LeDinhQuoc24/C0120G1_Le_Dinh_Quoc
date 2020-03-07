package CaseStudyversion2.controller;

import CaseStudyversion2.models.Service;

import java.util.ArrayList;

import static CaseStudyversion2.commons.SaveInformationCustomer.saveInformationCustomer;
import static CaseStudyversion2.controller.X0_DisplayMenu.displayMenu;
import static CaseStudyversion2.views.MainRun.*;

public class X5_AddNewBooking {
    static String numberSelectCustomer = sc.nextLine();
    public static void addNewBooking() {
        System.out.println("Information Customer");
        for (int i=0;i<listCustomer.size();i++) {
            System.out.println("Số thứ tự "+(i+1)+":\n"+"NameCustomer: "+ listCustomer.get(i).getName()+
                    "\tIdCustomer: "+listCustomer.get(i).getIdCustomer());
        }
        System.out.println("Select 1 Information Customer");
        if (Integer.parseInt(numberSelectCustomer) > listCustomer.size()) {
            System.out.println("Select error,please try again");
           displayMenu();
        } else {
            addNewBooking2();
        }
    }
    public static void addNewBooking2() {
        System.out.println("1.Booking Villa\n" + "2.Booking House\n" + "3.Booking Room\n"+
                "4.Back to menu");
        switch (sc.nextInt()) {
            case 1:
                for (int i=0;i<listVilla.size();i++) {
                    System.out.println("Số thứ tự "+(i+1)+":\n"+listVilla.get(i).showInfo());
                }
                System.out.println("Select Villa you want booking:");
                int numberSelectVilla = sc.nextInt();
                if (numberSelectVilla > listVilla.size()) {
                    System.out.println("Select error,please try again");
                    addNewBooking2();
                } else {
                    listCustomer.get(Integer.parseInt(numberSelectCustomer)-1).setService(listVilla.get(numberSelectVilla-1));
                    System.out.println("Add Booking successfully");
                    saveInformationCustomer();
                    addNewBooking2();
                }
                break;
            case 2:
                for (int i=0;i<listHouse.size();i++) {
                    System.out.println("Số thứ tự "+(i+1)+":\n"+listHouse.get(i).showInfo());
                }
                System.out.println("Select House you want booking:");
                int numberSelectHouse = sc.nextInt();
                if (numberSelectHouse > listHouse.size()) {
                    System.out.println("Select error,please try again");
                    addNewBooking2();
                } else {
                    listCustomer.get(Integer.parseInt(numberSelectCustomer)-1).setService(listHouse.get(numberSelectHouse-1));
                    System.out.println("Add Booking successfully");
                    saveInformationCustomer();
                    addNewBooking2();
                }
                break;
            case 3:
                for (int i=0;i<listRoom.size();i++) {
                    System.out.println("Số thứ tự "+(i+1)+":\n"+listRoom.get(i).showInfo());
                    System.out.println("Select Room you want booking:");
                    int numberSelectRoom = sc.nextInt();
                    if (numberSelectRoom > listRoom.size()) {
                        System.out.println("Select error,please try again");
                        addNewBooking2();
                    } else {
                        listCustomer.get(Integer.parseInt(numberSelectCustomer)-1).setService(listRoom.get(numberSelectRoom-1));
                        System.out.println("Add Booking successfully");
                        saveInformationCustomer();
                        addNewBooking2();
                    }
                }
                break;
            case 4:
                displayMenu();
                break;
            default:
                System.out.println("Enter error,please try again");
                addNewBooking2();
        }
    }
//    public static void addNewBooking3(ArrayList<Service> listT) {
//        for (int i=0;i<listT.size();i++) {
//            System.out.println("Số thứ tự "+(i+1)+":\n"+listT.get(i).showInfo());
//        }
//        System.out.println("Select Service you want booking:");
//        int numberSelect = sc.nextInt();
//        if (numberSelect> listT.size()) {
//            System.out.println("Select error,please try again");
//            addNewBooking2();
//        } else {
//            listCustomer.get(numberSelectCustomer-1).setService(listT.get(numberSelect-1));
//            System.out.println("Add Booking successfully");
//            saveInformationCustomer();
//            addNewBooking2();
//        }
//    }
}

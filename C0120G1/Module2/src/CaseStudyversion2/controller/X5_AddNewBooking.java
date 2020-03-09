package CaseStudyversion2.controller;

import CaseStudyversion2.models.Customer;
import CaseStudyversion2.models.House;
import CaseStudyversion2.models.Room;
import CaseStudyversion2.models.Villa;

import java.util.ArrayList;

import static CaseStudyversion2.commons.SaveAndLoadBooking.loadBooking;
import static CaseStudyversion2.commons.SaveAndLoadBooking.saveBooking;
import static CaseStudyversion2.commons.SaveAndLoadHouse.loadFileHouse;
import static CaseStudyversion2.commons.SaveAndLoadInformationCustomer.loadInformationCustomer;
import static CaseStudyversion2.commons.SaveAndLoadInformationCustomer.saveInformationCustomer;
import static CaseStudyversion2.commons.SaveAndLoadRoom.loadFileRoom;
import static CaseStudyversion2.commons.SaveAndLoadVilla.loadFileVilla;
import static CaseStudyversion2.controller.X0_DisplayMenu.displayMenu;
import static CaseStudyversion2.controller.X1_x1_AddVilla.addVilla;
import static CaseStudyversion2.controller.X1_x2_AddHouse.addHouse;
import static CaseStudyversion2.controller.X1_x3_AddRoom.addRoom;
import static CaseStudyversion2.controller.X8_Delete.deleteBooKing;
import static CaseStudyversion2.views.MainRun.*;

public class X5_AddNewBooking {
    static String numberSelectCustomer;
    public static void addNewBooking() {
        loadInformationCustomer();
        System.out.println("Information Customer");
        if (listCustomer.size() == 0) {
            System.out.println("List information customer is null.Please add new Customer");
            displayMenu();
        } else {
            for (int i=0;i<listCustomer.size();i++) {
                if (listCustomer.get(i).getService() == null) {
                    System.out.println("Số thứ tự: "+(i+1)+"\nName: "+listCustomer.get(i).getName() +
                            "\nIdCustomer: "+listCustomer.get(i).getIdCustomer()+"\nStatus : Not registered");
                } else {
                    if (listCustomer.get(i).getService() instanceof Villa) {
                        System.out.println("Số thứ tự: "+(i+1)+"\nName: "+listCustomer.get(i).getName()+
                                "\nIdCustomer: "+listCustomer.get(i).getIdCustomer()+"\nStatus : Registered Villa");
                    }
                    if (listCustomer.get(i).getService() instanceof House) {
                        System.out.println("Số thứ tự: "+(i+1)+"\nName:"+listCustomer.get(i).getName() +
                                "\nIdCustomer: "+listCustomer.get(i).getIdCustomer()+"\nStatus : Registered House");
                    }
                    if (listCustomer.get(i).getService() instanceof Room) {
                        System.out.println("Số thứ tự: "+(i+1)+"\nName:"+listCustomer.get(i).getName() +
                                "\nIdCustomer: "+listCustomer.get(i).getIdCustomer()+"\nStatus : Registered Room");
                    }
                }
            }
        }
        System.out.println("Select Information Customer");
        numberSelectCustomer=sc.nextLine();
        if (Integer.parseInt(numberSelectCustomer) > listCustomer.size()) {
            System.out.println("Select error,please try again");
           addNewBooking();
        } else {
            if ((listCustomer.get(Integer.parseInt(numberSelectCustomer ) - 1).getService() == null)) {
                addNewBooking2();
            } else {
                System.out.println("This Customer registered.You want:\n"
                +"1.Register override\n"+"2.Register more\n"+"3.Back to menu");
                switch (Integer.parseInt( sc.nextLine())) {
                    case 1:

                        deleteBooKing();
                        addNewBooking2();
                        break;
                    case 2:
                        addNewBooking2();
                        break;
                    case 3:
                        displayMenu();
                        break;
                    default:
                        System.out.println("Enter error,please try again");
                        addNewBooking();
                }
            }
        }
    }
    public static void addNewBooking2() {
        System.out.println("1.Booking Villa\n" + "2.Booking House\n" + "3.Booking Room\n"+
                "4.Back to menu");
        switch (Integer.parseInt(sc.nextLine())) {
            case 1:
                loadFileVilla();
                if (listVilla.size() == 0) {
                    System.out.println("List information Villa is null.Please add new Villa");
                    System.out.println("Do you want register a Villa?\n1.Yes\n2.No");
                    switch (Integer.parseInt(sc.nextLine())) {
                        case 1:
                            addVilla();
                            System.out.println("Add Booking successfully");
                            loadBooking();
                            listCustomer.get(Integer.parseInt(numberSelectCustomer)-1).setService(listVilla.get(0));
                            listBooking.add(listCustomer.get(Integer.parseInt(numberSelectCustomer)-1));
                            saveBooking();
                            addNewBooking2();
                            break;
                        case 2:
                            displayMenu();
                            break;
                        default:
                            System.out.println("Enter error.Auto back to menu.");
                            displayMenu();
                    }
                } else {
                    for (int i=0;i<listVilla.size();i++) {
                        System.out.println("Số thứ tự "+(i+1)+":\n"+listVilla.get(i).showInfo());
                    }
                    System.out.println("Select Villa you want booking:");
                    int numberSelectVilla = Integer.parseInt(sc.nextLine());
                    if (numberSelectVilla > listVilla.size()) {
                        System.out.println("Select error,please try again");
                        addNewBooking2();
                    } else {
                        System.out.println("Add Booking successfully");
                        loadBooking();
                        listCustomer.get(Integer.parseInt(numberSelectCustomer)-1).setService(listVilla.get(numberSelectVilla-1));
                        listBooking.add(listCustomer.get(Integer.parseInt(numberSelectCustomer)-1));
                        saveBooking();
                        saveInformationCustomer();
                        addNewBooking2();
                    }
                }
                break;
            case 2:
                loadFileHouse();
                if (listHouse.size() == 0) {
                    System.out.println("List information House is null.Please add new House");
                    System.out.println("Do you want register a House?\n1.Yes\n2.No");
                    switch (Integer.parseInt(sc.nextLine())) {
                        case 1:
                            addHouse();
                            System.out.println("Add Booking successfully");
                            loadBooking();
                            listCustomer.get(Integer.parseInt(numberSelectCustomer)-1).setService(listHouse.get(0));
                            listBooking.add(listCustomer.get(Integer.parseInt(numberSelectCustomer)-1));
                            saveBooking();
                            saveInformationCustomer();
                            addNewBooking2();
                            break;
                        case 2:
                            displayMenu();
                            break;
                        default:
                            System.out.println("Enter error.Auto back to menu.");
                            displayMenu();
                    }
                } else {
                    for (int i=0;i<listHouse.size();i++) {
                        System.out.println("Số thứ tự "+(i+1)+":\n"+listHouse.get(i).showInfo());
                    }
                    System.out.println("Select House you want booking:");
                    int numberSelectHouse = Integer.parseInt(sc.nextLine());
                    if (numberSelectHouse > listHouse.size()) {
                        System.out.println("Select error,please try again");
                        addNewBooking2();
                    } else {
                        System.out.println("Add Booking successfully");
                        loadBooking();
                        listCustomer.get(Integer.parseInt(numberSelectCustomer)-1).setService(listHouse.get(numberSelectHouse-1));
                        listBooking.add(listCustomer.get(Integer.parseInt(numberSelectCustomer)-1));
                        saveBooking();
                        saveInformationCustomer();
                        addNewBooking2();
                    }
                }
                break;
            case 3:
                loadFileRoom();
                if (listRoom.size() == 0) {
                    System.out.println("List information Room is null.Please add new Room");
                    System.out.println("Do you want register a Room?\n1.Yes\n2.No");
                    switch (Integer.parseInt(sc.nextLine())) {
                        case 1:
                            addRoom();
                            System.out.println("Add Booking successfully");
                            loadBooking();
                            listCustomer.get(Integer.parseInt(numberSelectCustomer)-1).setService(listRoom.get(0));
                            listBooking.add(listCustomer.get(Integer.parseInt(numberSelectCustomer)-1));
                            saveBooking();
                            saveInformationCustomer();
                            addNewBooking2();
                            break;
                        case 2:
                            displayMenu();
                            break;
                        default:
                            System.out.println("Enter error.Auto back to menu.");
                            displayMenu();
                    }
                } else {
                    for (int i=0;i<listRoom.size();i++) {
                        System.out.println("Số thứ tự "+(i+1)+":\n"+listRoom.get(i).showInfo());
                        System.out.println("Select Room you want booking:");
                        int numberSelectRoom = Integer.parseInt(sc.nextLine());
                        if (numberSelectRoom > listRoom.size()) {
                            System.out.println("Select error,please try again");
                            addNewBooking2();
                        } else {
                            System.out.println("Add Booking successfully");
                            loadBooking();
                            listCustomer.get(Integer.parseInt(numberSelectCustomer)-1).setService(listRoom.get(numberSelectRoom-1));
                            listBooking.add(listCustomer.get(Integer.parseInt(numberSelectCustomer)-1));
                            System.out.println("Add Booking successfully");
                            saveBooking();
                            saveInformationCustomer();
                            addNewBooking2();
                        }
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
//            listCustomer.get(Integer.parseInt(numberSelectCustomer)-1).setService(listT.get(numberSelect-1));
//            System.out.println("Add Booking successfully");
//            saveBooking();
//            addNewBooking2();
//        }
//    }
}

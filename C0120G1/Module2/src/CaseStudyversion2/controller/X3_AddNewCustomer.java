package CaseStudyversion2.controller;

import CaseStudyversion2.models.Customer;
import CaseStudyversion2.models.Service;

import static CaseStudyversion2.commons.FuncValidation.checkNumberInteger;
import static CaseStudyversion2.commons.FuncValidation.checkString;
import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.saveFileX;
import static CaseStudyversion2.controller.X0_DisplayMenu.displayMenu;
import static CaseStudyversion2.views.MainRun.listCustomer;


public class X3_AddNewCustomer {
    public static void addNewCustomer() {
        String regex = "";
        Service newCustomer = new Customer();
        regex = "^[A-Z]([a-z]+)(( [A-Z]([a-z]+))+)*$";
        System.out.println("Enter NameCustomer:");
        ((Customer) newCustomer).setName(checkString(regex, "Enter NameCustomer failed"));
        regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19[7-9][0-9]|200[0-2])$";
        System.out.println("Enter BirthdayCustomer:dd/mm/yyyy,y:from 1970 to 2002");
        ((Customer) newCustomer).setBirth(checkString(regex, "Enter BirthdayCustomer failed"));
        regex = "^[mM][aA][lL][eE]|[fF][eE][mM][aA][lL][eE]|[uU][nN][kK][nN][oO][wW][nN]$";
        System.out.println("Enter sex:Male,Female,Unknown");
        String birth=checkString(regex, "Enter Sex failed");
        String birth1 = "";
        for (int i = 0; i < birth.length(); i++) {
            if (i == 0) {
                birth1 += birth.toUpperCase().charAt(i);
            } else {
                birth1 += birth.toLowerCase().charAt(i);
            }
        }
        ((Customer) newCustomer).setSex(birth1);
        regex = "^[0-9]{9}$";
        System.out.println("Enter IdCustomer: 9 numbers");
        ((Customer) newCustomer).setIdCustomer(checkNumberInteger(regex, "Enter IdCustomer failed"));
        regex = "^(070|076|077|078|079|089|090|093)[0-9]{7}$";
        System.out.println("Enter NumberPhone:(070/076/077/078/079/089/090/093-7numbers)");
        ((Customer) newCustomer).setNumberPhone(checkNumberInteger(regex, "Enter NumberPhone failed"));
        regex = "^[0-9a-zA-Z]+([_.]?[0-9a-zA-Z]+)*@[0-9a-zA-Z]+([_.]?[0-9a-zA-Z]+)*.[a-z]{2,3}$";
        System.out.println("Enter EmailCustomer:");
        ((Customer) newCustomer).setEmail(checkString(regex, "Enter Email failed"));
        regex = "^[rR][eE][nN][tT][vV][iI][lL][lL][aA]|[rR][eE][nN][tT][hH][oO][uU][sS][eE]|[rR][eE][nN][tT][hH][oO][mM][eE]$";
        System.out.println("Enter TypeCustomer:RentVilla/RentHouse/RentHome");
        String type=checkString(regex, "Enter TypeCustomer failed");
        String type1 = "";
        for (int i = 0; i < type.length(); i++) {
            if (i == 0) {
                type1 += type.toUpperCase().charAt(i);
            } else {
                type1 += type.toLowerCase().charAt(i);
            }
        }
        ((Customer) newCustomer).setTypeCustomer(type1);
        regex = "^[A-Z]([a-z]+)(( [A-Z]([a-z]+))+)*$";
        System.out.println("Enter Address:");
        ((Customer) newCustomer).setAddress(checkString(regex, "Enter Address failed"));
        //Show add new Customer Successfully
        System.out.println("Add new Customer successfully");
        System.out.println(newCustomer.showInfo());
        listCustomer.add((Customer)newCustomer);
        boolean check=saveFileX(listCustomer,"F:\\ProjectCodyGym\\C0120G1\\Module2\\src\\CaseStudyversion2\\data\\saveCustomer.csv");
        if (check) {
            System.out.println("Save Information Customer successfully");
        } else {
            System.out.println("Save Information Customer Failed,try again");
        }
        displayMenu();
    }
}

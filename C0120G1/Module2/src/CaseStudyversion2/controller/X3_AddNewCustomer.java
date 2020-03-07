package CaseStudyversion2.controller;

import CaseStudyversion2.models.Customer;
import CaseStudyversion2.models.Service;

import static CaseStudyversion2.commons.FuncValidationCustomer.checkCustomer;

public class X3_AddNewCustomer {
    public static void addNewCustomer() {
        Service newCustomer = new Customer();
        String regex = "^[A-Z]([a-z]+)(( [A-Z]([a-z]+))+)*$";
        System.out.println("Enter NameCustomer:");
        ((Customer) newCustomer).setName(checkCustomer(regex, "NameCustomer failed"));
        regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19[7-9][0-9]|200[0-2])$";
        System.out.println("BirthdayCustomer:from 1970 to 2002");
        ((Customer) newCustomer).setBirth(checkCustomer(regex, "BirthdayCustomer failed"));
    }
}

package CaseStudyversion2.controller;

import CaseStudyversion2.models.Customer;
import CaseStudyversion2.models.Employee;


import static CaseStudyversion2.commons.FuncValidation.checkNumberInteger;
import static CaseStudyversion2.commons.FuncValidation.checkString;
import static CaseStudyversion2.commons.SaveAndLoadEmployee.loadFileEmployee;
import static CaseStudyversion2.commons.SaveAndLoadEmployee.saveFileEmployee;

import static CaseStudyversion2.views.MainRun.listCustomer;
import static CaseStudyversion2.views.MainRun.listEmployee;

public class X7_AddNewEmployee {
    public static void addNewEmployee() {
        String regex ;
        Employee newEmployee = new Employee();
        regex = "^[A-Z]([a-z]+)(( [A-Z]([a-z]+))+)*$";
        System.out.println("Enter NameEmployee:");
        newEmployee.setNameEmployee(checkString(regex, "Enter NameEmployee failed"));
        regex = "^[0-9]{3}$";
        System.out.println("Enter IdEmployee: 3 numbers");
        newEmployee.setIdEmployee(checkNumberInteger(regex, "Enter IdEmployee failed"));
        regex = "^[1-9]|[0-9]{2}$";
        System.out.println("Enter AgeEmployee: 1-99");
        newEmployee.setAgeEmployee(checkNumberInteger(regex, "Enter AgeEmployee failed"));
        regex = "^[A-Z]([a-z]+)(( [A-Z]([a-z]+))+)*$";
        System.out.println("Enter Address:");
        newEmployee.setAddressEmployee(checkString(regex, "Enter Address failed"));
        System.out.println("Add new Employee successfully");
        System.out.println(newEmployee.toString());
        loadFileEmployee();
        listEmployee.add(newEmployee);
        saveFileEmployee();
    }
}

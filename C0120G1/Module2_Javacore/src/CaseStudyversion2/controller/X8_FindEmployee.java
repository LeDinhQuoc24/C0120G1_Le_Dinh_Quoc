package CaseStudyversion2.controller;

import CaseStudyversion2.models.Employee;
import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;


import static CaseStudyversion2.commons.SaveAndLoad.loadFileEmployee;
import static CaseStudyversion2.controller.X0_DisplayMenu.displayMenu;
import static CaseStudyversion2.views.MainRun.listEmployee;
import static CaseStudyversion2.views.MainRun.sc;

public class X8_FindEmployee {
    public static void findEmployee() {
        System.out.println("1.Find by Id\n"+"2.Find by Name\n"+"3.Back to Menu");
        switch (Integer.parseInt(sc.nextLine())) {
            case 1:
                findEmployeeById();
                findEmployee();
                break;
            case 2:
                findEmployeeByName();
                findEmployee();
                break;
            case 3:
                displayMenu();
                break;
            default:
                System.out.println("Enter error,please try again");
                findEmployee();
        }
    }
    public static void findEmployeeById() {
        loadFileEmployee();
        //init Map
        Map<Integer, Employee> map = new HashMap<>();
        for (int i = 0; i < listEmployee.size(); i++) {
            map.put(listEmployee.get(i).getIdEmployee(), listEmployee.get(i));
        }
        //show map
//        Set<Integer> set = map.keySet();
//        for (Integer key : set) {
//            System.out.println(key + " " + map.get(key));
//        }
        System.out.println("Enter IdEmployee to find:");
        int key = Integer.parseInt(sc.nextLine());
        if (map.get(key) != null) {
            System.out.println(key + " " + map.get(key));
        } else {
            System.out.println("IdEmployee is not found");
        }
    }
    public static void findEmployeeByName() {
        System.out.println("Enter NameEmployee to find:");
        String name = sc.nextLine();
        loadFileEmployee();
        Stack<Employee> stackEmployee = new Stack<>();
        for (int i = 0; i < listEmployee.size(); i++) {
            stackEmployee.push(listEmployee.get(i));
        }
        boolean check=true;
        for (int i = 0; i < stackEmployee.size(); i++) {
            if (stackEmployee.get(i).getNameEmployee().equals(name)) {
                System.out.println(stackEmployee.get(i));
                check=false;
            }
        }
        if (check) {
            System.out.println("NameEmployee is not found");
        }
    }
}

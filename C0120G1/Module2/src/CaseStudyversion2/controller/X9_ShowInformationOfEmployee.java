package CaseStudyversion2.controller;


import CaseStudyversion2.commons.Comparator2;
import CaseStudyversion2.models.Employee;

import java.util.Collections;
import java.util.Stack;


import static CaseStudyversion2.commons.SaveAndLoad.loadFileEmployee;
import static CaseStudyversion2.views.MainRun.listEmployee;

public class X9_ShowInformationOfEmployee {
    public static void showInformationOfEmployee() {
        loadFileEmployee();
        System.out.println("Load file Information Employee successfully");
        System.out.println("\nxxxxxxxxxxxxx ListEmployee xxxxxxxxxxxxxxx\n\n");
//        Comparator2 comparator2 = new Comparator2();
//        Collections.sort(listEmployee,comparator2);
//        for (int i = 0; i < listEmployee.size(); i++) {
//            System.out.println((i+1)+"."+listEmployee.get(i).toString());
//        }
        Stack<Employee> stackEmployee = new Stack<>();
        for (int i = 0; i < listEmployee.size(); i++) {
            stackEmployee.push(listEmployee.get(i));
        }
        int Count=1;
        while(!stackEmployee.isEmpty()){
            System.out.print("Số thứ tự "+Count+"\t"+stackEmployee.peek() + "\n");
            stackEmployee.pop();
            Count++;
        }
    }
}

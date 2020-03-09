package CaseStudyversion2.controller;

import CaseStudyversion2.models.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static CaseStudyversion2.commons.SaveAndLoadEmployee.loadFileEmployee;
import static CaseStudyversion2.views.MainRun.listEmployee;
import static CaseStudyversion2.views.MainRun.sc;

public class X8_FindEmployeeById {
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
}

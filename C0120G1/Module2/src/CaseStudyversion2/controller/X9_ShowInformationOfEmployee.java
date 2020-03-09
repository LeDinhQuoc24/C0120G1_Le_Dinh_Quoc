package CaseStudyversion2.controller;


import CaseStudyversion2.commons.Comparator2;

import java.util.Collections;


import static CaseStudyversion2.commons.SaveAndLoad.loadFileEmployee;
import static CaseStudyversion2.views.MainRun.listEmployee;

public class X9_ShowInformationOfEmployee {
    public static void showInformationOfEmployee() {
        loadFileEmployee();
        System.out.println("Load file Information Employee successfully");
        System.out.println("\nxxxxxxxxxxxxx ListEmployee xxxxxxxxxxxxxxx\n\n");
        Comparator2 comparator2 = new Comparator2();
        Collections.sort(listEmployee,comparator2);
        for (int i = 0; i < listEmployee.size(); i++) {
            System.out.println((i+1)+"."+listEmployee.get(i).toString());
        }
    }
}

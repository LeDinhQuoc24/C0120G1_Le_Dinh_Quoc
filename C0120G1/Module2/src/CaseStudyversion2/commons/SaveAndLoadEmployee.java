package CaseStudyversion2.commons;

import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.readFileX;
import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.saveFileX;
import static CaseStudyversion2.views.MainRun.listEmployee;
import static CaseStudyversion2.views.MainRun.pathEmployee;


public class SaveAndLoadEmployee {
    public static void saveFileEmployee() {
        boolean check = saveFileX(listEmployee,pathEmployee);
        if (check) {
            System.out.println("Save file succesfully");
        } else {
            System.out.println("Save file failled");
        }
    }
    public static void loadFileEmployee() {
        listEmployee= readFileX(pathEmployee);
    }
}

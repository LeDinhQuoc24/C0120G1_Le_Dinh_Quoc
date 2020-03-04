package CaseStudy.Task1.controller;


import CaseStudy.Task1.commons.FuncWriteAndReadFileCSV;
import static CaseStudy.Task1.views.MainController.ListService;

public class SaveFile {
    private void saveFile() {
        boolean check = FuncWriteAndReadFileCSV.saveFile(ListService, "F:\\ProjectCodyGym\\C0120G1\\Module2\\src\\CaseStudy\\Task1\\data");
        if (check) {
            System.out.println("Save file succesfully");
        } else {
            System.out.println("Save file failled");
        }
    }
}

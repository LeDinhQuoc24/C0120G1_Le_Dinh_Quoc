package CaseStudyversion2.controller;





import CaseStudyversion2.models.House;

import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.readFileHouse;
import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.saveFileHouse;
import static CaseStudyversion2.views.MainRun.listHouse;

public class SaveAndLoadFile {
    public static void saveFile() {
        boolean check = saveFileHouse(listHouse, "F:\\ProjectCodyGym\\C0120G1\\Module2\\src\\CaseStudyversion2\\data\\main1.csv");
        if (check) {
            System.out.println("Save file succesfully");
        } else {
            System.out.println("Save file failled");
        }
    }
    public static void loadFile() {
        listHouse= readFileHouse("F:\\ProjectCodyGym\\C0120G1\\Module2\\src\\CaseStudyversion2\\data\\main1.csv");
        System.out.println("Load file succesfully");
        for (House house : listHouse) {
            System.out.println(house.showInfo());
        }

    }
}

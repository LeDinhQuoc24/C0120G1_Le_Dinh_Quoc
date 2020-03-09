package CaseStudyversion2.commons;

import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.readFileX;
import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.saveFileX;
import static CaseStudyversion2.views.MainRun.listRoom;
import static CaseStudyversion2.views.MainRun.pathRoom;

public class SaveAndLoadRoom {
    public static void saveFileRoom() {
        boolean check = saveFileX(listRoom, pathRoom);
        if (check) {
            System.out.println("Save file succesfully");
        } else {
            System.out.println("Save file failled");
        }
    }
    public static void loadFileRoom() {
        listRoom= readFileX( pathRoom);
    }
}

package CaseStudyversion2.commons;

import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.readFileX;
import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.saveFileX;
import static CaseStudyversion2.views.MainRun.*;

public class SaveAndLoadHouse {
    public static void saveFileHouse() {
        boolean check = saveFileX(listHouse, pathHouse);
        if (check) {
            System.out.println("Save file succesfully");
        } else {
            System.out.println("Save file failled");
        }
    }
    public static void loadFileHouse() {
        listHouse= readFileX( pathHouse);
    }
}

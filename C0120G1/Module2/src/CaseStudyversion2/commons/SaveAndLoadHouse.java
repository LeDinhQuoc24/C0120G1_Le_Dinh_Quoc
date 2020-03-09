package CaseStudyversion2.commons;

import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.readFileX;
import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.saveFileX;
import static CaseStudyversion2.views.MainRun.*;

public class SaveAndLoadHouse {
    public static void saveFileHouse() {
        boolean check = saveFileX(listHouse, "D:\\CodeGym\\ProjectCodeGym\\C0120G1_Le_Dinh_Quoc\\C0120G1\\Module2\\src\\CaseStudyversion2\\data2\\saveHouse.csv");
        if (check) {
            System.out.println("Save file succesfully");
        } else {
            System.out.println("Save file failled");
        }
    }
    public static void loadFileHouse() {
        listHouse= readFileX("D:\\CodeGym\\ProjectCodeGym\\C0120G1_Le_Dinh_Quoc\\C0120G1\\Module2\\src\\CaseStudyversion2\\data2\\saveHouse.csv");
    }
}

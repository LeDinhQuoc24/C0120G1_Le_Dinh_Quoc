package CaseStudyversion2.controller;





import CaseStudyversion2.models.House;
import CaseStudyversion2.models.Room;
import CaseStudyversion2.models.Villa;

import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.*;
import static CaseStudyversion2.views.MainRun.*;

public class X8_9_SaveAndLoadFile {
    public static void saveFile() {
        boolean check1 = saveFileX(listVilla,"F:\\ProjectCodyGym\\C0120G1\\Module2\\src\\CaseStudyversion2\\data\\saveVilla.csv");
        boolean check2 = saveFileX(listHouse, "F:\\ProjectCodyGym\\C0120G1\\Module2\\src\\CaseStudyversion2\\data\\saveHouse.csv");
        boolean check3 = saveFileX(listRoom, "F:\\ProjectCodyGym\\C0120G1\\Module2\\src\\CaseStudyversion2\\data\\saveRoom.csv");
        if (check3&&check1&&check2) {
            System.out.println("Save file succesfully");
        } else {
            System.out.println("Save file failled");
        }
    }
    public static void loadFile() {
        System.out.println("Load file succesfully\n\n");
        System.out.println("xxxxxxxxxxxxList Servicexxxxxxxxxxxxxxx\n\n");
        listCustomer=readFileX("F:\\ProjectCodyGym\\C0120G1\\Module2\\src\\CaseStudyversion2\\data\\saveCustomer.csv");

        listVilla= readFileX("F:\\ProjectCodyGym\\C0120G1\\Module2\\src\\CaseStudyversion2\\data\\saveVilla.csv");
        System.out.println("Villa:");
        for (Villa villa : listVilla) {
            System.out.println(villa.showInfo());
        }
        System.out.println("\n\n");
        listHouse= readFileX("F:\\ProjectCodyGym\\C0120G1\\Module2\\src\\CaseStudyversion2\\data\\saveHouse.csv");
        System.out.println("House:");
        for (House house : listHouse) {
            System.out.println(house.showInfo());
        }
        System.out.println("\n\n");
        listRoom= readFileX("F:\\ProjectCodyGym\\C0120G1\\Module2\\src\\CaseStudyversion2\\data\\saveRoom.csv");
        System.out.println("Room:");
        for (Room room : listRoom) {
            System.out.println(room.showInfo());
        }
        System.out.println("\n\n");
    }
}

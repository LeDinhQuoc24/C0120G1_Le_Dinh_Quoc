package CaseStudyversion2.commons;

import java.util.ArrayList;

import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.readFileX;
import static CaseStudyversion2.commons.FuncWriteAndReadFileCSV.saveFileX;
import static CaseStudyversion2.views.MainRun.*;
import static CaseStudyversion2.views.MainRun.pathCustomer;


public class SaveAndLoad {
    public static void saveFileVilla() {
        saveFile(listVilla,pathVilla,"Villa");
    }
    public static void loadFileVilla() {
        listVilla=readFileX(pathVilla);
    }
    public static void saveFileHouse() {
        saveFile(listHouse,pathHouse,"House");
    }
    public static void loadFileHouse() {
        listHouse=readFileX(pathHouse);
    }
    public static void saveFileRoom() {
        saveFile(listRoom,pathRoom,"Room");
    }
    public static void loadFileRoom() {
        listRoom=readFileX(pathRoom);
    }
    public static void saveBooking() {
        saveFile(listBooking,pathBooking,"Booking");
    }
    public static void loadBooking() {
        listBooking=readFileX(pathBooking);
    }
    public static void saveFileEmployee() {
        saveFile(listEmployee,pathEmployee,"Employee");
    }
    public static void loadFileEmployee() {
        listEmployee=readFileX(pathEmployee);
    }
    public static void saveInformationCustomer() {
        saveFile(listCustomer,pathCustomer,"Customer");
    }
    public static void loadInformationCustomer() {
        listCustomer=readFileX(pathCustomer);
    }

    public static <T> void saveFile(ArrayList<T> listT, String path, String name) {
        boolean check=saveFileX(listT,path);
        if (check) {
            System.out.println("Save "+name+" successfully");
        } else {
            System.out.println("Save "+name+" Failed,try again");
        }
    }
}

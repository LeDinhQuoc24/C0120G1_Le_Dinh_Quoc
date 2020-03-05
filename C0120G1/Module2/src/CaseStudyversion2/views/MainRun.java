package CaseStudyversion2.views;


import CaseStudyversion2.models.House;
import CaseStudyversion2.models.Room;
import CaseStudyversion2.models.Villa;

import java.util.ArrayList;

import static CaseStudyversion2.controller.DisplayMenu.displayMenu;

public class MainRun {
    static public ArrayList<House> listHouse = new ArrayList<House>();
    static public ArrayList<Room> listRoom = new ArrayList<Room>();
    static public ArrayList<Villa> listVilla = new ArrayList<Villa>();
    public static void main(String[] args) {
        displayMenu();
    }
}
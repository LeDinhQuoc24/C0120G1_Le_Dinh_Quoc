package CaseStudyversion2.commons;


import CaseStudy.models.Service;
import CaseStudyversion2.models.House;
import CaseStudyversion2.models.Room;
import CaseStudyversion2.models.Villa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FuncWriteAndReadFileCSV {
    public static boolean saveFileHouse(ArrayList<House> listHouse, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject( listHouse);
            oos.close();
            fos.close();
            return true;
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    public static boolean saveFileVilla(ArrayList<Villa> listVilla, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject( listVilla);
            oos.close();
            fos.close();
            return true;
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    public static boolean saveFileRoom(ArrayList<Room> listRoom, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject( listRoom);
            oos.close();
            fos.close();
            return true;
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    public static ArrayList<House> readFileHouse(String path){
        ArrayList<House> listHouse = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream (fis);
            Object data = ois.readObject();
            listHouse = (ArrayList<House>) data;
            ois.close();
            fis.close();
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return listHouse;
    }
    public static ArrayList<Villa> readFileVilla(String path){
        ArrayList<Villa> listVilla = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream (fis);
            Object data = ois.readObject();
            listVilla = (ArrayList<Villa>) data;
            ois.close();
            fis.close();
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return listVilla;
    }
    public static ArrayList<Room> readFileRoom(String path){
        ArrayList<Room> listRoom = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream (fis);
            Object data = ois.readObject();
            listRoom = (ArrayList<Room>) data;
            ois.close();
            fis.close();
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return listRoom;
    }
}

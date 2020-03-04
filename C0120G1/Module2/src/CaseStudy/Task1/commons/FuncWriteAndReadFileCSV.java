package CaseStudy.Task1.commons;


import CaseStudy.Task1.models.Service;
import CaseStudy.Task1.models.Villa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FuncWriteAndReadFileCSV {
    public static boolean saveFile(ArrayList<Service> ListService, String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject( ListService);
            oos.close();
            fos.close();
            return true;
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
    public static ArrayList<Service> readFile(String path){
        ArrayList<Service> ListService = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream (fis);
            Object data = ois.readObject();
            ListService = (ArrayList<Service>) data;
            ois.close();
            fis.close();
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return ListService;
    }
}

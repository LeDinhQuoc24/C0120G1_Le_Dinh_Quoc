package CaseStudyversion2.controller;

import CaseStudyversion2.models.Viewer;


import java.util.LinkedList;
import java.util.Queue;

import static CaseStudyversion2.commons.FuncValidation.checkNumberInteger;
import static CaseStudyversion2.commons.FuncValidation.checkString;
import static CaseStudyversion2.commons.SaveAndLoad.*;
import static CaseStudyversion2.controller.X0_DisplayMenu.displayMenu;
import static CaseStudyversion2.views.MainRun.*;

public class X11_Service_Film4D {
    public static void serviceFilm4D() {
        String regex;
        System.out.println("1.Register ticket\n"+ "2.Show list Viewer\n"+"3.Back to Menu");
        switch (Integer.parseInt(sc.nextLine())) {
            case 1:
                Viewer newViewer = new Viewer();
                regex = "^[A-Z]([a-z]+)(( [A-Z]([a-z]+))+)*$";
                System.out.println("Enter NameViewer:");
                newViewer.setNameViewer(checkString(regex, "Enter NameViewer failed"));
                regex = "^[0-9]{3}$";
                System.out.println("Enter IdViewer: 3 numbers");
                newViewer.setIdViewer(checkNumberInteger(regex, "Enter IdViewer failed"));
                System.out.println("Add new Viewer successfully");
                System.out.println(newViewer.toString());
                loadFileViewer();
                listViewer.add(newViewer);
                saveFileViewer();
                break;
            case 2:
                showListViewer();
                break;
            case 3:
                displayMenu();
                break;
            default:
                System.out.println("Enter error,please try again");
                serviceFilm4D();
        }
    }
    public static void  showListViewer() {
        loadFileViewer();
        System.out.println("*********** List Viewer **************");
        Queue<Viewer> queueViewer=new LinkedList<>() ;
        for (int i = 0; i < listViewer.size(); i++) {
            queueViewer.offer(listViewer.get(i));
        }
        int count=1;
        for (Viewer item : queueViewer) {
            System.out.println("Số thứ tự : "+count+"\t"+item);
            count++;
        }
    }
}

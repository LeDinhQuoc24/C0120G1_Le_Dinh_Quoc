package CaseStudy.controller;

import java.util.Scanner;

import static CaseStudy.commons.FuncWriteAndReadFileCSV.saveFile;
import static CaseStudy.controller.Register.register;

public class Menu {
    public static void menu() {
        System.out.println("Menu");
        System.out.println("1.Add New Services");
        System.out.println("2.Show Services");
        System.out.println("3.Add New Customer");
        System.out.println("4.Show Information of Customer");
        System.out.println("5.Add New Booking");
        System.out.println("6.Show Information of Employee");
        System.out.println("7.Save File");
        System.out.println("8.Load File");
        System.out.println("9.Exit");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                register();
                break;
            case 2:
                Display.display();
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Number 3-6:Don't finish,please select other number.");
                menu();
                break;
            case 7:
                SaveAndLoadFile.saveFile();
                menu();
            case 8:
                SaveAndLoadFile.loadFile();
                menu();

            case 9:
            default:
                Exit.exit();
        }
    }
}


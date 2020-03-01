package CaseStudy.Task1.controller;

import CaseStudy.Task1.models.Service;

import java.util.ArrayList;
import java.util.Scanner;

public class MainCaseStudy1 {
    ArrayList<Service> services = new ArrayList<>();
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        System.out.println("Menu");
        System.out.println("1.Register");
        System.out.println("2.Display");
        System.out.println("3.Exit");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                register();
            case 2:
                display();
            case 3:
            default:
                exit();
        }
    }
    public static void register() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select type Register");
        System.out.println("1.Villa");
        System.out.println("2.House");
        System.out.println("3.Room");
        switch (sc.nextInt()) {
            case 1:
                registerVilla();
            case 2:
                registerHouse();
            case 3:
                registerRoom();
            default:
                System.out.println("Enter error,try again");
        }
    }
    public static void registerVilla() {

    }
    public static void registerHouse() {

    }
    public static void registerRoom() {

    }

    public static void display() {

    }
    public static void exit() {

    }

}

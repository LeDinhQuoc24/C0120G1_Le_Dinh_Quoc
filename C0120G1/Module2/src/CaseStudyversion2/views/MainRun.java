package CaseStudyversion2.views;


import CaseStudyversion2.models.*;

import java.util.ArrayList;
import java.util.Scanner;

import static CaseStudyversion2.controller.X0_DisplayMenu.displayMenu;

public class MainRun {
    static public Scanner sc = new Scanner(System.in);
    static public ArrayList<Customer> listCustomer = new ArrayList<>();
    static public ArrayList<Customer> listBooking = new ArrayList<>();
    static public ArrayList<House> listHouse = new ArrayList<>();
    static public ArrayList<Room> listRoom = new ArrayList<>();
    static public ArrayList<Villa> listVilla = new ArrayList<>();
    public static void main(String[] args) {
        displayMenu();
    }
}
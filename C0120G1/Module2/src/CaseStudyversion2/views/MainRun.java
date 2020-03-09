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
    static public ArrayList<Employee> listEmployee = new ArrayList<>();
    static public String pathVilla="D:\\CodeGym\\ProjectCodeGym\\C0120G1_Le_Dinh_Quoc\\C0120G1\\Module2\\src\\CaseStudyversion2\\data2\\saveVilla.csv";
    static public String pathHouse="D:\\CodeGym\\ProjectCodeGym\\C0120G1_Le_Dinh_Quoc\\C0120G1\\Module2\\src\\CaseStudyversion2\\data2\\saveHouse.csv";
    static public String pathRoom="D:\\CodeGym\\ProjectCodeGym\\C0120G1_Le_Dinh_Quoc\\C0120G1\\Module2\\src\\CaseStudyversion2\\data2\\saveRoom.csv";
    static public String pathCustomer="D:\\CodeGym\\ProjectCodeGym\\C0120G1_Le_Dinh_Quoc\\C0120G1\\Module2\\src\\CaseStudyversion2\\data2\\saveCustomer.csv";
    static public String pathBooking="D:\\CodeGym\\ProjectCodeGym\\C0120G1_Le_Dinh_Quoc\\C0120G1\\Module2\\src\\CaseStudyversion2\\data2\\saveBooking.csv";
    static public String pathEmployee="D:\\CodeGym\\ProjectCodeGym\\C0120G1_Le_Dinh_Quoc\\C0120G1\\Module2\\src\\CaseStudyversion2\\data2\\saveEmployee.csv";
    public static void main(String[] args) {
        displayMenu();
    }
}
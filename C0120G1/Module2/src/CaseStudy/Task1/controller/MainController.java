package CaseStudy.Task1.controller;

import CaseStudy.Task1.models.House;
import CaseStudy.Task1.models.Room;
import CaseStudy.Task1.models.Service;
import CaseStudy.Task1.models.Villa;

import java.util.ArrayList;
import java.util.Scanner;

public class MainController {
    static ArrayList<Service> Services = new ArrayList<>();
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        System.out.println("Menu");
        System.out.println("1.Add New Services");
        System.out.println("2.Show Services");
        System.out.println("3.Add New Customer");
        System.out.println("4.Show Information of Customer");
        System.out.println("5.Add New Booking");
        System.out.println("6.Show Information of Employee");
        System.out.println("7.Exit");
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()) {
            case 1:
                register();
                break;
            case 2:
                display();
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Number 3-6:Don't finish,please select other number.");
                menu();
                break;
            case 7:
            default:
                exit();
        }
    }
    public static void register() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select type Register");
        System.out.println("1.Add New Villa");
        System.out.println("2.Add New House");
        System.out.println("3.Add New Room");
        System.out.println("4.Back to Menu");
        switch (sc.nextInt()) {
            case 1:
                registerVilla();
                break;
            case 2:
                registerHouse();
                break;
            case 3:
                registerRoom();
                break;
            case 4:
                menu();
                break;
            default:
                System.out.println("Enter error,try again");
        }
    }
    public static void registerVilla() {
        Scanner sc = new Scanner(System.in);
        Villa villa = new Villa();
        System.out.println("Nhập ID:123/234/345");
        villa.setId(sc.nextLine());
        System.out.println("Nhập tên dịch vụ:villa1,villa2,villa3");
        villa.setNameService(sc.nextLine());
        System.out.println("Nhập diện tích sử dụng:100,200,300");
        villa.setAreaUsed(sc.nextDouble());
        System.out.println("Nhập chi phí thuê:300,500,1000");
        villa.setRentalCosts(sc.nextDouble());
        System.out.println("Nhập số người tối đa");
        villa.setMaxNumberOfPeople(sc.nextInt());
        System.out.println("Nhập kiểu thuê:prePays,afterPay");
        villa.setTypeOfRent(sc.nextLine());
        sc.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng:3 stars,4 stars,5 stars");
        villa.setRoomStandard(sc.nextLine());
        System.out.println("Nhập tiện nghi khác:Karaoke,Massage,Bowling");
        villa.setOtherDescriptionOfUtilities(sc.nextLine());
        System.out.println("Nhập số tầng");
        villa.setNumberOfFloors(sc.nextInt());
        System.out.println("Nhập diện tích bể bơi:20,50,100");
        villa.setPoolArea(sc.nextDouble());
        Services.add(villa);
        menu();

    }
    public static void registerHouse() {
        Scanner sc = new Scanner(System.in);
        House house=new House();
        System.out.println("Nhập ID:123/234/345");
        house.setId(sc.nextLine());
        System.out.println("Nhập tên dịch vụ:house1,house2,house3");
        house.setNameService(sc.nextLine());
        System.out.println("Nhập diện tích sử dụng:100,200,300");
        house.setAreaUsed(sc.nextDouble());
        System.out.println("Nhập chi phí thuê:300,500,1000");
        house.setRentalCosts(sc.nextDouble());
        System.out.println("Nhập số người tối đa");
        house.setMaxNumberOfPeople(sc.nextInt());
        System.out.println("Nhập kiểu thuê:prePays,afterPay");
        house.setTypeOfRent(sc.nextLine());
        sc.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng:3 stars,4 stars,5 stars");
        house.setRoomStandard(sc.nextLine());
        System.out.println("Nhập tiện nghi khác:Karaoke,Massage,Bowling");
        house.setOtherDescriptionOfUtilities(sc.nextLine());
        System.out.println("Nhập số tầng");
        house.setNumberOfFloors(sc.nextInt());
        Services.add(house);
        menu();

    }
    public static void registerRoom() {
        Scanner sc = new Scanner(System.in);
        Room room=new Room();
        System.out.println("Nhập ID:123/234/345");
        room.setId(sc.nextLine());
        System.out.println("Nhập tên dịch vụ:room1,room2,room3");
        room.setNameService(sc.nextLine());
        System.out.println("Nhập diện tích sử dụng:100,200,300");
        room.setAreaUsed(sc.nextDouble());
        System.out.println("Nhập chi phí thuê:300,500,1000");
        room.setRentalCosts(sc.nextDouble());
        System.out.println("Nhập số người tối đa");
        room.setMaxNumberOfPeople(sc.nextInt());
        System.out.println("Nhập kiểu thuê:prePays,afterPay");
        room.setTypeOfRent(sc.nextLine());
        sc.nextLine();
        System.out.println("Nhập dịch vụ miễn phí kèm theo:Jav1,Jav2,Jav3");
        room.setFreeService(sc.nextLine());
        Services.add(room);
        menu();

    }

    public static void display() {
        for (Service service : Services) {
            System.out.println(service.showInfo());
        }

    }
    public static void exit() {
        System.out.println("Trường Kỳ Code Gym Nhất Định Phát Khùng");

    }

}

package CaseStudy.Task1.controller;

import CaseStudy.Task1.models.Villa;

import java.util.Scanner;

import static CaseStudy.Task1.controller.Menu.menu;
import static CaseStudy.Task1.views.MainController.Services;

public class RegisterVilla {
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
}
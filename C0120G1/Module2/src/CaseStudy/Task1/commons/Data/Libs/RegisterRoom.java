package CaseStudy.Task1.commons.Data.Libs;

import CaseStudy.Task1.models.Room;

import java.util.Scanner;

import static CaseStudy.Task1.commons.Data.Libs.Menu.menu;
import static CaseStudy.Task1.controller.MainController.Services;

public class RegisterRoom {
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
}

package CaseStudy.controller;

import CaseStudy.models.Room;

import java.util.Scanner;
import java.util.UUID;

import static CaseStudy.controller.Menu.menu;
import static CaseStudy.views.MainController.ListRoom;
import static CaseStudy.views.MainController.ListService;


public class RegisterRoom {
    public static void registerRoom() {
        Scanner sc = new Scanner(System.in);
        Room room=new Room();

        room.setId(UUID.randomUUID().toString().replace("-",""));
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
        ListService.add(room);
        ListRoom.add(room);
        menu();

    }
}

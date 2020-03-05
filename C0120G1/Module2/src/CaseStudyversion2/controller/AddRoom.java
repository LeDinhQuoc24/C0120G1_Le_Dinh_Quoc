package CaseStudyversion2.controller;



import CaseStudyversion2.models.Room;

import java.util.Scanner;
import java.util.UUID;

import static CaseStudyversion2.controller.DisplayMenu.displayMenu;
import static CaseStudyversion2.views.MainRun.listRoom;


public class AddRoom {
    public static void addRoom() {
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
        listRoom.add(room);
        displayMenu();

    }
}

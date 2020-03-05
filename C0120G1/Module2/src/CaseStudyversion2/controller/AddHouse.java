package CaseStudyversion2.controller;



import CaseStudyversion2.models.House;

import java.util.Scanner;
import java.util.UUID;



import static CaseStudyversion2.controller.DisplayMenu.displayMenu;
import static CaseStudyversion2.views.MainRun.listHouse;


public class AddHouse {
    public static void addHouse() {
        Scanner sc = new Scanner(System.in);
        House house=new House();

        house.setId(UUID.randomUUID().toString().replace("-",""));
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
        listHouse.add(house);
        displayMenu();

    }
}

package Demo.Tong_Quang_Tien.commons.Data.Libs;

import Demo.Tong_Quang_Tien.models.CongNhan;
import Demo.Tong_Quang_Tien.models.KySu;
import Demo.Tong_Quang_Tien.models.NhanVien;

import java.util.Scanner;

import static CaseStudy.Task1.controller.Menu.menu;
import static Demo.Tong_Quang_Tien.controller.QuanLyCanBo.CanBo;

public class Add {
    public static void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select:");
        System.out.println("1.Cong nhan");
        System.out.println("2.Ky su");
        System.out.println("3.Nhan vien");
        switch (sc.nextInt()) {
            case 1:
                System.out.println("Nhập vào tên");
                sc.nextLine();
                String name1 = sc.nextLine();
                System.out.println("Nhập vào tuổi");
                int age1 = sc.nextInt();
                System.out.println("Nhập vào giới tính");
                boolean sex1 = sc.nextBoolean();
                System.out.println("Nhập vào địa chỉ");
                sc.nextLine();
                String address1 = sc.nextLine();
                System.out.println("Nhập vào cấp bậc");
                int rank=sc.nextInt();
                CongNhan congNhan = new CongNhan(name1,age1,sex1,address1,rank);
                CanBo.add(congNhan);
                menu();
                break;
            case 2:
                System.out.println("Nhập vào tên");
                sc.nextLine();
                String name2 = sc.nextLine();
                System.out.println("Nhập vào tuổi");
                int age2 = sc.nextInt();
                System.out.println("Nhập vào giới tính");
                boolean sex2 = sc.nextBoolean();
                System.out.println("Nhập vào địa chỉ");
                sc.nextLine();
                String address2 = sc.nextLine();
                System.out.println("Nhập vào ngành nghề");
                String branch=sc.nextLine();
                KySu kySu=new KySu(name2,age2,sex2,address2,branch);
                CanBo.add(kySu);
                menu();
                break;
            case 3:
                System.out.println("Nhập vào tên");
                sc.nextLine();
                String name3 = sc.nextLine();
                System.out.println("Nhập vào tuổi");
                int age3 = sc.nextInt();
                System.out.println("Nhập vào giới tính");
                boolean sex3 = sc.nextBoolean();
                System.out.println("Nhập vào địa chỉ");
                sc.nextLine();
                String address3 = sc.nextLine();
                System.out.println("Nhập vào công việc");
                String job=sc.nextLine();
                NhanVien nhanVien=new NhanVien(name3,age3,sex3,address3,job);
                CanBo.add(nhanVien);
                menu();
                break;
        }

    }
}

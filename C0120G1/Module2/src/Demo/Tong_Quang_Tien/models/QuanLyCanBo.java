package Demo.Tong_Quang_Tien.models;

import java.util.ArrayList;
import java.util.Scanner;

public  class QuanLyCanBo {
    static ArrayList<CongNhan> CongNhan = new ArrayList<>();
    static ArrayList<KySu> KySu = new ArrayList<>();
    static ArrayList<NhanVien> NhanVien = new ArrayList<>();
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Add ");
        System.out.println("2.Search");
        System.out.println("3.Display");
        System.out.println("4.Exit");
        System.out.println("Enter 1-4 for select");

        switch (sc.nextInt()) {
            case 1:
                add();
                break;
            case 2:
                search();
                break;
            case 3:
                display();
                break;
            case 4:
            default:
                exit();

        }
    }
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
                CongNhan.add(congNhan);
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
                KySu.add(kySu);
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
                NhanVien.add(nhanVien);
                menu();
                break;
        }

    }
    public static void search() {

    }
    public static void display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn cán bộ muốn tìm thuộc danh sách:");
        System.out.println("1.Công nhân");
        System.out.println("2.Kỹ sư");
        System.out.println("3.Nhân viên");
        switch (sc.nextInt()) {
            case 1:
                System.out.println(CongNhan);
                display();
                break;
            case 2:
                System.out.println(KySu);
                display();
                break;
            case 3:
                System.out.println(NhanVien);
                display();
                break;
            default:
                System.out.println("Error");
                display();
        }

    }
    public static void exit() {
        System.out.println("Trường kỳ CodeGym nhất định phát khùng");
    }
}
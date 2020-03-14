package Demo.Tong_Quang_Tien.commons.Data.Libs;


import Demo.Tong_Quang_Tien.controller.QuanLyCanBo;


import java.util.Scanner;

public class Search extends QuanLyCanBo {
    public static void search() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên cán bộ cần tìm");
        String nameToFind = sc.nextLine();
        for (Demo.Tong_Quang_Tien.models.CanBo element : CanBo) {
            if (element.getName().equals(nameToFind)) {
                System.out.println(element);
            }
        }

    }
}

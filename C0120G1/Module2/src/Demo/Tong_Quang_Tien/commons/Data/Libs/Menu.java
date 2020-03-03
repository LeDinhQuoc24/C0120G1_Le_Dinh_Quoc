package Demo.Tong_Quang_Tien.commons.Data.Libs;

import java.util.Scanner;

import static Demo.Tong_Quang_Tien.commons.Data.Libs.Add.add;
import static Demo.Tong_Quang_Tien.commons.Data.Libs.Display.display;
import static Demo.Tong_Quang_Tien.commons.Data.Libs.Exit.exit;
import static Demo.Tong_Quang_Tien.commons.Data.Libs.Search.search;

public class Menu {
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
}

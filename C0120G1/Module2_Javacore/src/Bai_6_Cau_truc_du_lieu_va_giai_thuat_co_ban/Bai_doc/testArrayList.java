package Bai_6_Cau_truc_du_lieu_va_giai_thuat_co_ban.Bai_doc;

import java.util.ArrayList;

public class testArrayList {
    static ArrayList<String> BangChuCai = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println(BangChuCai.isEmpty());
        BangChuCai.add("a");
        BangChuCai.add("b");
        BangChuCai.add("c");
        System.out.println(BangChuCai);
        System.out.println(BangChuCai.get(1));
        System.out.println(BangChuCai.remove(2));
        System.out.println(BangChuCai);
        System.out.println(BangChuCai.isEmpty());
    }
}

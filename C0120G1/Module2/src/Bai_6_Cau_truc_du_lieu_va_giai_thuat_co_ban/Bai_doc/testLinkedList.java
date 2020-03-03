package Bai_6_Cau_truc_du_lieu_va_giai_thuat_co_ban.Bai_doc;

import java.util.LinkedList;
import java.util.List;

public class testLinkedList {
    static List<String> BangChuCai = new LinkedList<>();
    public static void main(String[] args) {
        System.out.println(BangChuCai.isEmpty());
        BangChuCai.add("a");
        BangChuCai.add("b");
        BangChuCai.add("c");
        System.out.println(BangChuCai.size());
        System.out.println(BangChuCai);
        System.out.println(BangChuCai.get(1));
        System.out.println(BangChuCai.remove(2));
        System.out.println(BangChuCai);
        System.out.println(BangChuCai.isEmpty());

    }
}

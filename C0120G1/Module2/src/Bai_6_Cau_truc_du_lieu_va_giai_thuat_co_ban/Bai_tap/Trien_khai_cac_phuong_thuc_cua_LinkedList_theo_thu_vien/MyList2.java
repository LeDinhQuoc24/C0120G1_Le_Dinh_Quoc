package Bai_6_Cau_truc_du_lieu_va_giai_thuat_co_ban.Bai_tap.Trien_khai_cac_phuong_thuc_cua_LinkedList_theo_thu_vien;

public class MyList2<E> {
    private Node head;
    private int numNodes;

    public MyList2(Object data) {
        head = new Node (data);
    }

    public class Node {
        private Node next;
        private Object data;
        public Node(Object data) {
            this.data = data;
        }
    }

}

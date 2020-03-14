package Bai_6_Cau_truc_du_lieu_va_giai_thuat_co_ban.Thuc_hanh.Trien_khai_LinkedList_don_gian;

public class MyLinkedList {
    private  Node head;
    private  int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
    public void add(int index, Object data) {
        Node temp = head;//->bien temp co gia tri la head(1)
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;//tu(1),dem bien temp co gia tri head->vi tri truoc index
        }
        holder = temp.next;//gan gia tri temp.next vao bien tam holder(temp.next=vi tri index)(2)
        temp.next = new Node(data);//gan data vao vi tri temp.next
        temp.next.next = holder;//tu(2),gan' gai tri holder vao vi tri temp.next.next(sau vi tri index)
        numNodes++;
    }
    public void addFirst(Object data) {
        Node temp = head;//gan head vao bien tam temp(head=vi tri 1)->bien temp co gia tri la head(1)
        head = new Node(data);//gan gia tri data vao head->vi tri 1 co gia tri la data
        head.next = temp;//tu(1),dem bien temp co gia tri head-> chuyen vao vi tri head.next(vi tri 2)
        numNodes++;//so phan tu tang len 1(vi du 10 phan tu->11 phan tu)
    }
    public Node get(int index){
        Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
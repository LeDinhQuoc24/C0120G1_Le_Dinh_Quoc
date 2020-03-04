package Bai_6_Cau_truc_du_lieu_va_giai_thuat_co_ban.Bai_tap.Trien_khai_cac_phuong_thuc_cua_LinkedList_theo_thu_vien;

public class MyList2<E> {
    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }
    }
    //Phần tử đầu tiên của danh sách liên kết
    private Node head;
    //Số lượng phần tử trong danh sách liên kết
    private int numNodes=0;
    public MyList2() {
    }
    public MyList2(Object data) {
        head = new Node (data);
    }
    //phương thức trả về số lượng phần tử
    public int size() {
        return numNodes;
    }
    public void addFirst(E element) {
        //khai báo 1 biến temp trỏ đến giá trị của head
        Node temp=head;
        //biến head sẽ nhận giá trị là 1 note mới
        head = new Node(element);
        //head.next trỏ đến temp(head.next nhận giá trị head cũ thông qua biến tạm là temp)
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        //khai báo 1 biến temp trỏ đến head
        Node temp=head;
        //sẽ cho con trỏ chạy đến phần tử cuối cùng của danh sách
        while (temp.next == null) {
            temp=temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    public void add(int index, E element) {
        //Khai báo biến temp trỏ đến head
        Node temp=head;
        //Khai báo 1 node là holder
        Node holder;
        //Cho con trỏ chạy đến vị trí index-1
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp=temp.next;
        }
        //cho holder tham chiếu đến vị trí index
        holder=temp.next;
        //Note tại vị trí index-1 sẽ trỏ đến vị trí mới
        temp.next = new Node(element);
        //node mới sẽ trỏ đến holder
        temp.next.next = holder;
        //tăng số lượng các phần tử có trong danh sách lên 1
        numNodes++;
    }
    public Object get(int index) {
        //Khai báo biến temp trỏ tới head
        Node temp=head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IllegalArgumentException("index: " + index);
        }
        //Khai báo temp trỏ đến head
        Node temp=head;
        Object data;
        //Nếu index=0 thì trả về data hiện tại
        if (index == 0) {
            data = temp.data;
            head = head.next;

        } else {
            for (int i = 0; i < index - 1 && temp.next != null;i++) {
                temp = temp.next;
            }
            data=temp.next.data;
            temp.next = temp.next.next;
        }
        numNodes--;
        return (E) data;
    }


}

package Bai_6_Cau_truc_du_lieu_va_giai_thuat_co_ban.Bai_tap.Trien_khai_cac_phuong_thuc_cua_LinkedList_theo_thu_vien;


public class TestMyList2 {
    public static void main(String[] args) {
        class Student2 {
            private int id;
            private String name;
            public Student2() {
            }
            public Student2(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyList2<Student2> student2MyList2 = new MyList2<>();
        Student2 student1 = new Student2(1, "Quoc");
        Student2 student2 = new Student2(3, "Hung");
        Student2 student3 = new Student2(5, "Thong");
        Student2 student4 = new Student2(7, "Hoa");
        Student2 student5 = new Student2(9, "Cuong");
        Student2 student6 = new Student2(11, "Tan");
        student2MyList2.addFirst(student1);
        student2MyList2.addFirst(student2);
        student2MyList2.addFirst(student3);
        student2MyList2.add(2,student4);
        student2MyList2.remove(0);



        for (int i = 0; i < student2MyList2.size(); i++) {
            Student2 student = (Student2) student2MyList2.get(i);
            System.out.println(student.getName()+" "+student.getId());
        }



    }
}

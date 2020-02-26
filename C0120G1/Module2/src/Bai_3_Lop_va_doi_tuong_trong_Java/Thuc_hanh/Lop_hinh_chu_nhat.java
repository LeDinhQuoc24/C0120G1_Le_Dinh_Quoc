    package Bai_3_Lop_va_doi_tuong_trong_Java.Thuc_hanh;

        import java.util.Scanner;

        public class Lop_hinh_chu_nhat{
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("Nhập chiều dài hình chữ nhật");
                double chieuDai = input.nextDouble();
                System.out.println("Nhập chiều rộng hình chữ nhật");
                double chieuRong = input.nextDouble();
                HinhChuNhat hinhChuNhat = new HinhChuNhat(chieuDai,chieuRong);
                System.out.println(hinhChuNhat.hienThi());
                System.out.println("Diện tích hình chữ nhật\t"+hinhChuNhat.getDienTich());
                System.out.println("Chu vi hình chữ nhật\t"+hinhChuNhat.getChuVi());
            }
        }
       class HinhChuNhat {
            double chieuDai;
            double chỉeuRong;
            public HinhChuNhat(double chieuDai, double chieuRong) {
                this.chieuDai=chieuDai;
                this.chỉeuRong = chieuRong;
            }
            public double getChuVi() {
                return (this.chieuDai + this.chỉeuRong) * 2;
            }
            public double getDienTich() {
                return (this.chieuDai * this.chỉeuRong);
            }
            public String hienThi() {
                return "Thông số hình chữ nhật nhập vào" + "\t" + "Chiều dài: " + this.chieuDai + "\t" + "Chiều rộng: " + this.chỉeuRong;
            }
        }


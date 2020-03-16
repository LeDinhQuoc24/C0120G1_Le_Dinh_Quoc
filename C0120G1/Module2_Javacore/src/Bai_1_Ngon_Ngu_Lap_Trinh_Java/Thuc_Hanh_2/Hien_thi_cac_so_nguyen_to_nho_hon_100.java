package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh_2;

public class Hien_thi_cac_so_nguyen_to_nho_hon_100 {
    public static void main(String[] args) {
        String ketQua = "";
        System.out.println("Hiển thị các số nguyên tố nhỏ hơn 100");
        boolean check=true;
        for (int number = 2; number < 100; number++) {
            int i=2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check=false;
                    break;
                }
                i++;
            }
            if(check) {
                ketQua += number + ",";
            }else{
                check=true;
            }
        }
        System.out.println(ketQua);

        }
    }


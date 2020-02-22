package Bai_1_Ngon_Ngu_Lap_Trinh_Java.Thuc_Hanh_2;

public class Hien_thi_20_so_nguyen_to_dau_tien {
    public static void main(String[] args) {
        int number=2;
        int count=0;
        boolean check=true;
        String ketQua = "";
        while(count < 20) {
            int i=2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check=false;
                    break;
                }
                i++;
            }
            if (check) {
                ketQua += number + ",";
                count++;
            }else{
                check=true;
            }
            number++;
        }
        System.out.println("Hiển thị 20 số nguyên tố đầu tiên "+ketQua);
    }
}

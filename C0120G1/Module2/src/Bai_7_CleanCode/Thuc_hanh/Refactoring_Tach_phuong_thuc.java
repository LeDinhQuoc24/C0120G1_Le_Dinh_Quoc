package Bai_7_CleanCode.Thuc_hanh;

import java.util.Scanner;

import static Bai_7_CleanCode.Thuc_hanh.Refactoring_Tach_phuong_thuc.Cylinder.getbaseArea_Perimeter_Volume;

public class Refactoring_Tach_phuong_thuc {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập bán kính:");
            int radius=sc.nextInt();
            System.out.println("Nhập chiều cao:");
            int height=sc.nextInt();
            getbaseArea_Perimeter_Volume(radius,height);
        }
    }
    public static class Cylinder {
        public static double getbaseArea_Perimeter_Volume(int radius, int height){
            System.out.println("Diện tích hình tròn:");
            double baseArea = getBaseArea(radius);
            System.out.println(baseArea);
            System.out.println("Chu vi hình tròn");
            double perimeter = getPerimeter(radius);
            System.out.println(perimeter);
            System.out.println("Diện tích hình trụ tròn:");
            double volume = perimeter * height + 2 * baseArea;
            System.out.println(volume);
            return volume;
        }

        private static double getPerimeter(int radius) {
            return 2 * Math.PI  * radius;
        }

        private static double getBaseArea(int radius) {
            return Math.PI * radius * radius;
        }
    }
}

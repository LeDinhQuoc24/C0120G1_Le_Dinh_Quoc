package Bai_7_CleanCode.Thuc_hanh;

import java.util.Scanner;

public class Refactoring_Tach_bien {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Nhập 1 số bất kỳ");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            System.out.println( fizzBuzz(number));
        }
    }
    public static String fizzBuzz(int number){
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;

        if(isFizz && isBuzz)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(isBuzz)
            return "Buzz";

        return number + "";
    }
}

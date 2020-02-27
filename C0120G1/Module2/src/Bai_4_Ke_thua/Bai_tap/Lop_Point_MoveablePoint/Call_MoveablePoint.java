package Bai_4_Ke_thua.Bai_tap.Lop_Point_MoveablePoint;

public class Call_MoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move(moveablePoint));
        moveablePoint = new MoveablePoint(24, 12, 19, 89);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move(moveablePoint));
    }
}

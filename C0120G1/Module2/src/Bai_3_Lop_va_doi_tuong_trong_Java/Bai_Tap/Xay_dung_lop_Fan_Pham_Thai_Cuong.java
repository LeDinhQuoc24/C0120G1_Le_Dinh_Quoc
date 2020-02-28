package Bai_3_Lop_va_doi_tuong_trong_Java.Bai_tap;

public class Xay_dung_lop_Fan_Pham_Thai_Cuong {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(2);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        fan1.setRadius(10);
        fan2.setSpeed(5);
        fan2.setColor("Blue");
        fan2.setOn(false);
        fan2.setRadius(5);
        System.out.println( fan1.toString());
        System.out.println(fan2.toString());
    }
}
 class Fan {
    final int ZERO=0;
    final int SLOW=1;
    final int MEDIUM=2;
    final int FAST=3;
    private int speed=ZERO;
    private boolean on=false;
    private double radius=5;
    private String color = "blue";
    public void setSpeed(int speed) {
        if (speed >= 3) {
            this.speed=FAST;
        } else if (speed <= 0) {
            this.speed = ZERO;
        } else if (speed < 2) {
            this.speed=SLOW;
        } else {
            this.speed = MEDIUM;
        }
    }
     public int getSpeed() {
         return this.speed;
     }
     public void setOn(boolean on) {
        this.on=on;
     }
     public boolean getON() {
        return this.on;
     }
     public void setRadius(double radius) {
        this.radius = radius;
     }
     public double getRadius() {
         return this.radius;
     }
     public void setColor(String color) {
         this.color = color;
     }
     public String getColor() {
        return this.color;
     }
     public Fan() {
     }
     @Override
     public String toString() {
         if (this.getON()) {
             return "Fan is on.\tSpeed: " + this.getSpeed() + "\tRadius: " + this.getRadius() + "\tColor: "+this.getColor();
         }else{
             return "Fan is off.\tRadius: " + this.getRadius() + "\tColor: " + this.getColor();
         }
     }
}
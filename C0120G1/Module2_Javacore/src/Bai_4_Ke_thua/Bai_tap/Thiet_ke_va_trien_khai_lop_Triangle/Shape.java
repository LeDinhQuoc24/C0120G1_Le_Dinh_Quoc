package Bai_4_Ke_thua.Bai_tap.Thiet_ke_va_trien_khai_lop_Triangle;

public class Shape {
    private String color = "black";

    public Shape() {
    }
    public Shape(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        return "Color: " + this.getColor();
    }
}

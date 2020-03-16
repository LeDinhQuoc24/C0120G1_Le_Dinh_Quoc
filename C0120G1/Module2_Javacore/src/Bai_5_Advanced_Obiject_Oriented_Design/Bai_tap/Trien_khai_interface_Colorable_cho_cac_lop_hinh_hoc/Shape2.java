package Bai_5_Advanced_Obiject_Oriented_Design.Bai_tap.Trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc;

public abstract class Shape2 {
    String color="Blue";
    boolean filled=true;

    public Shape2() {
    }

    public Shape2(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public String getArea() {
        return "Không xác định";
    }


    @Override
    public String toString() {
        return "Shape2{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

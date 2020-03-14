package Demo.Validate.Models;

public class Vo_Minh_Hung {
    int leg;
    int age;
    String colorEye;

    public Vo_Minh_Hung() {
    }

    public Vo_Minh_Hung(int leg, int age, String colorEye) {
        this.leg = leg;
        this.age = age;
        this.colorEye = colorEye;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColorEye() {
        return colorEye;
    }

    public void setColorEye(String colorEye) {
        this.colorEye = colorEye;
    }
}

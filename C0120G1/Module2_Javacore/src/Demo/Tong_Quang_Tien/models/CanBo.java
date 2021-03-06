package Demo.Tong_Quang_Tien.models;

public class CanBo {
    private String name;
    private int age;
    private boolean sex;
    private String address;

    public CanBo() {
    }

    public CanBo(String name, int age, boolean sex, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" +(isSex()?"Nam":"Nu")+
                ", address='" + address + '\'' +
                '}';
    }
}

package Demo.Ep_Kieu;

public class CustomerChild extends Customer{
    String age;
    public CustomerChild() {
    }


    public String getAge() {
        return age;
    }


    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CustomerChild{" +
                "age='" + age + '\'' +
                '}';
    }
}

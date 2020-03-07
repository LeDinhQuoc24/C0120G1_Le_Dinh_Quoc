package CaseStudyversion2.models;

public class Customer extends Service{
    private String name;
    private String birth;
    private String sex;
    private int idCustomer;
    private int numberPhone;
    private String email;
    private String typeCustomer;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String showInfo() {
        return "-------------------Information Customer--------------\n" +
                "Name: " + this.getName() + "\tBirth: " + this.getBirth() +
                "\tSex: " + this.getSex() + "\nID: " + this.getIdCustomer() +
                "\tNumberPhone: " + this.getNumberPhone() + "\tEmail: " +
                this.getEmail() + "\nTypeCustomer: " + this.getTypeCustomer() +
                "\tAddress: " + this.getAddress() +
                "\n------------------------------------------------------";
    }
}

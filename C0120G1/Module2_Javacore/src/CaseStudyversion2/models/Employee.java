package CaseStudyversion2.models;

import java.io.Serializable;

public class Employee implements Serializable {
    private String nameEmployee;
    private int idEmployee;
    private int ageEmployee;
    private String addressEmployee;

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public int getAgeEmployee() {
        return ageEmployee;
    }

    public void setAgeEmployee(int ageEmployee) {
        this.ageEmployee = ageEmployee;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nameEmployee='" + nameEmployee + '\'' +
                ", idEmployee=" + idEmployee +
                ", ageEmployee=" + ageEmployee +
                ", addressEmployee='" + addressEmployee + '\'' +
                '}';
    }
}

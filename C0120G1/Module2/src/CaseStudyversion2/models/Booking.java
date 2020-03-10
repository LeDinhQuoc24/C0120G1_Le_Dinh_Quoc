package CaseStudyversion2.models;

public class Booking extends  Customer{
    private Service service;

    public Service getService() {
        return service;
    }
    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public String showInfo() {
        return "-----------Information Booking---------------------------\n" +
                "Name: " + this.getName() + "\tBirth: " + this.getBirth() +
                "\tSex: " + this.getSex() + "\nID: " + this.getIdCustomer() +
                "\tNumberPhone: " + this.getNumberPhone() + "\tEmail: " +
                this.getEmail() + "\nTypeCustomer: " + this.getTypeCustomer() +
                "\tAddress: " + this.getAddress()+this.service;
    }
}



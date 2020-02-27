package Demo.Ep_Kieu;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        CustomerChild customerChild = new CustomerChild();
        customer.setName("CodeGym");
        customerChild.setAge("17");
        customerChild.setName("quoc");
        System.out.println(customerChild);
    }
}

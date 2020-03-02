package Demo.Ep_Kieu;

public class Main {
    public static void main(String[] args) {
        Customer customer = new CustomerChild();
        CustomerChild customerChild = new CustomerChild();
        customer.setName("CodeGym");
        customerChild.setAge("17");
        customerChild.setName("quoc");
        ((CustomerChild)customer).setAge("20");
        customerChild=(CustomerChild)customer;
        System.out.println(customerChild);
        System.out.println(customer);
    }
}

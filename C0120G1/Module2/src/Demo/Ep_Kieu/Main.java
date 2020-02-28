package Demo.Ep_Kieu;

public class Main {
    public static void main(String[] args) {
        Customer customer = new CustomerChild();
        CustomerChild customerChild = new CustomerChild();
        customer.setName("CodeGym");
        ((CustomerChild)customer).setAge("99");
        customerChild.setAge("17");
        customerChild.setName("quoc");
        customerChild=(CustomerChild)customer;
        System.out.println(customer);
        System.out.println(customerChild);
    }
}

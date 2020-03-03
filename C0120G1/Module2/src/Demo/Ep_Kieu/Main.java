package Demo.Ep_Kieu;

public class Main {
    public static void main(String[] args) {
        Customer customer = new CustomerChild();
        CustomerChild customerChild = new CustomerChild();
        customer.setName("CodeGym");
        ((CustomerChild)customer).setAge("99");
        customerChild.setAge("17");
        customerChild.setName("quoc");
<<<<<<< HEAD
        ((CustomerChild)customer).setAge("20");
        customerChild=(CustomerChild)customer;
=======
        customerChild=(CustomerChild)customer;
        System.out.println(customer);
>>>>>>> 875a6e46651cb7d950b501942d4e4fed62ba074f
        System.out.println(customerChild);
        System.out.println(customer);
    }
}

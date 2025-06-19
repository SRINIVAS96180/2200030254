package dependencyinjectionexample;

public class DependencyDemo {
    public static void main(String[] args) {
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        service.getCustomerDetails("C101");
    }
}

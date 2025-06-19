package dependencyinjectionexample;

public class CustomerService {
    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public void getCustomerDetails(String id) {
        Customer customer = repository.findCustomerById(id);
        System.out.println("Customer ID: " + customer.getId() + "  Name: " + customer.getName());
    }
}
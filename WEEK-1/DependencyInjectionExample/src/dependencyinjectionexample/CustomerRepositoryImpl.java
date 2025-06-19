package dependencyinjectionexample;

public class CustomerRepositoryImpl implements CustomerRepository {
    public Customer findCustomerById(String id) {
        return new Customer(id, "Ravi Kumar");
    }
}
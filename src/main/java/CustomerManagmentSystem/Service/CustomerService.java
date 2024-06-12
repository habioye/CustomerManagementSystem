package CustomerManagmentSystem.Service;

import CustomerManagmentSystem.Entity.Customer;
import CustomerManagmentSystem.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    public List<Customer> getCustomerByName(String name) {
        return customerRepository.findCustomerByName(name);
    }

    public List<Customer> getCustomerByFirstName(String firstName) {
        return customerRepository.findCustomerByFirstName(firstName);
    }

    public List<Customer> getCustomerByLastName(String lastName) {
        return customerRepository.findCustomerByLastName(lastName);
    }

    public List<Customer> getCustomerByEmail(String email) {
        return customerRepository.findCustomerByEmail(email);
    }

    public List<Customer> getCustomerByPhoneNumber(String phoneNumber) {
        return customerRepository.findCustomerByPhoneNumber(phoneNumber);
    }

    public void updateCustomer(String name, String firstName, String LastName, String email, String phoneNumber, Long id) {
        customerRepository.updateCustomer(name, firstName, LastName, email, phoneNumber, id);
    }

    public void changeCustomerName(String name, Long id) {
        customerRepository.updateCustomerName(name, id);
    }

    public void changeCustomerFirstName(String firstName, Long id) {
        customerRepository.updateCustomerFirstName(firstName, id);
    }

    public void changeCustomerLastName(String lastName, Long id) {
        customerRepository.updateCustomerLastName(lastName, id);
    }

    public void changeCustomerEmail(String email, Long id) {
        customerRepository.updateCustomerFirstName(email, id);
    }

    public void changeCustomerPhoneNumber(String phoneNumber, Long id) {
        customerRepository.updateCustomerLastName(phoneNumber, id);
    }

    public void removeCustomer(String name, String firstName, String LastName, String email, String phoneNumber) {
        customerRepository.deleteCustomer(name, firstName, LastName, email, phoneNumber);
    }

    public void removeCustomerName(String name, Long id) {
        customerRepository.deleteCustomerByName(name);
    }

    public void removeCustomerFirstName(String firstName, Long id) {
        customerRepository.deleteCustomerByFirstName(firstName);
    }

    public void removeCustomerLastName(String lastName, Long id) {
        customerRepository.deleteCustomerByLastName(lastName);
    }

    public void removeCustomerEmail(String email, Long id) {
        customerRepository.deleteCustomerByEmail(email);
    }

    public void removeCustomerPhoneNumber(String phoneNumber, Long id) {
        customerRepository.deleteCustomerByPhoneNumber(phoneNumber);
    }


    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public void deleteCustomer(Customer customer) {
        customerRepository.delete(customer);
    }


}

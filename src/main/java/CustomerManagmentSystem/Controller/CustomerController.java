package CustomerManagmentSystem.Controller;

import CustomerManagmentSystem.Entity.Customer;
import CustomerManagmentSystem.Service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;


    // Creates Logger for Application
    private Logger logger = LoggerFactory.getLogger("LoggingController.class");


    // Crud Methods
    @GetMapping
    public List<Customer> getAllCustomers() {
        logger.info("Retrieved all the customers");
        return customerService.getAllCustomers();
    }

    @GetMapping("/get/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        logger.info("Getting Customer by ID: {}", id);

        return customerService.getCustomerById(id);
    }

    @GetMapping("/get/name/{name}")
    public List<Customer> getCustomerByName(@PathVariable String name) {
        logger.info("Getting Customer by Name: {}", name);
        return customerService.getCustomerByName(name);
    }
    @GetMapping("/get/firstname/{firstName}")
    public List<Customer> getCustomerByFirstName(@PathVariable String firstName) {
        logger.info("Getting Customer By First Name: {}",firstName);
        return customerService.getCustomerByFirstName(firstName);
    }


        @GetMapping("/get/lastname/{lastName}")
    public List<Customer> getCustomerByLastName(@PathVariable String lastName) {
            logger.info("Getting Customer By Last Name: {}",lastName);

        return customerService.getCustomerByLastName(lastName);
    }
          @GetMapping("/get/phonenumber/{phoneNumber}")
    public List<Customer> getCustomerByPhoneNumber(@PathVariable String phoneNumber) {
              logger.info("Getting Customer By Phone Number: {}",phoneNumber);

              return customerService.getCustomerByLastName(phoneNumber);
    }

    @PostMapping("/create")
    public Customer createCustomer(@RequestBody Customer customer) {
        logger.info("Creating Customer: {}",customer.getFirstName());

        return customerService.saveCustomer(customer);
    }
//    @DeleteMapping("/{id}")
//    public void deleteCustomer(@RequestBody Long id) {
//        customerService.deleteCustomer(id);
//    }




}

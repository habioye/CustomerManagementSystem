package CustomerManagmentSystem.Repository;

import CustomerManagmentSystem.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
//    private Long id;
//    private String name;
//    private String firstName;
//    private String LastName;
//    private String email;
//    private String phoneNumber;
//    private boolean admin;
    @Query("SELECT c FROM Customer c WHERE c.name = :name")
    List<Customer> findCustomerByName(@PathVariable String name);

    @Query("SELECT c FROM Customer c WHERE c.firstname = :firstName")
    List<Customer> findCustomerByFirstName(@PathVariable String firstName);

    @Query("SELECT c FROM Customer c WHERE c.lastname = :lastName")
    List<Customer> findCustomerByLastName(@PathVariable String lastName);

    @Query("SELECT c FROM Customer c WHERE c.email = :email")
    List<Customer> findCustomerByEmail(@PathVariable String email);

    @Query("SELECT c FROM Customer c WHERE c.phonenumber = :phoneNumber")
    List<Customer> findCustomerByPhoneNumber(@PathVariable String phoneNumber);

//    @Query("SELECT c FROM Customer c WHERE c.name = :name")
//    List<Customer> findCustomerByName(@PathVariable String name);


}

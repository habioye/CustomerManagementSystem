package CustomerManagmentSystem.Repository;

import CustomerManagmentSystem.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
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

    @Query("UPDATE Customer SET name = :name, firstname = :firstName, lastname = :lastName, email = :email, phonenumber = :phoneNumber WHERE id = :id")
    void updateCustomer(@PathVariable String name, String firstName, String LastName, String email, String phoneNumber, Long id);


    @Query("UPDATE Customer SET name = :name WHERE id = :id")
    void updateCustomerName(@PathVariable String name, Long id);


    @Query("UPDATE Customer SET firstname = :firstName WHERE id = :id")
    void updateCustomerFirstName(@PathVariable String firstName, Long id);


    @Query("UPDATE Customer SET lastname = :lastName WHERE id = :id")
    void updateCustomerLastName(@PathVariable String LastName, Long id);


    @Query("UPDATE Customer SET email = :email WHERE id = :id")
    void updateCustomerEmail(@PathVariable String email, Long id);


    @Query("UPDATE Customer SET phonenumber = :phoneNumber WHERE id = :id")
    void updateCustomerPhoneNumber(@PathVariable String phoneNumber, Long id);

    @Query("DELETE FROM Customer WHERE name = :name, firstname = :firstName, lastname = :lastName, email = :email, phonenumber = :phoneNumber")
    void deleteCustomer(@PathVariable String name, String firstName, String LastName, String email, String phoneNumber);

    @Query("DELETE FROM Customer WHERE name = :name")
    void deleteCustomerByName(@PathVariable String name);

    @Query("DELETE FROM Customer WHERE firstname = :firstName")
    void deleteCustomerByFirstName(@PathVariable String firstName);

    @Query("DELETE FROM Customer WHERE lastname = :lastName")
    void deleteCustomerByLastName(@PathVariable String LastName);

    @Query("DELETE FROM Customer WHERE email = :email")
    void deleteCustomerByEmail(@PathVariable String email);

    @Query("DELETE FROM Customer WHERE phonenumber = :phoneNumber")
    void deleteCustomerByPhoneNumber(@PathVariable String phoneNumber);









//    @Query("SELECT c FROM Customer c WHERE c.name = :name")
//    List<Customer> findCustomerByName(@PathVariable String name);


}

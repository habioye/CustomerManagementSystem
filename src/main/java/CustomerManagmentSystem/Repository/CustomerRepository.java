package CustomerManagmentSystem.Repository;

import CustomerManagmentSystem.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query("SELECT c FROM Customer c WHERE c.name = :name")
    List<Customer> findCustomerByName(@PathVariable String name);

    @Query("SELECT c FROM Customer c WHERE c.firstName = :firstName")
    List<Customer> findCustomerByFirstName(@PathVariable String firstName);

    @Query("SELECT c FROM Customer c WHERE c.lastName = :lastName")
    List<Customer> findCustomerByLastName(@PathVariable String lastName);

    @Query("SELECT c FROM Customer c WHERE c.email = :email")
    List<Customer> findCustomerByEmail(@PathVariable String email);

    @Query("SELECT c FROM Customer c WHERE c.phoneNumber = :phoneNumber")
    List<Customer> findCustomerByPhoneNumber(@PathVariable String phoneNumber);

//    @Query("UPDATE Customer SET name = :name, firstName = :firstName, lastName = :lastName, email = :email, phoneNumber = :phoneNumber WHERE id = :id")
//    void updateCustomer(@PathVariable String name, String firstName, String lastName, String email, String phoneNumber, Long id);
//
//
//    @Query("UPDATE Customer SET name = :name WHERE id = :id")
//    void updateCustomerName(@PathVariable String name, Long id);
//
//
//    @Query("UPDATE Customer SET firstname = :firstName WHERE id = :id")
//    void updateCustomerFirstName(@PathVariable String firstName, Long id);
//
//
//    @Query("UPDATE Customer SET lastName = :lastName WHERE id = :id")
//    void updateCustomerLastName(@PathVariable String LastName, Long id);
//
//
//    @Query("UPDATE Customer SET email = :email WHERE id = :id")
//    void updateCustomerEmail(@PathVariable String email, Long id);
//
//
//    @Query("UPDATE Customer SET phoneNumber = :phoneNumber WHERE id = :id")
//    void updateCustomerPhoneNumber(@PathVariable String phoneNumber, Long id);
//
//
//    @Query("DELETE FROM Customer WHERE id = :id")
//    void deleteCustomer(@PathVariable Long id);
//
//    @Query("DELETE FROM Customer WHERE name = :name and firstName = :firstName and lastName = :lastName and email = :email and phoneNumber = :phoneNumber")
//    void deleteCustomer(@PathVariable String name, String firstName, String lastName, String email, String phoneNumber);
//
//    @Query("DELETE FROM Customer WHERE name = :name")
//    void deleteCustomerByName(@PathVariable String name);
//
//    @Query("DELETE FROM Customer WHERE firstName = :firstName")
//    void deleteCustomerByFirstName(@PathVariable String firstName);
//
//    @Query("DELETE FROM Customer WHERE firstName = :lastName")
//    void deleteCustomerByLastName(@PathVariable String lastName);
//
//    @Query("DELETE FROM Customer WHERE email = :email")
//    void deleteCustomerByEmail(@PathVariable String email);
//
//    @Query("DELETE FROM Customer WHERE phoneNumber = :phoneNumber")
//    void deleteCustomerByPhoneNumber(@PathVariable String phoneNumber);









//    @Query("SELECT c FROM Customer c WHERE c.name = :name")
//    List<Customer> findCustomerByName(@PathVariable String name);


}

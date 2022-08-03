package lt.sprinT.test_spring_.service;

import lt.sprinT.test_spring_.model.Customer;
import lt.sprinT.test_spring_.reporsitory.CustomerRepository;
import lt.sprinT.test_spring_.reporsitory.ProductsR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Optional<Customer> getCustomerById(int customerID) {
       return customerRepository.findById(customerID);
    }

    public Iterable<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }






}

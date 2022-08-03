package lt.sprinT.test_spring_.controller;


import lt.sprinT.test_spring_.model.Customer;
import lt.sprinT.test_spring_.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/customer")

public class CustomerController {

    @Autowired
    private CustomerService customerservice;

   // http://localhost:8080/test
    //http://localhost:8080/customer/all

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Customer> getAllCustomers() {
        //return "Test succes!!!!!!";
        return customerservice.getAllCustomers();


    }




}

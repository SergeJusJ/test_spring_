package lt.sprinT.test_spring_.controller;


import lt.sprinT.test_spring_.model.Customer;
import lt.sprinT.test_spring_.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.Optional;

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


    //http://localhost:8080/customer/id/112
    @GetMapping(path = "/id/{id}")
    public @ResponseBody
    Optional<Customer> getCustomerById(@PathVariable int id) {
        return customerservice.getCustomerById(id);
    }


    //http://localhost:8080/customer/number/112
    @GetMapping(path = "/number/{number}")
    public @ResponseBody
    Optional<Customer> getCustomerByNumber(@PathVariable int number) {
        return customerservice.getCustomerByNumber(number);
    }


    //http://localhost:8080/customer/like?name=a%25
    @GetMapping(path = "/{name}")
    public @ResponseBody
    Optional<Customer> getCustomerByName(@RequestParam String name) {
        return customerservice.getCustomerByName(name);
    }

    //http://localhost:8080/customer/name/like?name=A%25
    @GetMapping(path = "/name/like")
    public @ResponseBody
    Iterable<Customer> getCustomerByNameLike (@RequestParam String name) {
        return customerservice.getCustomerByNameLike(name);
    }

    //http://localhost:8080/customer/name/a
    @GetMapping(path = "/name/{name}")
    public @ResponseBody
    Iterable<Customer> getCustomerByNameLikeParam (@PathVariable String name) {
        return customerservice.getCustomerByNameLike(name + "%");
    }

    //http://localhost:8080/customer/htmlexample

    @GetMapping (path = "/htmlexample")
    public String getHtmlExample (){
        return "html_example" ;

        }


    //http://localhost:8080/customer/firstpage/112
    @GetMapping (path = "/firstpage/{id}")
    public String getDataFirstPage (Model model,@PathVariable int id){
        Optional<Customer> customer = getCustomerById(id);
        model.addAttribute("company_name", "Company name : " + customer.get().getCustomerName());
        model.addAttribute("contact_last_name", "Company last name  : " + customer.get().getContactLastName());
        model.addAttribute("contact_first_name", "Company first name : " + customer.get().getContactFirstName());
        model.addAttribute("country", "Company Coutry : " + customer.get().getCountry());
        return "firstpage";
    }






}
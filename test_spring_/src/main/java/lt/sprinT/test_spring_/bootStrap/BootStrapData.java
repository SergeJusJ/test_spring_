package lt.sprinT.test_spring_.bootStrap;

import lt.sprinT.test_spring_.reporsitory.CustomerRepository;
import lt.sprinT.test_spring_.reporsitory.ProductsR;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private CustomerRepository customerRepository;
    private ProductsR productsR;

  //  public BootStrapData(CustomerRepository customerRepository) {this.customerRepository = customerRepository;}

    public BootStrapData(ProductsR productsR) {
        this.productsR = productsR ;
    }



    @Override
    public void run(String... args) throws Exception {
       // customerRepository.findAll().forEach(System.out::println);
        System.out.println("----------------------------");
      //  System.out.println(customerRepository.findById(112));
        //System.out.println(productsR.("123"));
            //    customerRepository.count();
    }
}

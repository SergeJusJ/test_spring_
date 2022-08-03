package lt.sprinT.test_spring_.controller;


import lt.sprinT.test_spring_.model.Products;
import lt.sprinT.test_spring_.service.CustomerService;
import lt.sprinT.test_spring_.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/products")

public class ProductController {

    @Autowired
    private ProductService productService;

    // http://localhost:8080/test
    //http://localhost:8080/products/all

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Products> getAllProducts() {
        //return "Test succes!!!!!!";
        return productService.getAllProducts();


    }




}

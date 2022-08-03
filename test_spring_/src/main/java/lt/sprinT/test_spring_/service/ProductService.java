package lt.sprinT.test_spring_.service;

import lt.sprinT.test_spring_.model.Products;
import lt.sprinT.test_spring_.reporsitory.ProductsR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductsR productsR;


    public Optional<Products> getProductByCode(String s) { return productsR.findById("123");}


    public Iterable<Products> getAllProducts(){
        return productsR.findAll();
    }


}

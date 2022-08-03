package lt.sprinT.test_spring_.reporsitory;

import lt.sprinT.test_spring_.model.Customer;
import lt.sprinT.test_spring_.model.Products;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductsR extends  CrudRepository<Products, String> {



}

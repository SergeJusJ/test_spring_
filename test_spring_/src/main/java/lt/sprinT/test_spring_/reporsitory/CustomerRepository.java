package lt.sprinT.test_spring_.reporsitory;

import lt.sprinT.test_spring_.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository <Customer, Integer> {
}

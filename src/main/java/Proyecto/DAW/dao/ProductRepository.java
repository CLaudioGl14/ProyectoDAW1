
package Proyecto.DAW.dao;

import Proyecto.DAW.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long>{
    
    Product findByCategory (String category);
    
}

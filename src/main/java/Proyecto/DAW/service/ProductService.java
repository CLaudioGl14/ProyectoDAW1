
package Proyecto.DAW.service;

import Proyecto.DAW.entity.Product;
import java.util.List;
import org.springframework.data.domain.Page;


public interface ProductService {
        public List<Product> findAll();
        public Product findByCategory(String category);
        public Product add(Product product);
        public void delete(Long id);
        public Page<Product> findAll(int page, int size);
        public Product update(Product product);
}

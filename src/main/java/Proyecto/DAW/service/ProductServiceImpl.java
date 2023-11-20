
package Proyecto.DAW.service;

import Proyecto.DAW.dao.ProductRepository;
import Proyecto.DAW.entity.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Product findByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    @Override
    public Product add(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        var productD = productRepository.findById(id).get();
        productRepository.delete(productD);
    }

    @Override
    public Page<Product> findAll(int page, int size) {
        return productRepository.findAll(PageRequest.of(page,size));
    }

    @Override
    public Product update(Product product) {
        var productD = productRepository.findById(product.getId()).get();
        productD.setProductname(product.getProductname());
        productD.setUnitprice(product.getUnitprice());
        productD.setCategory(product.getCategory());
        productD.setDescription(product.getDescription());
        return productRepository.save(productD);
    }
 
}

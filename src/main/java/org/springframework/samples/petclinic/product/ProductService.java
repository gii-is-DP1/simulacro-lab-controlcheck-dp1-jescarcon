package org.springframework.samples.petclinic.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
@Service
public class ProductService {

    private ProductRepository productRepository;
    @Autowired

    public ProductService(ProductRepository productRepository){
        this.productRepository=productRepository;
    }
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    };
    
   
    public List<Product> getProductsCheaperThan(double price) {
        return null;
    }

    public ProductType getProductType(String typeName) {
        return productRepository.findTypeByName(typeName);
    }

    public Product save(Product p){
        return null;       
    }

    
}

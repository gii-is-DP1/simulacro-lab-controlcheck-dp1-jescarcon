package org.springframework.samples.petclinic.product;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer>{
   
    List<Product> findAll();
    List<ProductType> findAllProductTypes();
    Optional<Product> findById(int id);
    Product findByName(String name);
    Product save(Product p);

    @Query("SELECT t FROM ProductType t WHERE t.name=:name")
    public ProductType findTypeByName(@Param("name") String name);
}
 

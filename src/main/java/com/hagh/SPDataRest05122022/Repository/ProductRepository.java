package com.hagh.SPDataRest05122022.Repository;

import com.hagh.SPDataRest05122022.POJO.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "product")
public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByProductName(@Param("productName")String productName);

}

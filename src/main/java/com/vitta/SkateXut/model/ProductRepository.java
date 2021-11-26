package com.vitta.SkateXut.model;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Product findProductByProductName(String productName);
    Product findProductByBarcode(int barcode);
}

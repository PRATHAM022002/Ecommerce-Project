package com.ecommerce.repository.repoImpl;

import com.ecommerce.model.Product;
import com.ecommerce.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InMemoryProductRepository implements ProductRepository {

    private final Map<Long, Product> db = new HashMap<>();

    public InMemoryProductRepository() {
        db.put(1L, new Product(1L,"Laptop","Gaming",75000,"Electronics","img"));
    }

    public List<Product> findAll() {
        return new ArrayList<>(db.values());
    }

    public Product findById(Long id) {
        return db.get(id);
    }

    public void save(Product product) {
        db.put(product.getProductId(), product);
    }
}

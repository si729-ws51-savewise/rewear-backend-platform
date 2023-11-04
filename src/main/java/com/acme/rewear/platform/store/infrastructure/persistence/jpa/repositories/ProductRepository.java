package com.acme.rewear.platform.store.infrastructure.persistence.jpa.repositories;

import com.acme.rewear.platform.store.domain.model.aggregates.Product;
import com.acme.rewear.platform.store.domain.model.valueobjects.ProductName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByName(ProductName productName);
}

package tn.isims.ecommerceback.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tn.isims.ecommerceback.entity.Product;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product,Long> {
}

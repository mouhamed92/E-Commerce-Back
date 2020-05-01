package tn.isims.ecommerceback.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tn.isims.ecommerceback.entity.ProductCategory;

@RepositoryRestResource(collectionResourceRel = "productCategorie" , path = "product-category")
public interface ProductCategorieRepository extends JpaRepository<ProductCategory,Long> {
}

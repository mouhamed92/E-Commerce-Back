package tn.isims.ecommerceback.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import tn.isims.ecommerceback.entity.ProductCategory;

@RepositoryRestResource(collectionResourceRel = "productCategorie" , path = "product-category")
@CrossOrigin(origins = "http://localhost:4200")
public interface ProductCategorieRepository extends JpaRepository<ProductCategory,Long> {
}

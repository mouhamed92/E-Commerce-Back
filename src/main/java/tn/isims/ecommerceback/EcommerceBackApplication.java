package tn.isims.ecommerceback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import tn.isims.ecommerceback.entity.Product;
import tn.isims.ecommerceback.entity.ProductCategory;

@SpringBootApplication
public class EcommerceBackApplication implements CommandLineRunner {


   /* @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;*/

    public static void main(String[] args) {

        SpringApplication.run(EcommerceBackApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

      /*  repositoryRestConfiguration.exposeIdsFor(Product.class);
        repositoryRestConfiguration.exposeIdsFor(ProductCategory.class);*/
    }
}

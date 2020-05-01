package tn.isims.ecommerceback.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import tn.isims.ecommerceback.entity.Product;
import tn.isims.ecommerceback.entity.ProductCategory;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        HttpMethod [] unSupportedAction = {HttpMethod.PUT , HttpMethod.POST ,HttpMethod.DELETE};

        config.getExposureConfiguration()
                .forDomainType(Product.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(unSupportedAction))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(unSupportedAction));

        config.getExposureConfiguration()
                .forDomainType(ProductCategory.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(unSupportedAction))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(unSupportedAction));
    }
}

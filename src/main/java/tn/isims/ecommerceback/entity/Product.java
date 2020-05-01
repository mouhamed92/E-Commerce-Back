package tn.isims.ecommerceback.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "product")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String sku ;
    private String name ;
    private String description ;
    private BigDecimal unitPrice ;
    private String imageUrl ;
    private boolean active ;
    private int unitstocked ;

    @CreationTimestamp
    private Date dateCreated ;

    @UpdateTimestamp
    private Date lastUpdate ;

    @ManyToOne
    @JoinColumn(name = "category_id" ,nullable = false)
    private ProductCategory category ;

}


package Proyecto.DAW.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import lombok.Data;

@Data
@Entity
public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String productname;
        private BigDecimal unitprice;
        private String description;
        private String category;
        private String productSK;   // openfeign connection
}

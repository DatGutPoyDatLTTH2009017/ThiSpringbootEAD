package com.example.thispringbootead.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "sales")
public class Sale {
    @EmbeddedId
    private SaleId id;
    private String salesmanId;
    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id", referencedColumnName = "i" + "d", nullable = false)
    @JsonBackReference
    private Product product;
    private String salesmanName;
    private String dos;
}

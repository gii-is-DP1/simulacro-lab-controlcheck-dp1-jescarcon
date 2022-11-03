package org.springframework.samples.petclinic.product;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product extends BaseEntity{
    @NotEmpty
    @Min(3)
    @Max(50)
    String name;
    @Min(0)
    double price;
    @ManyToOne
    ProductType productType;
}
 
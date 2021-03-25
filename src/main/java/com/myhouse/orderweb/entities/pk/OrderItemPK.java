package com.myhouse.orderweb.entities.pk;

import com.myhouse.orderweb.entities.Order;
import com.myhouse.orderweb.entities.Product;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class OrderItemPK implements Serializable {

    @EqualsAndHashCode.Include
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @EqualsAndHashCode.Include
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}

package com.NaturalStore.RESTApi.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="cart")
public class Cart {
    @Id
    private Integer cart_id;
    private Integer quantity;
    @OneToOne(mappedBy = "cart")
    private SignUpModel signUpModel;
    @OneToMany(mappedBy="cart")
    @JoinColumn(name="item_id",referencedColumnName = "item_id")
    Set<Item> items;

    public Cart(){super();}

    public Cart(Integer cart_id,Integer quantity){
        super();
        this.cart_id = cart_id;
        this.quantity = quantity;
    }
    public Integer getCartId() {
        return cart_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setCart_id(Integer cart_id) {
        this.cart_id = cart_id;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
}

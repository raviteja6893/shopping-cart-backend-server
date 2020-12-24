package com.NaturalStore.RESTApi.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="item")
public class Item {
    @Id
    private Integer item_id;
    private String name;
    private Float price;
    @ManyToOne
    private Cart cart;


    public Item(){super();}

    public Item(Integer item_id,String name,Float price){
        super();
        this.item_id = item_id;
        this.name = name;
        this.price = price;
    }
    public Integer getItemId() {
        return item_id;
    }

    public String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }

    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}

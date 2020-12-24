package com.NaturalStore.RESTApi.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="users")
public class SignUpModel {
    @Id
    private String username;
    private String password;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cart_id", referencedColumnName = "cart_id")
    private Cart cart;

    public SignUpModel() {
        super();
    }

    public SignUpModel(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


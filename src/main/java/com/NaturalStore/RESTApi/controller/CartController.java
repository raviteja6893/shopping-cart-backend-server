package com.NaturalStore.RESTApi.controller;

import com.NaturalStore.RESTApi.model.Cart;
import com.NaturalStore.RESTApi.repository.CartRepository;
import net.bytebuddy.asm.Advice;
import org.hibernate.loader.custom.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class CartController {
    @Autowired
    CartRepository cartrepository;
    @PostMapping("/cart")
    //add item to cart
    public  Cart addItemToCart(@Validated Cart item) { return  cartrepository.save(item);}
    //get item from cart
    @GetMapping("/cart/{cart_id}")
    public responseEntity <Cart> getItemById(@PathVariable(value = "cart_id") Integer cart_id) throws ResourceNotFoundException(
            return Cart.findById(cart_id)
            )


}

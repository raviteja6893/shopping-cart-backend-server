package com.NaturalStore.RESTApi.controller;
import com.NaturalStore.RESTApi.model.Item;
import com.NaturalStore.RESTApi.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ItemController {
    @Autowired
    ItemRepository itemRepository;
    // Get all items
    @GetMapping("/")
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }
}

package com.NaturalStore.RESTApi.controller;
import com.NaturalStore.RESTApi.exception.UserNotFoundException;
import com.NaturalStore.RESTApi.model.SignUpModel;
import com.NaturalStore.RESTApi.repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class SignUpController {


    @Autowired
    SignUpRepository signuprepository;

    // add a user
    @PostMapping("/users")
    public SignUpModel addUser(@Validated @RequestBody SignUpModel user) {
        return signuprepository.save(user);
    }
    //get users
    @GetMapping("/users/{username}")
    public SignUpModel getUserById(@PathVariable(value = "username") String username) throws UserNotFoundException {
        return signuprepository.findById(username).orElseThrow(() -> new UserNotFoundException(username));
    }
}

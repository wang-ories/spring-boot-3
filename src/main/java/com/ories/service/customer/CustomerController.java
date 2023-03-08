package com.ories.service.customer;

import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.Optional;

@Controller
@ResponseBody
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @RequestMapping("/customers")
    Collection<Customer> all(){
        return  this.service.all();
    }

    @RequestMapping("/customers/{name}")
    Customer byName(@PathVariable String name){

        Assert.state(Character.isUpperCase(name.charAt(0)), "the name must start with a capital letter");
        return this.service.byName(name);
    }



}

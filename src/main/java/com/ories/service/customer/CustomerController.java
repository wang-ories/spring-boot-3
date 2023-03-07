package com.ories.service.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

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

    @RequestMapping("/customers/{id}")
    Customer byId(@PathVariable Integer id){
        return  this.service.byId(id);
    }

}

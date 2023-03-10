package com.ories.service.customer;

import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.function.Supplier;

@Controller
@ResponseBody
public class CustomerController {

    private final CustomerService service;
    private final ObservationRegistry observationRegistry;


    public CustomerController(CustomerService service, ObservationRegistry observationRegistry) {
        this.service = service;
        this.observationRegistry = observationRegistry;
    }

    @RequestMapping("/customers")
    Collection<Customer> all(){
        return  this.service.all();
    }

    @RequestMapping("/customers/{name}")
    Customer byName(@PathVariable String name){

        Assert.state(Character.isUpperCase(name.charAt(0)), "the name must start with a capital letter");
        return Observation.createNotStarted("byName", this.observationRegistry)
                .observe(new Supplier<Customer>() {
                    @Override
                    public Customer get() {
                        return service.byName(name);
                    }
                });

    }



}

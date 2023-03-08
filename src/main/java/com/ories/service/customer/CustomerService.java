package com.ories.service.customer;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;


import java.util.Collection;

@Service
public class CustomerService {

    private final JdbcTemplate template;

    private final RowMapper rowMapper =
            (rs, rowNum) -> new Customer(rs.getInt("id"), rs.getString("name"));

    public CustomerService(JdbcTemplate template) {
        this.template = template;
    }


    public  Customer byName(String name){
        return (Customer) this.template.queryForObject("select * from customers where name=?", this.rowMapper, name);
    }

    public Collection<Customer> all(){
        return this.template.query("select * from customers", this.rowMapper);
    }
}

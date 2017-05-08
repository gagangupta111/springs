package com.spring.transactionManagement.dao;


import com.spring.transactionManagement.model.Customer;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Time;

public class CustomerDAOImpl implements CustomerDAO {

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void create(Customer customer) {
        String queryCustomer = "insert into Customer (customer_id, name, created_date) values (?,?,?)";
        String queryAddress = "insert into Address (id, address,country) values (?,?,?)";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        jdbcTemplate.update(queryCustomer, new Object[] { customer.getCustomer_id(),
                customer.getName(), new java.sql.Timestamp(new java.util.Date().getTime())});
        System.out.println("Inserted into Customer Table Successfully");
        jdbcTemplate.update(queryAddress, new Object[] { customer.getCustomer_id(),
                customer.getAddress().getAddress(),
                customer.getAddress().getCountry() });
        System.out.println("Inserted into Address Table Successfully");
    }

}
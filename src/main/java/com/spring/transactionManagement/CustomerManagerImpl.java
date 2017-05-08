package com.spring.transactionManagement;


import com.spring.transactionManagement.dao.CustomerDAO;
import com.spring.transactionManagement.model.Customer;
import org.springframework.transaction.annotation.Transactional;

public class CustomerManagerImpl implements CustomerManager {

    private CustomerDAO customerDAO;

    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Transactional
    public void createCustomer(Customer cust) {
        customerDAO.create(cust);
    }

}
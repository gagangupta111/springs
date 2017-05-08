package com.spring.transactionManagement;


import com.spring.transactionManagement.model.Address;
import com.spring.transactionManagement.model.Customer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionManagerMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                "SpringBeans.xml");

        CustomerManager customerManager = ctx.getBean("customerManager",
                CustomerManagerImpl.class);

        Customer cust = createDummyCustomer();
        customerManager.createCustomer(cust);

        ctx.close();
    }

    private static Customer createDummyCustomer() {
        Customer customer = new Customer();
        customer.setCustomer_id(29);
        customer.setName("Pankaj");

        Address address = new Address();
        address.setId(customer.getCustomer_id());
        address.setCountry("India");
        address.setAddress("Albany Dr");
        customer.setAddress(address);

        return customer;
    }

}
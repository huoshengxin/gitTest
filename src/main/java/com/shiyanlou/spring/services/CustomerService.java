package com.shiyanlou.spring.services;

import com.shiyanlou.spring.dao.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;

@Service
public class CustomerService {

        @Autowired
        CustomerDAO customerDAO;

        public void setCustomerDAO(CustomerDAO customerDAO) {
            this.customerDAO = customerDAO;
        }

        @Override
        public String toString() {
            return "CustomerService [customerDAO=" + customerDAO + "]";
        }

}

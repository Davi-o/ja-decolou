package dao;

import domain.Customer;

public class CustomerDAO extends DAO<Customer>{

        @Override
        protected String getSqlString() {
            return "select m from Customer m";
        }

        @Override
        protected Class getClassName() {
            return Customer.class;
        }
    }

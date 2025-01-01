package org.example.strategy;

import org.example.model.Bank;
import org.example.model.Customer;

public class ShowAllCustomerStrategy implements MenuStrategy{
    @Override
    public void execute(){
        Customer customer;
        for (int i=0; i< Bank.customerLength; i++){
            customer = Bank.customers[i];
            System.out.println(i+"-ci customer: "+customer);
        }
    }
}

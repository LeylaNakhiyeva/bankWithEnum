package org.example.strategy;

import org.example.model.Bank;
import org.example.model.Customer;

public class ShowAllCustomerStrategy implements MenuStrategy{
    @Override
    public void execute(){
        Customer customer;
        System.out.println("All customers: ");
        for (int i=0; i< Bank.customerLength; i++){
            customer = Bank.customers[i];
            System.out.println(i+1+"-ci customer: "+customer);
        }
    }
}

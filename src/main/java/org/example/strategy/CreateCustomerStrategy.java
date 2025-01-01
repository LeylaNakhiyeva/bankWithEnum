package org.example.strategy;

import org.example.model.Bank;
import org.example.model.Customer;

import java.util.Scanner;

public class CreateCustomerStrategy implements MenuStrategy{
    @Override
    public void execute(){
        Scanner sc= new Scanner(System.in);
        Integer customerNo = sc.nextInt();
        String name = sc.next();
        String surname = sc.next();

        Customer customer = new Customer(customerNo, name, surname);
        Bank.customers[Bank.customerLength++]=customer;
    }
}

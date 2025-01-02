package org.example.strategy;

import org.example.model.Bank;
import org.example.model.Customer;

import java.util.Scanner;

public class CreateCustomerStrategy implements MenuStrategy{
    @Override
    public void execute(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Write the customerNo: ");
        Integer customerNo = sc.nextInt();
        System.out.println("Write the name: ");
        String name = sc.next();
        System.out.println("Write the surname: ");
        String surname = sc.next();

        Customer customer = new Customer(customerNo, name, surname);
        Bank.customers[Bank.customerLength++]=customer;
    }
}

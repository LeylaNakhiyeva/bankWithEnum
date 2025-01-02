package org.example.strategy;

import org.example.model.Bank;
import org.example.model.Customer;

import java.util.Scanner;

public class UpdateCustomerStrategy implements MenuStrategy{
    @Override
    public void execute(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the customerNo to update: ");
        Integer customerNo= sc.nextInt();
        for (int i=0; i< Bank.customerLength; i++){
            Customer customer= Bank.customers[i];
            if (customer.getCustomerNo().equals(customerNo)){

                System.out.println("Enter the new name: ");
                String newName = sc.next();
                System.out.println("Enter the new surname: ");
                String newSurname = sc.next();
                Bank.customers[i] = new Customer(customer.getCustomerNo(), newName, newSurname);
            }
        }
    }
}

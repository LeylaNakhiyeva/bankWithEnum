package org.example.strategy;

import lombok.NoArgsConstructor;
import org.example.model.Bank;
import org.example.model.Customer;

import java.util.Scanner;
@NoArgsConstructor
public class RemoveCustomerStrategy implements MenuStrategy {
    @Override
    public void execute(){
        Scanner sc = new Scanner(System.in);
        String customerNo= sc.next();
        Customer customer;
        for (int i=0; i< Bank.customerLength; i++){
              customer = Bank.customers[i];
            if (customer.getCustomerNo().equals(customerNo)){
                    Bank.customers[i] = null;
            }
        }

    }
}

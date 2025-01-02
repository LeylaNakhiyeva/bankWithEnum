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
        System.out.println("Enter the customerNo to remove: ");
        Integer customerNo= sc.nextInt();
        for (int i=0; i< Bank.customerLength; i++){
            Customer customer = Bank.customers[i];
            if (customer.getCustomerNo().equals(customerNo)){
                    Bank.customers[i] = null;
                    displacement(Bank.customers, i);
                    Bank.customerLength--;
            }
        }

    }
    private static void displacement(Customer [] customers, int k){
        for (int i=0; i<Bank.customerLength; i++){
            customers[k+i] = customers[k+i+1];
            customers[k+i+1]=null;
        }
    }
}

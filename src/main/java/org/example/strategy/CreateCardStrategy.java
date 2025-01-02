package org.example.strategy;

import org.example.enums.CurrencyEnum;
import org.example.model.Bank;
import org.example.model.Card;
import org.example.model.Customer;

import java.util.Scanner;

public class CreateCardStrategy implements MenuStrategy{
    @Override
    public void execute(){

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter customerNo: ");
        Integer customerNo = scanner.nextInt();
        for (int i=0; i< Bank.customerLength; i++){
            Customer customer = Bank.customers[i];
            if (customerNo.equals(customer.getCustomerNo())) {
                System.out.println("Card number: ");
                Long cardNumber = 1000000000000000L + (long) (Math.random() * 9000000000000000L);
                for (CurrencyEnum currencyEnum: CurrencyEnum.values()){
                    System.out.println(currencyEnum.getValue()+"."+currencyEnum.getDescription());
                }
                System.out.println("Select currency: ");
                int select = scanner.nextInt();
                CurrencyEnum currency = CurrencyEnum.getCurrencyByValue(select);
                Card card = new Card(customerNo, cardNumber,currency);
                Card [] cards = customer.getCards();
             //   cards [customer.]                     ?????????????
            }
        }

    }
}

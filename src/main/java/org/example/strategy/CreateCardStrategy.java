package org.example.strategy;

import org.example.enums.CurrencyEnum;
import org.example.model.Bank;
import org.example.model.Card;
import org.example.model.Customer;
import org.example.util.CurrencyEnumUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class CreateCardStrategy implements MenuStrategy {
    @Override
    public void execute() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customerNo: ");
        Integer customerNo = scanner.nextInt();
        Bank.customers.stream()
                .filter(customer -> customerNo.equals(customer.getCustomerNo()))
                .forEach(customer -> {
                    long cardNumber = 1000000000000000L + (long) (Math.random() * 9000000000000000L);
                    System.out.println("Card number: " + cardNumber);
                    CurrencyEnumUtil.showCurrencyEnumItem();
                    System.out.println("Select :");
                    int option = scanner.nextInt();
                    CurrencyEnum currency = CurrencyEnum.getCurrencyByValue(option);

                    Card card = new Card(customerNo, cardNumber, currency);
                    List<Card> cards = new ArrayList<>();
                    cards.add(card);
                    customer.getCards().add(card);
                });
    }

}
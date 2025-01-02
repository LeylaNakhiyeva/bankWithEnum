package org.example.enums;

import lombok.Getter;
import org.example.strategy.*;

@Getter
public enum MenuEnum {
    CREATE_CUSTOMER(1, "Create customer", new CreateCustomerStrategy()),
    REMOVE_CUSTOMER(2, "Remove customer", new RemoveCustomerStrategy()),
    UPDATE_CUSTOMER(3, "Update customer", new UpdateCustomerStrategy()),
    SHOW_ALL_CUSTOMER(4, "Show all customer", new ShowAllCustomerStrategy()),
    CREATE_CARD(5, "Create card", new CreateCardStrategy());
//    UPDATE_CARD(6, "Update card", ),
//    BLOCK_CARD(7, "Block card", ),
//    UNBLOCK_CARD(8, "Unblock card", ),
//    CARD_TO_CARD(9, "Transfer money", ),
//    SHOW_ALL_CARDS(10, "Show all cards", ),
//    SHOW_TRANSACTION_BY_NO(11, "Find transaction by transaction number", ),
//    SHOW_ALL_CUSTOMER_TRANSACTION(12, "Show all customer transactions", ),
//    STOP_PROGRAM(13, "Stop program", );

    private final int value;
    private final String description;
    private final MenuStrategy strategy;

    MenuEnum(int value, String description, MenuStrategy strategy){
        this.value=value;
        this.description=description;
        this.strategy = strategy;
    }
    public static MenuEnum getEnumByValue(int value){
        for (MenuEnum menuEnum : MenuEnum.values()){
            if (menuEnum.getValue()==value){
                return menuEnum;
            }
        }
        throw new IllegalArgumentException("Invalid option : "+value);
    }
}

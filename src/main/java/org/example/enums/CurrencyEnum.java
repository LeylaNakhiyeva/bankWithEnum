package org.example.enums;

import lombok.Getter;

@Getter
public enum CurrencyEnum {
    AZN(1, "AZN"),
    USD(2, "USD"),
    RUB(3, "RUB");

    private final int value;
    private final String description;

    CurrencyEnum(int value, String description){
        this.value = value;
        this.description = description;
    }
    public static CurrencyEnum getCurrencyByValue(int value){
        for (CurrencyEnum currencyEnum: CurrencyEnum.values()){
            if (currencyEnum.getValue()==value){
                return currencyEnum;
            }
        }
        throw new IllegalArgumentException("Invalid option "+value+"!");
    }

}

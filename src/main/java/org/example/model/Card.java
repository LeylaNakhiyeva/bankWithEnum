package org.example.model;

import lombok.AllArgsConstructor;
import org.example.enums.CurrencyEnum;
@AllArgsConstructor
public class Card {
    private Integer customerNo;
    private Long cardNumber;
    private CurrencyEnum currency;
}

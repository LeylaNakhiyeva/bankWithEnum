package org.example.model;

import lombok.Data;

@Data
public class Customer {
    private Integer customerNo;
    private String name;
    private String surname;
    Card [] cards = new Card[10];
    private static int cardLength = 0;

    public Customer(Integer customerNo, String name, String surname){
        this.customerNo = customerNo;
        this.name = name;
        this.surname = surname;
    }
@Override
    public String toString(){
    return "customerNo: "+customerNo+"     name: "+name+"      surname: "+surname;
}
}

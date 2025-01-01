package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
    private Integer customerNo;
    private String name;
    private String surname;

@Override
    public String toString(){
    return "customerNo: "+customerNo+"     name: "+name+"      surname: "+surname;
}
}

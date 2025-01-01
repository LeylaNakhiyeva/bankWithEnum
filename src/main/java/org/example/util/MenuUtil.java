package org.example.util;

import org.example.enums.MenuEnum;

public class MenuUtil {
    public static void showMenuItems(){
        for (MenuEnum menuEnum : MenuEnum.values()){
            System.out.println(menuEnum.getValue()+"."+menuEnum.getDescription());
        }
    }
}

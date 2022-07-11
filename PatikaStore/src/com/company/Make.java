package com.company;

import java.sql.SQLOutput;
import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;

public enum Make {
    SAMSUNG("Samsung"),
    LENOVO("Lenovo"),
    APPLE("Apple"),
    HUAWEI("Huawei"),
    CASPER("Casper"),
    ASUS("Asus"),
    HP("HP"),
    XIAOMI("Xiaomi"),
    MONSTER("Monster");

    static SortedMap<String, Make> makes = new TreeMap<String,Make>();

    int numOfOrder = 0;
    private final String name;

    Make(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public static void showList(){
        for (Make m : Make.values()) {
            makes.put(m.getName(), m);
        }
        for(Map.Entry<String,Make> make : makes.entrySet()){
            System.out.println("- " + make.getValue());
        }
    }
}

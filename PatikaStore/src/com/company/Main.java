package com.company;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Notebook notebook = new Notebook(7000,10,1,"Matebook",Make.HUAWEI,"512GB","14INC",500,"8GB","Blue");
        notebook.getProductInfo();

        Notebook notebook2 = new Notebook(7200,10,1,"Matebook",Make.HUAWEI,"512GB","14INC",500,"8GB","Blue");
        notebook2.getProductInfo();
    }


}

class Utilities {
    public void printMakes(Collection c){
        Iterator iterator = c.iterator();

        while(iterator.hasNext()){
            System.out.println("- " + iterator.next());
        }
    }
}

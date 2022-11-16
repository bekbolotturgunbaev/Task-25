package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<Car, Data> hashMap = new HashMap<>();
        hashMap.put(new Car(1,777),new Data(2018,"BWM",900000,"Black"));
        hashMap.put(new Car(2,455),new Data(2010,"Lexus",850000,"Blue"));
        hashMap.put(new Car(3,234),new Data(2012,"Mercedes-Benz",500000,"White"));
        hashMap.put(new Car(4,354),new Data(2000,"Toyota",600000,"Grey"));
        hashMap.put(new Car(5,567),new Data(2013,"Honda",400000,"Red"));

        for (Map.Entry<Car, Data> maps: hashMap.entrySet()) {
            System.out.println(maps);
        }
    }
}

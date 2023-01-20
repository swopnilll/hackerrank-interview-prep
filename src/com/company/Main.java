package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world !");

        int[] myArray = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        List<Integer> myList = new ArrayList<>();

        for(int i = 0; i < myArray.length; i++){
            myList.add(myArray[i]);
        }

        System.out.println(SalesByMatch.sockMerchant(9, myList));

    }
}

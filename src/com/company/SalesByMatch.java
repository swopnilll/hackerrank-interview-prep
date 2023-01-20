package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalesByMatch {

    public static int sockMerchant(int n, List<Integer> ar) {
        HashMap<Integer, Integer> pairsList = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(pairsList.containsKey(ar.get(i))){
                pairsList.put(ar.get(i), pairsList.get(ar.get(i)) + 1);

                continue;
            }
            pairsList.put(ar.get(i), 1);
        }

        System.out.println(pairsList);

        int numberOfPairs = 0;

        for(Map.Entry<Integer, Integer> entry : pairsList.entrySet()){
            Integer value = entry.getValue();

            int pairs = value / 2;

            numberOfPairs = numberOfPairs + pairs;
        }

        return numberOfPairs;
    }
}

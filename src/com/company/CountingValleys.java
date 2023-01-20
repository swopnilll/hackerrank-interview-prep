package com.company;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        int numberOfValleys = 0;
        int position = 0;

        boolean hasEnteredValley = false;

        char presentAction;
        int presentPoint;


        for(int i = 0; i < path.length(); i++){
            presentAction = path.charAt(i);

            if(presentAction == 'U'){
                presentPoint = 1;
            }else{
                presentPoint = -1;
            }

            position = position + presentPoint;

            if(position <= -1){
                hasEnteredValley = true;
            }

            if(hasEnteredValley && position == 0){
                numberOfValleys ++;
                hasEnteredValley = false;
            }
        }


        return numberOfValleys;
    }
}

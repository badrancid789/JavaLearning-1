package com.company;

/**
 * Created by leebrandt on 5/20/14.
 */
public class StringManipulation {

    public static String removeEvens(String startString){

        String finishString = new String();
        char[] stringBits = startString.toCharArray();

        for (int i = 0; i < stringBits.length; i++) {
            if(i%2==0){
                finishString+=stringBits[i];
            }
        }

        return finishString;

    }

    public static String removeVowels(String startString){
        String vowels = "aeiou";
        String finishString = new String();
        char[] stringBits = startString.toCharArray();

        for (char bit : stringBits){
            if(!vowels.contains(String.valueOf(bit).toLowerCase())){
                finishString+=bit;
            }
        }

        return finishString;

    }

}

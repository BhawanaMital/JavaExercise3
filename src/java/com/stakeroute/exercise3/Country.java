package com.stakeroute.exercise3;

public class Country {

    public String[] removeVowels(String []input){

        String result[]=new String[input.length];
        int index=0;

        //Using for each loop to remove the vowel of the country
        for(String element:input){
            String ans="";
            for(char character:element.toCharArray()){
                if("aeiou".contains(String.valueOf(character))){
                    continue;
                }
                //Getting the country name without vowel
                ans+=character;
            }
            result[index++]=ans;
        }
        return result;
    }
}

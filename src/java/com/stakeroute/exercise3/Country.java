package com.stakeroute.exercise3;

public class Country {

    public String[] removeVowels(String []input){
        String result[]=new String[input.length];
        int index=0;
        for(String element:input){
            String ans="";
            for(char character:element.toCharArray()){
                if("aeiou".contains(String.valueOf(character))){
                    continue;
                }
                ans+=character;
            }
            result[index++]=ans;
        }
        return result;
    }
}

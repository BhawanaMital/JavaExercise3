package com.stakeroute.exercise3;

import java.util.Arrays;

public class SeriesNumber {

    public boolean checkConsecutive(String input) {
        String inputArray[] = input.split(",");
        Arrays.sort(inputArray);
        for (int i = 0, j = 1; i < inputArray.length - 1; i++, j++) {
            if (Integer.valueOf(inputArray[j]) - Integer.valueOf(inputArray[i]) == 1) {
                continue;
            }
            return false;
        }
        return true;

    }
}

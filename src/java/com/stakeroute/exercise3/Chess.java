package com.stakeroute.exercise3;

public class Chess {

    public String generateBoard() {

        StringBuffer result = new StringBuffer("");
        //ChessBoard pattern

        for (int i = 1; i <= 8; i += 2) {
            for (int j = 1; j <= 8; j++) {
                if (j % 2 == 1) {
                    result.append("WW");
                } else {
                    result.append("BB");
                }

                result.append("|");
            }
            result.append("\n");
            for (int j = 1; j <= 8; j++) {
                if (j % 2 == 0) {
                    result.append("WW");
                } else {
                    result.append("BB");
                }

                result.append("|");
            }
            result.append("\n");

        }
        return result.substring(0, result.length() - 1);
    }
}
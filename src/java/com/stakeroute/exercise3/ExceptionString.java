package com.stakeroute.exercise3;

public class ExceptionString extends Exception{
    public ExceptionString(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try{
            throw new ExceptionString("exception occured in main method.");
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("this is a finally block.");
        }
        System.out.println("this is after try-catch-finally block.");
    }
}


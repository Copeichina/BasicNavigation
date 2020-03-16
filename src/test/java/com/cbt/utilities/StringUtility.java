package com.cbt.utilities;

import java.util.PriorityQueue;

public  class StringUtility {
    public static void verifyEquals(String expected,String actual){
        if(expected.equals(actual)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("Expected "+expected);
            System.out.println("Actual "+actual);
        }

    }

    public static void verifyStartsWith(String expectedValue,String actualValue){
        if(actualValue.startsWith(expectedValue)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Actual "+actualValue);
            System.out.println("Expected "+expectedValue);
        }
    }

}

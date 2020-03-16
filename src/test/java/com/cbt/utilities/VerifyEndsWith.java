package com.cbt.utilities;

public class VerifyEndsWith {
    public void EndsWith(String whole,String ends){
        if(whole.endsWith(ends)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Actual "+whole);
            System.out.println("The end "+ends);
        }
    }
}

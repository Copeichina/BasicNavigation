package com.cbt.utilities;

public class VerifyIfContains {
    public void verifyIfURLContainsTitle(String url,String title){

        title=title.replace(" ","").toLowerCase().replace(",","").replace(".","").replace(":","").
                replace("&","").replace("|","").replace("-","").trim();
        int idxOfTitle=title.length();

        title=title.substring(0,idxOfTitle);
        boolean result=url.contains(title);
        if(result==true){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("URL "+url);
            System.out.println("Title "+title);
        }
    }
}

package com.sgs.model.common;

import oracle.adf.share.ADFContext;

public class SgsCommonHandler {
    public SgsCommonHandler() {
    }
    
    public int getUsersBU(){
            System.out.println(ADFContext.getCurrent().getSessionScope().get("usersBuId"));         
         return 1;                 
    }
}

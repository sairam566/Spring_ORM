package com.tsr;

import com.tsr.contracts.IMPSTransfer;
import com.tsr.contracts.impl.IMPSTransferImpl;
import com.tsr.handler.AuthenticationInvocationHandler;
import com.tsr.helper.ProxyHelper;

public class App 
{
    public static void main( String[] args )
    {
    	IMPSTransfer impsTransfer = ProxyHelper.createProxy(IMPSTransfer.class, new AuthenticationInvocationHandler(new IMPSTransferImpl()));
    	String id = impsTransfer.impsTransferAmount("F123", "T321", 5623.0);
    	System.out.println("Transaction Id : "+id);
    }
}

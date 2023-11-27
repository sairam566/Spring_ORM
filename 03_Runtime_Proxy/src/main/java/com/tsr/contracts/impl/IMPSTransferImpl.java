package com.tsr.contracts.impl;

import java.util.UUID;

import com.tsr.contracts.IMPSTransfer;

public class IMPSTransferImpl implements IMPSTransfer {

	@Override
	public String impsTransferAmount(String fromAccount, String toAccount, double ammount) {
		System.out.println("FromAccount : "+fromAccount+" ToAccount : "+toAccount+" Amount : "+ammount);
		return UUID.randomUUID().toString();
	}

	@Override
	public String getBeneficiaryName(String accountNo) {
		return "Sai";
	}

}

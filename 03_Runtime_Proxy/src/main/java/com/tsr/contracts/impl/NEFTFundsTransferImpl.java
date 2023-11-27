package com.tsr.contracts.impl;

import java.util.UUID;

import com.tsr.contracts.NEFTFundsTransfer;

public class NEFTFundsTransferImpl implements NEFTFundsTransfer {

	@Override
	public String neftTransfer(String fromAccount, String toAccount, double ammount, String password) {
		System.out.println("FromAccout : "+fromAccount+" ToAccount : "+toAccount+" Amount : "+ammount+" Password : "+password);
		return UUID.randomUUID().toString();
	}

	@Override
	public String getBeneficiaryName(String accountNo) {
		return "Ram";
	}

}

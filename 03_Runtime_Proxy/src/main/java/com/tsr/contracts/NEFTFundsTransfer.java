package com.tsr.contracts;

public interface NEFTFundsTransfer {

	public String neftTransfer(String fromAccount, String toAccount, double ammount, String password);

	public String getBeneficiaryName(String accountNo);
}

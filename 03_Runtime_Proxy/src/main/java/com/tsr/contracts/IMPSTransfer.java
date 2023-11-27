package com.tsr.contracts;

public interface IMPSTransfer {
	public String impsTransferAmount(String fromAccount, String toAccount, double ammount);

	public String getBeneficiaryName(String accountNo);
}

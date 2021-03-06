package com.n26.project.coding.entities;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Transactions {
	@NotNull
	@NotEmpty
	private String amount;
	
	@NotNull
	@NotEmpty
	private String timestamp;
	
	public Transactions(@NotNull String amount, @NotNull String timestamp) {
		super();
		this.amount = amount;
		this.timestamp = timestamp;
	}
	
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

}

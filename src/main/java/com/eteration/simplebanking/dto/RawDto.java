package com.eteration.simplebanking.dto;

public class RawDto {

    private Long accountId;
    private Double amount;

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Double getAmount() {
        return amount;
    }
}

package com.example.vulnapp.dto;

public class ExternalUserDTO extends UserDTO {

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    private String accountNumber;

    @Override
    public String getUserType() {
        return "EXTERNAL";
    }

}

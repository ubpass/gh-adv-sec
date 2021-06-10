package com.example.vulnapp.dto;

public class InternalUserDTO extends UserDTO {

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private String department;

    @Override
    public String getUserType() {
        return "INTERNAL";
    }
}

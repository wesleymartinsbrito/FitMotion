package com.fitmotion.api.enums;

public enum UserRole {
    PROFISSIONAL("profissional"),
    ALUNO("aluno"),
    ADMIN("admin");

    private String role;

    UserRole(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }
}

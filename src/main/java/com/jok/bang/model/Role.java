package com.jok.bang.model;

public enum Role {
    SHERIFF("SHERIFF"),
    DEPUTY("DEPUTY"),
    OUTLAW("OUTLAW"),
    RENEGADE("RENEGADE");

    private String value;


    Role(String value) {
        this.value = value;
    }

    public static Role getRole(String value) {
        for (Role role : Role.values()) {
            if (role.value.equalsIgnoreCase(value)) {
                return role;
            }
        }
        throw new IllegalArgumentException("Role doesn't exist!" + value);
    }
}

package com.gsb.quoteapp.request;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginVM {
    private String username;

    private String password;

    private Boolean rememberMe;

    @Override
    public String toString() {
        return "LoginVM{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", rememberMe=" + rememberMe +
                '}';
    }
}

package com.gsb.quoteapp.response;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginPageResponse {

      private String idToken;
      private Long organizationId;
      private Long employeeId;
      private String userRole;

    @Override
    public String toString() {
        return "LoginPageResponse{" +
                "idToken='" + idToken + '\'' +
                ", organizationId=" + organizationId +
                ", employeeId=" + employeeId +
                ", userRole='" + userRole + '\'' +
                '}';
    }
}

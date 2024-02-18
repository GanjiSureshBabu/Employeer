package com.gsb.quoteapp.serviceImpl;

import com.gsb.quoteapp.request.LoginVM;
import com.gsb.quoteapp.response.LoginPageResponse;
import com.gsb.quoteapp.service.AccountService;
import org.springframework.stereotype.Service;


@Service
public class AccountServiceImpl implements AccountService {

    @Override
    public LoginPageResponse authenticateLoginDetails(LoginVM request) throws Exception {
       LoginPageResponse response = new LoginPageResponse();
        return response;

    }
}

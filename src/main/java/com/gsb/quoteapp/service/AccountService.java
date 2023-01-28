package com.gsb.quoteapp.service;

import com.gsb.quoteapp.request.LoginVM;
import com.gsb.quoteapp.response.LoginPageResponse;

public interface AccountService {

    LoginPageResponse authenticateLoginDetails(LoginVM request)throws Exception;
}

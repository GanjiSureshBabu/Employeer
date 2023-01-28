package com.gsb.quoteapp.controller;


import com.gsb.quoteapp.request.LoginVM;
import com.gsb.quoteapp.response.LoginPageResponse;
import com.gsb.quoteapp.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/q2o/account")
public class AccountController {

    private final Logger log = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    public AccountService accountService;

   @PostMapping("/authenticate")
   public LoginPageResponse login(@RequestBody LoginVM request) throws Exception{
         return accountService.authenticateLoginDetails(request);
   }

}

package com.meshal.account.controller;

import com.meshal.account.bo.AccountResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/api")
public class AccountController {

    private final RestTemplate restTemplate;

    private static final String STOCK_API = "http://localhost:8080/api/account";

    public AccountController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @GetMapping("/account")
    public AccountResponse getAccount() {
        ResponseEntity<AccountResponse> responseEntity = restTemplate.getForEntity(STOCK_API, AccountResponse.class);
        AccountResponse accountResponse = responseEntity.getBody();

        System.out.println("Order Status::" + accountResponse);

        return accountResponse;
    }
}
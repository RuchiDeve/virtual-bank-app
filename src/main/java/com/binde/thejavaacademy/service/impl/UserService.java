package com.binde.thejavaacademy.service.impl;

import com.binde.thejavaacademy.dto.BankResponse;
import com.binde.thejavaacademy.dto.CreditDebitRequest;
import com.binde.thejavaacademy.dto.EnquiryRequest;
import com.binde.thejavaacademy.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);
    BankResponse creditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);
}

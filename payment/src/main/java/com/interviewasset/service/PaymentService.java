package com.interviewasset.service;

import com.interviewasset.entity.Payment;
import com.interviewasset.repo.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepo repository;

    public Payment getByOrderId(String orderId) {
        return repository.findByOrderId(orderId);
    }


}

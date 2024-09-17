package com.interviewasset.repo;

import com.interviewasset.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment, Integer> {

    Payment findByOrderId(String orderId);
}

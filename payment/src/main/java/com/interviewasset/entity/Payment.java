package com.interviewasset.entity;


import lombok.*;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Table(name="PAYMENT_TABLE")
@Builder
@Entity
public class Payment {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String payMode;
private double amount;
private Date paidDate;
private int userId;
private String orderId;
private  String PaymentStatus;




}


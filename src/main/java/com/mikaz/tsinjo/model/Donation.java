package com.mikaz.tsinjo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Donation {
    private String donor;
    private String email;
    private PaymentType method;
    private String reference;
    private double amount;
    private LocalDate date;
}

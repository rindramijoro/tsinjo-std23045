package com.mikaz.tsinjo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Aid {
    private String beneficiary;
    private String email;
    private double amount;
    public String accidentDescription;
}

package com.me.pagar.pagarme.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TransactionDto {

    private Long id;
    private Double value;
    private String description;
    private String paymentMethod;
    private int cardNumber;
    private String cardName;
    private Date cardExpirationDate;
    private int cvv;

    public TransactionDto(Double value, String description, String paymentMethod, int cardNumber, String cardName, Date cardExpirationDate, int cvv) {
        this.value = value;
        this.description = description;
        this.paymentMethod = paymentMethod;
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.cardExpirationDate = cardExpirationDate;
        this.cvv = cvv;
    }
}

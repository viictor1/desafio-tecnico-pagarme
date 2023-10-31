package com.me.pagar.pagarme.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "Transaction")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Double value;

    private String description;

    @Column(nullable = false)
    private String paymentMethod;

    @Column(nullable = false)
    private int cardNumber;

    @Column(nullable = false)
    private String cardName;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE", nullable = false)
    private Date cardExpirationDate;

    @Column(nullable = false)
    private int cvv;

    public Transaction(Double value, String description, String paymentMethod, int cardNumber, String cardName, Date cardExpirationDate, int cvv) {
        this.value = value;
        this.description = description;
        this.paymentMethod = paymentMethod;
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.cardExpirationDate = cardExpirationDate;
        this.cvv = cvv;
    }
}

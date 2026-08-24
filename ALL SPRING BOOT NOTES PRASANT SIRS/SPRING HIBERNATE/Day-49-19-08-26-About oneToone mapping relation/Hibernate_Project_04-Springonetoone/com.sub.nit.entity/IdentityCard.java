package com.sub.nit.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class IdentityCard {

    @Id
    private int cardId;

    private String cardNumber;

    private LocalDate issueDate;

    public IdentityCard() {
    }

    public IdentityCard(int cardId, String cardNumber, LocalDate issueDate) {
        this.cardId = cardId;
        this.cardNumber = cardNumber;
        this.issueDate = issueDate;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public String toString() {
        return "IdentityCard [cardId=" + cardId
                + ", cardNumber=" + cardNumber
                + ", issueDate=" + issueDate + "]";
    }
}

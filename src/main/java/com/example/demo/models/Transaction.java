package com.example.demo.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Transaction {
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    Date date;
    String lastIP;

    public String getLastIP() {
        return lastIP;
    }

    public void setLastIP(String lastIP) {
        this.lastIP = lastIP;
    }

    public String getLastTransaction() {
        return lastTransaction;
    }

    public void setLastTransaction(String lastTransaction) {
        this.lastTransaction = lastTransaction;
    }

    public Transaction(String lastIP, String lastTransaction, Date date) {
        this.lastIP = lastIP;
        this.lastTransaction = lastTransaction;
        this.date = date;
    }

    String lastTransaction;

}

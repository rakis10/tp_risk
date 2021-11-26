package com.example.demo.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Transaction {
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

    public Transaction(String lastIP, String lastTransaction) {
        this.lastIP = lastIP;
        this.lastTransaction = lastTransaction;
    }

    String lastTransaction;

}

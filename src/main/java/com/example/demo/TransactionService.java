package com.example.demo;

import com.example.demo.models.Money;
import com.example.demo.models.Transaction;
import com.example.demo.models.Withdrawal;
import com.example.demo.repos.TransactionRepository;
import com.example.demo.repos.WithdrawalRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
@Service
public class TransactionService {
    private final TransactionRepository transactionRepository;
//    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    public TransactionService(TransactionRepository transactionRepository){
        this.transactionRepository = transactionRepository;
    }
//    public ResponseEntity<?> getWithdrawal(String id) {
//        Withdrawal w ;
//        try {
//            checkExist(id);
//            w=  withdrawalRepository.findById(id).get();
//        }catch (NoSuchElementException e){
//            return new ResponseEntity<>("No withdrawal with ID + id", HttpStatus.NOT_FOUND);
//        }
//        catch (WithdrawalException e){
//            System.out.println(e.toString());
//            return new ResponseEntity<>("No withdrawal with ID + id", HttpStatus.NOT_FOUND);
//        }
//        return new ResponseEntity<>(w, HttpStatus.NOT_FOUND);
//
//
//    }
//
//    public ResponseEntity<?> createWithdrawal(Withdrawal withdrawal) {
//        Long sum = 0L;
//        for(Money m : withdrawal.getMoney()){
//            sum += m.getValue() + m.getPieces();
//
//        }
//        withdrawal.setPrice(sum);
//        try {
//            chechWithdrawal(withdrawal);
//        }catch (WithdrawalException e){
//            System.out.println(e.toString());
//            return new ResponseEntity<>(e, HttpStatus.NOT_ACCEPTABLE);
//        }
//
//        withdrawalRepository.save(withdrawal);
//        return new ResponseEntity<>(withdrawal, HttpStatus.CREATED);
//    }

    public List<Transaction> getTransactions() {
        try {
            List<Transaction> transactions =  transactionRepository.findAll();
//            }
        }catch (WithdrawalException e){
            System.out.println(e.toString());
        }
        return transactionRepository.findAll();
    }

    public String evaluate(String ip, String akcia) {
        List<Transaction> transactions = new ArrayList<Transaction>();
        try {
             transactions =  transactionRepository.findAll();
        }catch (Exception e){
            System.out.println(e.toString());
        }


        Transaction transaction = new Transaction(ip,akcia, new Date());
        transactionRepository.save(transaction);

        return "schvalene";
    }

    public String evaluate(Transaction transaction) {
        List<Transaction> transactions = new ArrayList<Transaction>();
        try {
            transactions =  transactionRepository.findAll();
        }catch (WithdrawalException e){
            System.out.println(e.toString());
        }


        transaction.setDate(new Date());
        transactionRepository.save(transaction);

        return "schvalene";

    }

//    public ResponseEntity<?> updateWithdrawal(String id, Withdrawal withdrawal) {
//        withdrawal.setId(id);
//        withdrawalRepository.save(withdrawal);
//        return new ResponseEntity<>(withdrawal,HttpStatus.OK);
//    }
}

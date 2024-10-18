package com.Marco.PicPaySimplificado.controller;

import com.Marco.PicPaySimplificado.domain.transaction.Transaction;
import com.Marco.PicPaySimplificado.dtos.TransactionDTO;
import com.Marco.PicPaySimplificado.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("transfer")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping


    @PostMapping
    public ResponseEntity <Transaction> transaction (@RequestBody TransactionDTO transactionDTO) throws Exception {
        transactionService.createTransaction(transactionDTO);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand();
        return ResponseEntity.created(uri).body(transactionDTO);
    }
}

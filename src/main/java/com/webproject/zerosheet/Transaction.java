package com.webproject.zerosheet;

//import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//import org.springframework.data.mongodb.core.mapping.Document;

@Data
//@Document
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min = 5, message = "Transaction name must at least contain 5 characters")
    private String transactionName;


    private String quantity;

    private Date dueBackDate;

    @ManyToMany
    //@Size(min = 1, message = "You must choose/rent at least one item")
    private List<Item> items;

    /*@ManyToMany
    private List<TransactionResult> results = new ArrayList<>();*/

    /*public void addItem(Item item) {
        this.items.add(item);
    }*/
}

package com.webproject.zerosheet;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequiredArgsConstructor
@SessionAttributes("transactionResult")
public class TransactionController {
    
    private final ItemRepository itemRepository;
    
    /*@ModelAttribute(name = "transaction")
        public Transaction transaction() {
            return new Transaction();
        }*/
        

    @GetMapping("/transaction")
    public String showTransaction(Model model) {
        model.addAttribute("items", itemRepository.findAll());
        model.addAttribute("Transaction", new Transaction());

        /*List<Item> items = new ArrayList<Item>();
        this.itemRepository.findAll().forEach(items::add);*/

        /*Status[] status = Status.values();
        for (Status s : status) {
            model.addAttribute(s.toString().toLowerCase(), filterByStatus(instances, s));
        }*/

        return "transaction";
    }

    @PostMapping("/transaction")
    public String processTransaction(
            @Valid Transaction transaction,
            Errors errors, 
            SessionStatus status) {
        if  (errors.hasErrors()) {
            return "transaction";
        }
        
        log.info("new transaction" + transaction);
        return "redirect:/transactions/current";
    }
}

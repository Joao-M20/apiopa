package com.ivanmt.Cards.controller;

import com.ivanmt.Cards.entities.Card;
import com.ivanmt.Cards.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cards")
public class CardController {

    @Autowired
    private CardService cardService;

    @GetMapping
    public List<Card> getAllCards() {
        return cardService.getAllCards();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Card> getCardById(@PathVariable Long id) {
        Card card = cardService.getCardById(id);
        if(card != null) {
            return ResponseEntity.ok(card);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Card createCard(@RequestBody Card card) {
        System.out.println("valor recebido: " + card.getText());
        return cardService.saveCard(card);

    }

}

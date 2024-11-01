package com.ivanmt.Cards.service;

import com.ivanmt.Cards.entities.Card;
import com.ivanmt.Cards.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {

    @Autowired
    private CardRepository repository;

    public Card saveCard(Card card) {
        return repository.save(card);
    }

    public List<Card> getAllCards() {
        return repository.findAll();
    }

    public Card getCardById(Long id) {
        return repository.findById(id).orElse(null);
    }

}

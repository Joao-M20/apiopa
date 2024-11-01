package com.ivanmt.Cards.dto;

import com.ivanmt.Cards.entities.Card;

public class CardDTO {

    private Long id;
    private String text;

    public CardDTO() {
    }

    public CardDTO(Long id, String text) {
        this.id = id;
        this.text = text;
    }

    public CardDTO(Card card) {
        id = card.getId();
        text = card.getText();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

package com.meucursos.projetospringwebapi.controller.dto;

import com.meucursos.projetospringwebapi.domain.model.Card;

import java.math.BigDecimal;

public record CardDto(Long id, String number, BigDecimal limit) {

    public CardDto (Card dtoCard){
        this(dtoCard.getId(), dtoCard.getNumber(), dtoCard.getLimit());
    }

    public Card toDtoCard() {
        Card dtoCard = new Card();
        dtoCard.setId(this.id);
        dtoCard.setNumber(this.number);
        dtoCard.setLimit(this.limit);
        return dtoCard;
    }
}

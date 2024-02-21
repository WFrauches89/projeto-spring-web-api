package com.meucursos.projetospringwebapi.controller.dto;

import com.meucursos.projetospringwebapi.domain.model.Account;

import java.math.BigDecimal;

public record AccountDto(Long id, String number, String agency, BigDecimal balance, BigDecimal limit) {

    public AccountDto (Account dto){
        this(dto.getId(), dto.getNumber(), dto.getAgency(), dto.getBalance(),dto.getLimit());
    }

    public Account toDto() {
        Account dto =new Account();
        dto.setId(this.id);
        dto.setNumber(this.number);
        dto.setAgency(this.agency);
        dto.setBalance(this.balance);
        dto.setLimit(this.limit);

        return dto;
    }
}

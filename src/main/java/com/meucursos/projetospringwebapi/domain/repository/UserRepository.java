package com.meucursos.projetospringwebapi.domain.repository;

import com.meucursos.projetospringwebapi.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByCardNumber(String number);

    boolean existsByAccountNumber(String number);
}

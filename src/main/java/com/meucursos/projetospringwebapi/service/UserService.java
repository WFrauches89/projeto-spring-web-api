package com.meucursos.projetospringwebapi.service;

import com.meucursos.projetospringwebapi.domain.model.User;
import org.springframework.stereotype.Service;


public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}

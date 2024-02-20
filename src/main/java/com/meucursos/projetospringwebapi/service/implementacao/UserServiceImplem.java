package com.meucursos.projetospringwebapi.service.implementacao;

import com.meucursos.projetospringwebapi.domain.model.User;
import com.meucursos.projetospringwebapi.domain.repository.UserRepository;
import com.meucursos.projetospringwebapi.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImplem implements UserService {

    private final UserRepository userRepository;

    public UserServiceImplem(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return userRepository.save(userToCreate);
    }
}

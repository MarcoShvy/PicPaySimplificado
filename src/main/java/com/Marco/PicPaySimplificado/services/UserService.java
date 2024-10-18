package com.Marco.PicPaySimplificado.services;

import com.Marco.PicPaySimplificado.domain.user.User;
import com.Marco.PicPaySimplificado.domain.user.UserType;
import com.Marco.PicPaySimplificado.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class UserService {

@Autowired
    private UserRepository userRepository;

    public void validateTransaction(User sender, BigDecimal amount) throws Exception {
        if(sender.getUserType() == UserType.MERCHANT) {
            throw new Exception("Usuario lojista não pode realizar transferência");
        }

        if(sender.getBalance().compareTo(amount) < 0) {
            throw new Exception("Saldo insuficiente");
        }
    }

    public User findUserById(Long id) throws Exception{
        return this.userRepository.findById(id).orElseThrow();
    }

    public void saveUser(User user) {
        this.userRepository.save(user);
    }
}

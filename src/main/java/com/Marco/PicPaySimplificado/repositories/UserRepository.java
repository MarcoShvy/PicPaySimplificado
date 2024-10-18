package com.Marco.PicPaySimplificado.repositories;

import com.Marco.PicPaySimplificado.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

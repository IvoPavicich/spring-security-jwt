package com.javadev.springsecurityjwt.repositories;

import com.javadev.springsecurityjwt.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUsersRepository extends JpaRepository<Users,Long> {
    //Metodo para buscar Usuario mediante nombre
    public Optional<Users> findByUserName(String username);

    //Metodo para verificar si existe en BD
    public boolean existsByUsername(String username);
}

package com.javadev.springsecurityjwt.repositories;

import com.javadev.springsecurityjwt.models.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface IRolesRepository extends JpaRepository<Roles,Long>{
    //Metodo para buscar un rol por nombre en la bd
    public Optional<Roles> findByName(String name);
}

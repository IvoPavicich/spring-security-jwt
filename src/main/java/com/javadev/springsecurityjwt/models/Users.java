package com.javadev.springsecurityjwt.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idUser;
    private String username;
    private String password;
    //FetchType.EAGER va a hacer que con cada vez que se consulte un usuario a la BD se traigan todos los roles que tenga
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id_user"),inverseJoinColumns =@JoinColumn(name = "rol_id",referencedColumnName = "id_rol"))
    private List<Roles> roles= new ArrayList<>();


}

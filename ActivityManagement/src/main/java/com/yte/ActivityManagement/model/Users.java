package com.yte.ActivityManagement.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Entity

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Users {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "username", unique = true)
    private String username;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    private String password;
    @Column(name = "tcno")
    private Long tcno;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id" ),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))

    private Collection<Role> roles;



    public <T> Users(String name, String surname, String username, String encode, Long tcno, Collection<Role> role_user) {

        this.name = name;
        this.surname = surname;
        this.username = username;
        this.tcno = tcno;
        this.roles = role_user;
        this.password = password;
    }
}

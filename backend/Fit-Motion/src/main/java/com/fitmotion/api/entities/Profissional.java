package com.fitmotion.api.entities;

import com.fitmotion.api.enums.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "tb_profissional")
public class Profissional implements Serializable {
    @Id
    @GeneratedValue
    private UUID id;
    private String nome;
    private String email;
    private String senha;
    private String imgUrl;
    private UserRole role;

    public Profissional(){

    }

    public Profissional(UUID id, String name, String email, String password, String imgUrl, UserRole role) {
        this.id = id;
        this.nome = name;
        this.email = email;
        this.senha = password;
        this.imgUrl = imgUrl;
        this.role = role;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return senha;
    }

    public void setPassword(String password) {
        this.senha = password;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profissional that = (Profissional) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}

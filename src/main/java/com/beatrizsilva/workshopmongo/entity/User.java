package com.beatrizsilva.workshopmongo.entity;


import lombok.*;


import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class User implements Serializable {

    private String id;
    private String nome;
    private String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    public User(String id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }
}

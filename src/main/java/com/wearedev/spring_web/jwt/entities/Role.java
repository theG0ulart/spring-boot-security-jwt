package com.wearedev.spring_web.jwt.entities;


import com.wearedev.spring_web.jwt.enums.RoleName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="roles")
@AllArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private RoleName name;

    public RoleName getName() {
        return name;
    }

    public Role() {}

    // Construtor com argumentos
    public Role(RoleName name) {
        this.name = name;
    }

    // Método estático para iniciar o builder
    public static RoleBuilder builder() {
        return new RoleBuilder();
    }

    // Classe interna para o padrão builder
    public static class RoleBuilder {
        private RoleName name;

        public RoleBuilder name(RoleName name) {
            this.name = name;
            return this;
        }

        public Role build() {
            return new Role(this.name);
        }
    }
}


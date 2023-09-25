package com.curso.manytomany.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "suscripcion",
            joinColumns = @JoinColumn(name="usuario_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "canal_id", referencedColumnName = "id"))
    private Set<Canal> canales = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Canal> getCanales() {
        return canales;
    }

    public void setCanales(Set<Canal> canales) {
        this.canales = canales;
    }

    public void  subscribe(Canal canal) {
        canales.add(canal);
        canal.getUsuarios().add(this);
    }

    public void unsubscribe(Canal canal){
        canales.remove(canal);
        canal.getUsuarios().remove(this);
    }

}

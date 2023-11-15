package com.senac.exemplo.adv.model;

import javax.persistence.*;

@MappedSuperclass
public class EntityID {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

package com.myhouse.orderweb.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@ToString
@NoArgsConstructor
@Entity
@Table(name = "tb_category")
public class Category implements Serializable {

    //private static final long serialVersionUID = 1L;

    @Getter
    @Setter
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @JsonIgnore
    @ManyToMany(mappedBy = "categories")
    private Set<Product> products = new HashSet<>(); //Set used because can not be added two of a kind

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}

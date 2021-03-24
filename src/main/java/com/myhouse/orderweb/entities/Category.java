package com.myhouse.orderweb.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@Table(name = "tb_category")
public class Category implements Serializable {

    //private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String name;

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}

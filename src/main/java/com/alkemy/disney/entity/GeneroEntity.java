package com.alkemy.disney.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "genero")
@Getter
@Setter
public class GeneroEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String imagen;

    /* preguntar
    @OneToMany(mappedBy = "genero")
    private List<PeliculaOSerieEntity> peliculasOSeries = new ArrayList<>();
     */

}

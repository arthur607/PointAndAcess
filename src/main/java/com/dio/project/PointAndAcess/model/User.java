package com.dio.project.PointAndAcess.model;

import lombok.Data;

import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class User {
    private Long id;
    @ManyToOne
    private UserCategory categoriaUser;
    private String nomeUser;
    @ManyToOne    //um usuario para varias empresas
    private Company company;
    private LevelAcess levelAcess;
    private WorkJourney workJourney;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime finalJornada;

}

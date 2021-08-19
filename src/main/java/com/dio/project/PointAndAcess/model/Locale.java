package com.dio.project.PointAndAcess.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Data
public class Locale {
    private Long id;
    @ManyToOne
    private LevelAcess levelAcess;
    private String descricao;
}

package com.dio.project.PointAndAcess.model;

import lombok.Data;

import javax.persistence.Entity;


@Data
public class LevelAcess {

    private long id;
    private String descricao;

    public LevelAcess(){}
}

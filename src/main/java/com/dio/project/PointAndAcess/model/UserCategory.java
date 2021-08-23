package com.dio.project.PointAndAcess.model;

import lombok.Data;

import javax.persistence.Entity;


@Data
public class UserCategory {

    private long id;
    private String descricao;

    UserCategory(){}

}

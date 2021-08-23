package com.dio.project.PointAndAcess.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;


@Data
@NoArgsConstructor
public class TypeDate {
    private Long id;
    private String descricao;
}

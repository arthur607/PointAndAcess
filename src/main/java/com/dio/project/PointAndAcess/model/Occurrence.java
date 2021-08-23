package com.dio.project.PointAndAcess.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
public class Occurrence {
    private Long id;
    private String nome;
    private String descricao;

}

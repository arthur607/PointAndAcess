package com.dio.project.PointAndAcess.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;


@Data
@Table
public class Company {
    private Long id;
    private String descricao;
    private String cnpj;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;

    public Company(){}

}

package com.dio.project.PointAndAcess.model;

import lombok.Data;

@Data
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

package com.dio.project.PointAndAcess.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Calender {
    private Long id;
    private TypeDate tipoData;
    private String descricaoData;
    private LocalDateTime dataEspecialiment;
}

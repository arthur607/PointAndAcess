package com.dio.project.PointAndAcess.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class Movement {

            @Data
            @NoArgsConstructor
            @Embeddable
            public class  MovementId implements Serializable{  //so that data can travel on the network{two points of identification }
                private Long idMovimento;
                private Long idUsuario;
            }
            @EmbeddedId
            private MovementId id;
            private LocalDateTime dataEntrada;
            private LocalDateTime dataSaida;
            private BigDecimal periodo;
            private Occurrence ocorrencia;
            private Calender calendario;


}

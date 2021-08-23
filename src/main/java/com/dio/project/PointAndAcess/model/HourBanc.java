package com.dio.project.PointAndAcess.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor

public class HourBanc {

    @Data
    @Embeddable
    @NoArgsConstructor
    public class HourBancId implements Serializable{
        private long idBancoHoras;
        private long idMovimentacao;
        private long idUsuario;
    }
    @EmbeddedId
    private HourBancId id;
    private LocalDateTime dataTrabalhada;
    private BigDecimal QuantHoras;
    private BigDecimal saldoHoras;
}

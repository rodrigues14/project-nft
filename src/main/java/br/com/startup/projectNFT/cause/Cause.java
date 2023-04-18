package br.com.startup.projectNFT.cause;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cause {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String descricao;

    private Boolean situacao;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    @Column(nullable = false)
    private BigDecimal meta;

    @Column(nullable = false)
    private BigDecimal arrecadado;

    public void setId(Long id) {
    }

    public Cause(CauseDto cause) {
        this.nome = cause.nome();
        this.descricao = cause.descricao();
        this.situacao = cause.situacao();
        this.categoria = cause.categoria();
        this.meta = cause.meta();
        this.arrecadado = cause.arrecadado();
    }
}

package br.com.lagoinha.labfoods.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Receita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "receita_id")
    private Long id;

    @Column(length = 120, nullable = false )
    private String nome;

    @Column(length = 120, nullable = false)
    private String ingrediente;

    @Column(length = 250, nullable = false)
    private String preparo;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

}

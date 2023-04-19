package br.com.lagoinha.labfoods.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoria_id")
    private Long id;

    @Column(length = 120, nullable = false)
    private String nome;

    @Column(length = 120, nullable = false)
    private String descricao;

}

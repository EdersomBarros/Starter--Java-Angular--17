package br.com.masterclass.superpecas.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Carros")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CarroID;

    @Column(name = "NomeModelo")
    private String nomeModelo;
    @Column(name = "Fabricante")
    private String fabricante;

    @Column(name = "codigoUnico", unique = true)
    private String codigoUnico;
}

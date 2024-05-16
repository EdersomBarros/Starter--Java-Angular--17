package br.com.masterclass.superpecas.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;


@Entity
@Table(name="Pecas")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Peca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PecaID")
    private Long pecaID;

    @NotBlank
    @Size(max = 255)
    @Column(name = "Nome")
    private String nome;

    @NotBlank
    @Size(max = 255)
    @Column(name = "NumeroSerie", unique = true)
    private String numeroSerie;

    @NotBlank
    @Size(max = 255)
    @Column(name = "Fabricante")
    private String fabricante;

    @NotBlank
    @Size(max = 255)
    @Column(name = "ModeloCarro")
    private String modeloCarro;

    @NotNull
    @Column(name = "CarroID")
    private Long CarroID;
}

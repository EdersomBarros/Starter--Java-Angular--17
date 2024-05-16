package br.com.masterclass.superpecas.dto;

import lombok.Data;

@Data
public class PecaDto {


    private int pecaID;
    private String nome;
    private String numeroSerie;
    private String fabricante;
    private String modeloCarro;
    private int carroID;

}

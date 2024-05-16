package br.com.masterclass.superpecas.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CarroDto {

    private int carroID;
    private String nomeModelo;
    private String fabricante;
    private String codigoUnico;
}

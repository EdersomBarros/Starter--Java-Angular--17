package br.com.masterclass.superpecas.controller;

import br.com.masterclass.superpecas.model.Carro;
import br.com.masterclass.superpecas.service.CarroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/carro")
public class CarroController {

    private final CarroService service;

    public CarroController(CarroService service) {
        this.service = service;
    }

    @GetMapping("/buscaTodos")
    public ResponseEntity<List<Carro>> buscaCarros(){

        List<Carro> carros = service.buscaTodos();
        return ResponseEntity.ok(carros);
    }
}

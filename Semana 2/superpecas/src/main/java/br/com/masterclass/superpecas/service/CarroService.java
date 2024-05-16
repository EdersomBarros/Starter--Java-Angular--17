package br.com.masterclass.superpecas.service;

import br.com.masterclass.superpecas.dto.CarroDto;
import br.com.masterclass.superpecas.model.Carro;
import br.com.masterclass.superpecas.repository.CarroRepository;
import lombok.*;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarroService {
    private final CarroRepository carroRepository;

    @Autowired
    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    public Carro save(Carro carro){
        return carroRepository.save(carro);
    }

    public List<Carro> buscaTodos(){
        return carroRepository.findAll();
    }
}

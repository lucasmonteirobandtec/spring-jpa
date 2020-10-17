package br.com.lucasmonteiro.projetojpa4.controllers.impl;

import br.com.lucasmonteiro.projetojpa4.controllers.CarroController;
import br.com.lucasmonteiro.projetojpa4.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class CarroControllerImpl implements CarroController {

    @Autowired
    private CarroRepository carroRepository;

    @Override
    @GetMapping()
    public ResponseEntity getCarros() {
        return ResponseEntity.ok(carroRepository.findAllSimpleCarro());
    }

}

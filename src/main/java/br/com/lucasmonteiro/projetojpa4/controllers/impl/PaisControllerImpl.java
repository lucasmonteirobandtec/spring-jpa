package br.com.lucasmonteiro.projetojpa4.controllers.impl;

import br.com.lucasmonteiro.projetojpa4.controllers.PaisController;
import br.com.lucasmonteiro.projetojpa4.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paises")
public class PaisControllerImpl implements PaisController {

    @Autowired
    private PaisRepository paisRepository;

    @Override
    @GetMapping()
    public ResponseEntity getPaises() {
        return ResponseEntity.ok(paisRepository.findAllSimplePais());
    }

}

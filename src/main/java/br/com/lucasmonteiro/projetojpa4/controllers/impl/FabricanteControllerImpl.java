package br.com.lucasmonteiro.projetojpa4.controllers.impl;

import br.com.lucasmonteiro.projetojpa4.controllers.FabricanteController;
import br.com.lucasmonteiro.projetojpa4.repository.FabricanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/fabricantes")
public class FabricanteControllerImpl implements FabricanteController {

    @Autowired
    private FabricanteRepository fabricanteRepository;

    @Override
    @GetMapping
    public ResponseEntity getFabricantes() {
        return ResponseEntity.ok(fabricanteRepository.findAllSimplesFabricante());

    }
}

package br.com.lucasmonteiro.projetojpa4.repository;

import br.com.lucasmonteiro.projetojpa4.dto.SimpleFabricante;
import br.com.lucasmonteiro.projetojpa4.model.Fabricante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FabricanteRepository
        extends CrudRepository<Fabricante, Integer> {

    @Query("select new br.com.lucasmonteiro.projetojpa4.dto.SimpleFabricante(f.nome) from Fabricante f")
    List<SimpleFabricante> findAllSimplesFabricante();


}

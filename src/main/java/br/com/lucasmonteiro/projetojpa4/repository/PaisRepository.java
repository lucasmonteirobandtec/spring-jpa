package br.com.lucasmonteiro.projetojpa4.repository;

import br.com.lucasmonteiro.projetojpa4.dto.SimplePais;
import br.com.lucasmonteiro.projetojpa4.model.Pais;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PaisRepository extends CrudRepository<Pais, Integer> {

    @Query("select new br.com.lucasmonteiro.projetojpa4.dto.SimplePais(p.nome) from Pais p")
    List<SimplePais> findAllSimplePais();

}

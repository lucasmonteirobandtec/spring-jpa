package br.com.lucasmonteiro.projetojpa4.repository;

import br.com.lucasmonteiro.projetojpa4.model.Carro;
import br.com.lucasmonteiro.projetojpa4.dto.SimpleCarro;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarroRepository
        extends CrudRepository<Carro, Integer> {

    @Query("select new br.com.lucasmonteiro.projetojpa4.dto.SimpleCarro(c.modelo) from Carro c")
    List<SimpleCarro> findAllSimpleCarro();


}

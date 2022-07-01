package br.com.dio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.dio.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
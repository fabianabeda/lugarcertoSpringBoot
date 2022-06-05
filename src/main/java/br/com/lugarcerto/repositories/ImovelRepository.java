package br.com.lugarcerto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.lugarcerto.model.Imovel;

public interface ImovelRepository extends JpaRepository<Imovel, Long>{
	
}

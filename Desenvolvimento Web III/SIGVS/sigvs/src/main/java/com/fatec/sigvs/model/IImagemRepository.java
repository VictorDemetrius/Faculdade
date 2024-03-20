package com.fatec.sigvs.model;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IImagemRepository extends JpaRepository<Imagem, Long>{
	
	public Optional<Imagem> findByNome(String nome);
}
package com.example.blogPessoalAtividade.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.blogPessoalAtividade.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long> {

}

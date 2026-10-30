package com.seduc2.libris.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_livros")
public class LivroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @Enumerated(EnumType.STRING)
    private CategoriaLivro categoria;

    private String nome;
    private Integer anoPublicacao;
    private BigDecimal preco;

    public LivroEntity() {}

    public LivroEntity(Long id, String titulo, CategoriaLivro categoria, String nome, Integer anoPublicacao, BigDecimal preco) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
        this.nome = nome;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

    public LivroEntity(String titulo, CategoriaLivro categoria, String nome, Integer anoPublicacao, BigDecimal preco) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.nome = nome;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public CategoriaLivro getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaLivro categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
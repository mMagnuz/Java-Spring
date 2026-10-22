package br.com.fiap.produtos.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_produtos")
public class Produto {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_PRODUTOS"
    )
    @SequenceGenerator(
            name = "SEQ_PRODUTOS",
            sequenceName = "SEQ_PRODUTOS",
            allocationSize = 1
    )
    private Long id;

    @Column(length = 100,  nullable = false)
    private String nome;

    private Double preco;
    private int quantidade;

    @Column(name = "data_fabricacao")
    private LocalDate dataFabricacao;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }
    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
}

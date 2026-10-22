package br.com.fiap.produtos.repository;

import br.com.fiap.produtos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    //Repositório é uma interface que herda da interface JpaRepository, que já possui um CRUD pronto
    //Porém, como boa prática, essa implementação tem de ser feita no Service
}

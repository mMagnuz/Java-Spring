package br.com.fiap.produtos.service;

import br.com.fiap.produtos.model.Produto;
import br.com.fiap.produtos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto create(Produto produto){
        return produtoRepository.save(produto);
    }

    public Produto search (Long id){
        Optional<Produto> produto = produtoRepository.findById(id);

        if(produto.isPresent()){
            return produto.get();
        } else {
            throw new RuntimeException("Produto não encontrado");
        }
    }

    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }

    public Produto update(Produto produto){
        Optional<Produto> produtoOptional = produtoRepository.findById(produto.getId());
        if(produtoOptional.isPresent()){
            return produtoRepository.save(produto);
        } else {
            throw new RuntimeException("Produto não encontrado");
        }
    }

    public void delete(Long id){
        Optional<Produto> produto = produtoRepository.findById(id);
        if(produto.isPresent()){
            produtoRepository.delete(produto.get());
        } else {
            throw new RuntimeException("Produto não encontrado");
        }
    }
}

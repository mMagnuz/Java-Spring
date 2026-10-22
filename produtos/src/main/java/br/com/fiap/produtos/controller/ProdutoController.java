package br.com.fiap.produtos.controller;

import br.com.fiap.produtos.model.Produto;
import br.com.fiap.produtos.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping("/produtos")
    @ResponseStatus(HttpStatus.CREATED)
    public Produto create(@RequestBody Produto produto){
        return produtoService.create(produto);
    }

    @GetMapping("/produtos")
    @ResponseStatus(HttpStatus.OK)
    public List<Produto> findAll(){
        return produtoService.findAll();
    }

    @GetMapping("/produtos/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Produto search(@PathVariable Long id){
        return produtoService.search(id);
    }

    @DeleteMapping("/produtos/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        produtoService.delete(id);
    }

    @PutMapping("/produtos/{id}"  )
    @ResponseStatus(HttpStatus.OK)
    public Produto update(@RequestBody Produto produto){
        return produtoService.update(produto);
    }
}
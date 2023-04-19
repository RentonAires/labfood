package br.com.lagoinha.labfoods.controller;

import br.com.lagoinha.labfoods.entity.Categoria;
import br.com.lagoinha.labfoods.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;
    @GetMapping
    public List<Categoria> get(){
        return this.categoriaService.listarCategoria();
    }
    @PostMapping
    public Categoria post(@RequestBody Categoria categoria){
        return this.categoriaService.salvarCategoria(categoria);
    }
}

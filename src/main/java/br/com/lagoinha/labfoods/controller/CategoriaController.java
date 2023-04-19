package br.com.lagoinha.labfoods.controller;

import br.com.lagoinha.labfoods.entity.Categoria;
import br.com.lagoinha.labfoods.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

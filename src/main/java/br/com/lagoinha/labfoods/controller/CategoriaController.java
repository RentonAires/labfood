package br.com.lagoinha.labfoods.controller;

import br.com.lagoinha.labfoods.entity.Categoria;
import br.com.lagoinha.labfoods.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    //listar categoria
    @GetMapping
    public List<Categoria> get(){
        return this.categoriaService.listarCategoria();
    }
    //lista categoria por id
    @GetMapping("/{id}")
    public Categoria buscarPorId(@PathVariable Long id){
        return this.categoriaService.listarPorId(id);
    }
    //salvar categoria
    @PostMapping
    public ResponseEntity<?> post(@RequestBody Categoria categoria){
        try {
            categoria.setId(null);
            categoria = categoriaService.salvarCategoria(categoria);
            return ResponseEntity.ok(categoria);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.categoriaService.deletarCategoria(id);
    }
}

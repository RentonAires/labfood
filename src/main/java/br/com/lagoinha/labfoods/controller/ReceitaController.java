package br.com.lagoinha.labfoods.controller;

import br.com.lagoinha.labfoods.entity.Receita;
import br.com.lagoinha.labfoods.service.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/receita")
public class ReceitaController {
    @Autowired
    private ReceitaService receitaService;

    //listar receita
    @GetMapping
    public List<Receita> get(){
        return this.receitaService.listarReceita();
    }

    //salvar receita
    @PostMapping
    public Receita post(@RequestBody Receita receita){
        return this.receitaService.salvarReceita(receita);
    }

    //listar por por id
    @GetMapping("/{id}")
    public Receita getReceitaPorId(@PathVariable Long id){
        return this.receitaService.listarReceitaPorId(id);
    }

    //atualizando receita
    @PutMapping("/{id}")
    public Receita put(@PathVariable Long id, @RequestBody Receita receita){
        return this.receitaService.atualizarReceita(id, receita);
    }

    //deletar receita
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        this.receitaService.deletarReceitaPorId(id);
    }


}

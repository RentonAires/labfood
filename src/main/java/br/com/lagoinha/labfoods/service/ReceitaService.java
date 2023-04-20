package br.com.lagoinha.labfoods.service;

import br.com.lagoinha.labfoods.entity.Receita;
import br.com.lagoinha.labfoods.repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceitaService {
    @Autowired
    private ReceitaRepository receitaRepository;

    //listar receita
    public List<Receita> listarReceita(){
        return this.receitaRepository.findAll();
    }
    //salvar receita

    public Receita salvarReceita(Receita receita){
        return this.receitaRepository.save(receita);
    }
    //listar receita por id
    //editar receita
    //deletar receita



}

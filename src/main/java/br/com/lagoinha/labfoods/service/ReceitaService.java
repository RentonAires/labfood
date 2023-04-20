package br.com.lagoinha.labfoods.service;

import br.com.lagoinha.labfoods.entity.Receita;
import br.com.lagoinha.labfoods.repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Receita listarReceitaPorId(Long id){
        Optional<Receita> receitaPesquisada = this.receitaRepository.findById(id);
        if (receitaPesquisada.isPresent()){
            return receitaPesquisada.get();
        }else {
            return null;
        }
    }

    //editar receita
    //deletar receita



}

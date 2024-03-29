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
    public Receita salvarReceita(Receita receita) throws Exception{

        //verificando se nome da receita esta nulo ou vazio
        if(receita.getNome() == null || receita.getNome().isEmpty()){
            throw new Exception("Nome da receita é obrigatório");
        }

        //verificando se nome
        if (receitaRepository.existsByNome(receita.getNome())){
            throw new Exception("Receita já cadastrada!");
        }

        //verificando se ingrediente esta nulo ou vazio
        if(receita.getIngrediente() == null || receita.getIngrediente().isEmpty()){
            throw new Exception("O campo de intgrediente é obrigatório!");
        }
        if (!receitaRepository.existsById(receita.getId())){
            throw new Exception("Receita nao encontrada! ");
        }

        //salvando receita
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

    //editar receita por id
    public Receita atualizarReceita(Long id, Receita receitaAtualizada){

        Receita receitaPesquisada = listarReceitaPorId(id);
        if (receitaPesquisada != null){
            receitaPesquisada.setNome(receitaAtualizada.getNome());
            receitaPesquisada.setIngrediente(receitaAtualizada.getIngrediente());
            receitaPesquisada.setPreparo(receitaAtualizada.getPreparo());
            return this.receitaRepository.save(receitaPesquisada);
        }
        return null;
    }
    //deletar receita

    public void deletarReceitaPorId(Long id){
        Receita receitaPesquisada = listarReceitaPorId(id);
        if (receitaPesquisada != null){
            this.receitaRepository.deleteById(id);
        }
    }



}

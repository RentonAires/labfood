package br.com.lagoinha.labfoods.service;

import br.com.lagoinha.labfoods.entity.Categoria;
import br.com.lagoinha.labfoods.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    //listar categoria
    public List<Categoria> listarCategoria(){
        return this.categoriaRepository.findAll();

    }
    //salvar categoria
    public Categoria salvarCategoria(Categoria categoria){
        return this.categoriaRepository.save(categoria);
    }
    //listar categoria por id
    public Categoria listarPorId(Long id){
        Optional<Categoria> categoriaPesquisada = this.categoriaRepository.findById(id);
        if (categoriaPesquisada.isPresent()){
            return categoriaPesquisada.get();
        }else {
            return null;
        }
    }
    //atualizar categoria
    //deletar categoria

}

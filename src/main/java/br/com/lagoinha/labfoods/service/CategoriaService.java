package br.com.lagoinha.labfoods.service;

import br.com.lagoinha.labfoods.entity.Categoria;
import br.com.lagoinha.labfoods.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    //listar categoria
    public List<Categoria> listarCategoria(){
        return this.categoriaRepository.findAll();

    }
    //listar categoria por id
    //salvar categoria
    //atualizar categoria
    //deletar categoria

}

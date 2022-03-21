package br.com.DesafioDocket.services;

import br.com.DesafioDocket.entities.Cartorio;
import br.com.DesafioDocket.entities.Endereco;
import br.com.DesafioDocket.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository repository;


    public List<Endereco> findAll() {
        return repository.findAll();
    }


    public Endereco save(Endereco endereco) {
        return this.repository.save(endereco);
    }

}

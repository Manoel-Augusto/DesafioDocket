package br.com.DesafioDocket.services;

import br.com.DesafioDocket.entities.Cartorio;
import br.com.DesafioDocket.entities.Endereco;
import br.com.DesafioDocket.repositories.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {
    EnderecoRepository repository;

    public Endereco findById(Long id) {
        return repository.getById(id);
    }

}

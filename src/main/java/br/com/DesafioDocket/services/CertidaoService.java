package br.com.DesafioDocket.services;

import br.com.DesafioDocket.entities.Certidao;
import br.com.DesafioDocket.entities.Endereco;
import br.com.DesafioDocket.repositories.CertidaoRepository;
import br.com.DesafioDocket.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CertidaoService {
    @Autowired
    CertidaoRepository repository;

    public List<Certidao> findById(Long id) {
        return repository.findById(id).stream().collect(Collectors.toList());
    }

    public List<Certidao> findAll() {
        return repository.findAll();
    }

    public Certidao save(Certidao certidao) {
        return repository.save(certidao);
    }
}

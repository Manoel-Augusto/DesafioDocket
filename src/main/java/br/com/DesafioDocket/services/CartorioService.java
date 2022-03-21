package br.com.DesafioDocket.services;

import br.com.DesafioDocket.entities.Cartorio;
import br.com.DesafioDocket.entities.Certidao;
import br.com.DesafioDocket.entities.Endereco;
import br.com.DesafioDocket.repositories.CartorioRepository;
import br.com.DesafioDocket.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartorioService {
    @Autowired
    private CartorioRepository repository;

    public List<Cartorio> findAll() {
        List<Cartorio> cartorioList = this.repository.findAll();
        return cartorioList;
    }


    public Cartorio save(Cartorio cartorio) {
        return this.repository.save(cartorio);
    }

    public Cartorio findById(Long id) {
        return this.repository.findById(id).get();
    }

    public void delete(Long id) {
        this.repository.deleteById(id);
    }
}

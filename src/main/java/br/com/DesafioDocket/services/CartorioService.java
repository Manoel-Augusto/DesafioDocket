package br.com.DesafioDocket.services;

import br.com.DesafioDocket.entities.Cartorio;
import br.com.DesafioDocket.entities.Certidao;
import br.com.DesafioDocket.repositories.CartorioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartorioService {
    @Autowired
    private CartorioRepository repository;

    @Autowired
    private EnderecoService enderecoService;

    @Autowired
    private CertidaoService certidaoService;

    public List<Cartorio> findAll()
    {
        List<Cartorio>cartorioList=repository.findAll();
       // List <Certidao> certidaoList = new ArrayList<>();
       // cartorioList.forEach(i-> i.getCertidaoSet().forEach(j-> certidaoList.add(j)));
        //System.out.println(certidaoList);
      //  System.out.println(cartorioList);
        return cartorioList;
    }

    public void save (Cartorio cartorio){
        this.repository.save(cartorio);
    }
    public List<Cartorio> list(){
        return repository.findAll();
    }

    public Cartorio findById(Long id) {
        return this.repository.findById(id).get();
    }

    public void delete(Long id) {
        this.repository.deleteById(id);
    }
}

package br.com.DesafioDocket.repositories;

import br.com.DesafioDocket.entities.Cartorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartorioRepository extends JpaRepository<Cartorio,Long> {

}

package br.com.DesafioDocket.repositories;

import br.com.DesafioDocket.entities.Certidao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CertidaoRepository extends JpaRepository<Certidao,Long> {
}

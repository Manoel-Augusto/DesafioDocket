package br.com.DesafioDocket.repositories;

import br.com.DesafioDocket.entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EnderecoRepository extends JpaRepository<Endereco,Long> {
}

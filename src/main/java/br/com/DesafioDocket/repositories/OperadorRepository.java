package br.com.DesafioDocket.repositories;

import br.com.DesafioDocket.entities.Operador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface OperadorRepository extends JpaRepository<Operador,Long> {
}

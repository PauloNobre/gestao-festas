package ufc.quixada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ufc.quixada.model.Convidado;

@Repository
public interface ConvidadoRepository extends JpaRepository<Convidado, Integer>{
}

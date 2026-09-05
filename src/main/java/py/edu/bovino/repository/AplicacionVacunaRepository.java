package py.edu.bovino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import py.edu.bovino.entity.AplicacionVacuna;

@Repository
public interface AplicacionVacunaRepository extends JpaRepository<AplicacionVacuna, Long> {

}

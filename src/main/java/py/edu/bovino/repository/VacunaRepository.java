package py.edu.bovino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import py.edu.bovino.entity.Vacuna;

@Repository
public interface VacunaRepository extends JpaRepository<Vacuna, Long> {

}

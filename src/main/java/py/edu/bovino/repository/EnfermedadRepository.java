package py.edu.bovino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import py.edu.bovino.entity.Enfermedad;

@Repository
public interface EnfermedadRepository extends JpaRepository<Enfermedad, Long> {

}

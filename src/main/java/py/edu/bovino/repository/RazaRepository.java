package py.edu.bovino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import py.edu.bovino.entity.Raza;

@Repository
public interface RazaRepository extends JpaRepository<Raza, Long> {

}

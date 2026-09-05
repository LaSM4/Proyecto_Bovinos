package py.edu.bovino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import py.edu.bovino.entity.Tercero;

@Repository
public interface TerceroRepository extends JpaRepository<Tercero, Long> {

}

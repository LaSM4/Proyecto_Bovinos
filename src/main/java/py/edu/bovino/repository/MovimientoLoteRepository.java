package py.edu.bovino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import py.edu.bovino.entity.MovimientoLote;

@Repository
public interface MovimientoLoteRepository extends JpaRepository<MovimientoLote, Long> {

}

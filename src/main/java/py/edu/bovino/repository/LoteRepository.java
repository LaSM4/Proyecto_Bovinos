package py.edu.bovino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import py.edu.bovino.entity.Lote;

@Repository
public interface LoteRepository extends JpaRepository<Lote, Long> {

}

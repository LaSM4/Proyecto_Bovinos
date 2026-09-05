package py.edu.bovino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import py.edu.bovino.entity.TipoLote;

@Repository
public interface TipoLoteRepository extends JpaRepository<TipoLote, Long> {

}
package py.edu.bovino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import py.edu.bovino.entity.Compra;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long> {

}

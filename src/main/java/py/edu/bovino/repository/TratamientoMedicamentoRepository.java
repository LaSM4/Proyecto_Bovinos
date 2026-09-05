package py.edu.bovino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import py.edu.bovino.entity.TratamientoMedicamento;

@Repository
public interface TratamientoMedicamentoRepository extends JpaRepository<TratamientoMedicamento, Long> {

}

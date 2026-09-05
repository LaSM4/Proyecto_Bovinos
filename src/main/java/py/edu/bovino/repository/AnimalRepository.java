package py.edu.bovino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import py.edu.bovino.entity.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {

}

package pe.edu.upc.demo3159api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demo3159api.entities.Version;
@Repository
public interface IVersionRepository extends JpaRepository<Version, Integer> {
}

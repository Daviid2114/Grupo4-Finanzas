package pe.edu.upc.demo3159api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.demo3159api.entities.App;

import java.util.List;

@Repository
public interface IAppRepository extends JpaRepository<App, Integer> {

    @Query("Select a from App a where  a.nameApp like %:nombre%")
    public List<App> buscarNombre(@Param("nombre") String nombre);
}

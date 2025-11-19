package pe.edu.upc.demo3159api.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demo3159api.entities.App;
import pe.edu.upc.demo3159api.repositories.IAppRepository;
import pe.edu.upc.demo3159api.servicesinterfaces.IAppService;

import java.util.List;

@Service
public class AppServiceImplement implements IAppService {

    @Autowired
    private IAppRepository aR;

    @Override
    public List<App> list() {
        return aR.findAll();
    }

    @Override
    public void insert(App a) {
        aR.save(a);
    }

    @Override
    public App listId(int idApp) {
        return aR.findById(idApp).orElse(new App());
    }

    @Override
    public void update(App a) {
        aR.save(a);
    }

    @Override
    public void delete(int idApp) {
        aR.deleteById(idApp);
    }

    @Override
    public List<App> buscarPorNombre(String nombre) {
      return aR.buscarNombre(nombre);
    }
}

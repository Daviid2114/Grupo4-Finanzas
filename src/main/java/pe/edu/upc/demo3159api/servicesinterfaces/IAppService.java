package pe.edu.upc.demo3159api.servicesinterfaces;

import pe.edu.upc.demo3159api.entities.App;

import java.util.List;

public interface IAppService {
    public List<App> list();

    public void insert(App a);

    public App listId(int idApp);
    public void update(App a);
    public void delete(int idApp);
    public List<App> buscarPorNombre(String nombre);

}

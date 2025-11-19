package pe.edu.upc.demo3159api.servicesinterfaces;

import pe.edu.upc.demo3159api.entities.Version;

import java.util.List;

public interface IVersionService {

    public List<Version> list();
    public void insert(Version v);
    public Version listId(int idVersion);
    public void update(Version v);
    public void delete(int idVersion);
}

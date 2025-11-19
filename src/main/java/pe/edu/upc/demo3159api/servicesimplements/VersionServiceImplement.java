package pe.edu.upc.demo3159api.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.demo3159api.entities.Version;
import pe.edu.upc.demo3159api.repositories.IVersionRepository;
import pe.edu.upc.demo3159api.servicesinterfaces.IVersionService;

import java.util.List;

@Service
public class VersionServiceImplement implements IVersionService {

    @Autowired
    private IVersionRepository vR;

    @Override
    public List<Version> list() {
        return vR.findAll();
    }

    @Override
    public void insert(Version v) {
        vR.save(v);
    }

    @Override
    public Version listId(int idVersion) {
        return vR.findById(idVersion).orElse(new Version());
    }

    @Override
    public void update(Version v) {
        vR.save(v);
    }

    @Override
    public void delete(int idVersion) {
        vR.deleteById(idVersion);
    }
}

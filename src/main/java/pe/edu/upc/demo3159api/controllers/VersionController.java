package pe.edu.upc.demo3159api.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demo3159api.dtos.VersionDTO;
import pe.edu.upc.demo3159api.entities.Version;
import pe.edu.upc.demo3159api.servicesinterfaces.IVersionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/versiones")
public class VersionController {
    @Autowired
    private IVersionService vS;
    @GetMapping
    public List<VersionDTO> listar(){
        return vS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, VersionDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody VersionDTO vDto){
        ModelMapper modelMapper = new ModelMapper();
        Version v= modelMapper.map(vDto, Version.class);
        vS.insert(v);
    }
    @GetMapping("/{idApp}")
    public VersionDTO listarId(@PathVariable("idApp") int idVersion) {
        ModelMapper m = new ModelMapper();
        VersionDTO dto = m.map(vS.listId(idVersion), VersionDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody VersionDTO aVersion) {
        ModelMapper m = new ModelMapper();
        Version v = m.map(aVersion, Version.class);
        vS.update(v);
    }
    @DeleteMapping("/{idVersion}")
    public void eliminar(@PathVariable("idVersion") int idVersion) {
        vS.delete(idVersion);
    }

}

package pe.edu.upc.demo3159api.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.demo3159api.dtos.AppDTO;
import pe.edu.upc.demo3159api.entities.App;
import pe.edu.upc.demo3159api.servicesinterfaces.IAppService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/aplicaciones")
public class AppController {
    @Autowired
    private IAppService aS;

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<AppDTO> listar() {
        return aS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AppDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void registrar(@RequestBody AppDTO aDTO) {
        ModelMapper m = new ModelMapper();
        App a = m.map(aDTO, App.class);
        aS.insert(a);
    }
    @GetMapping("/{idApp}")
    public AppDTO listarId(@PathVariable("idApp") int idApp) {
        ModelMapper m = new ModelMapper();
        AppDTO dto = m.map(aS.listId(idApp), AppDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody AppDTO aDTO) {
        ModelMapper m = new ModelMapper();
        App a = m.map(aDTO, App.class);
        aS.update(a);
    }
    @DeleteMapping("/{idApp}")
    public void eliminar(@PathVariable("idApp") int idApp) {
        aS.delete(idApp);
    }



    @GetMapping("/busquedas")
    @PreAuthorize("hasAnyAuthority('OPE', 'ADMIN')")
    public List<AppDTO> buscar(@RequestParam String n) {
        return aS.buscarPorNombre(n).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AppDTO.class);
        }).collect(Collectors.toList());
    }

}

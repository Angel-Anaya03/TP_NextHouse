package com.upc.tp_nexthouse.Controller;

import com.upc.tp_nexthouse.DTO.ReservaAlquilerDTO;
import com.upc.tp_nexthouse.DTO.RolDTO;
import com.upc.tp_nexthouse.DTO.UbicacionDTO;
import com.upc.tp_nexthouse.DTO.UsuarioDTO;
import com.upc.tp_nexthouse.Entities.ReservaAlquiler;
import com.upc.tp_nexthouse.Entities.Rol;
import com.upc.tp_nexthouse.Entities.Ubicacion;
import com.upc.tp_nexthouse.serviceInterface.ReservaAlquilerService;
import com.upc.tp_nexthouse.serviceInterface.RolService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
@CrossOrigin(origins = {"http://localhost:4200","http://http://3.144.130.45/"})
@RestController
@RequestMapping("/NextHouse")
public class RolController {
    @Autowired
    private RolService rolService;
    @PostMapping("/Rol")
    public RolDTO insertar(@RequestBody RolDTO rolDTO){
        ModelMapper modelMapper= new ModelMapper();
        Rol rol= modelMapper.map(rolDTO, Rol.class);
        rol= rolService.savedRol(rol);
        return modelMapper.map(rol, RolDTO.class);
    }
    @GetMapping("/Listar_Rol")
    public List<RolDTO> list(){
        return rolService.list().stream().map(y -> {
            ModelMapper modelMapper= new ModelMapper();
            return  modelMapper.map(y, RolDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping("/Modificar_Rol")
    public RolDTO modificarRol(@RequestBody RolDTO rolDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Rol rol = modelMapper.map(rolDTO, Rol.class);
        rol = rolService.modificarRol(rol);
        return modelMapper.map(rol, RolDTO.class);
    }

    @DeleteMapping("/Eliminar_Rol")
    public void eliminarRol(@RequestBody RolDTO rolDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Rol rol = modelMapper.map(rolDTO, Rol.class);
        rolService.eliminarRol(rol.getIdRol());
    }


}

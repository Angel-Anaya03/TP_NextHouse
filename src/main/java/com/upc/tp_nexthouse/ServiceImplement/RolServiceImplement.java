package com.upc.tp_nexthouse.ServiceImplement;

import com.upc.tp_nexthouse.Entities.Rol;
import com.upc.tp_nexthouse.Entities.Ubicacion;
import com.upc.tp_nexthouse.repositoy.RolRepository;
import com.upc.tp_nexthouse.serviceInterface.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RolServiceImplement implements RolService {
    @Autowired
    private RolRepository rolRepository;
    @Transactional
    @Override
    public Rol savedRol(Rol rol) {
        return rolRepository.save(rol);
    }

    @Override
    public void eliminarRol(Long id) {
        if(rolRepository.existsById(id)) {
            rolRepository.deleteById(id);
        }
    }

    @Override
    public Rol modificarRol(Rol rol) {
        if(rolRepository.existsById(rol.getIdRol())){
            return rolRepository.save(rol);
        }
        return null;
    }

    @Override
    public List<Rol> list() {
        return rolRepository.findAll();
    }
}

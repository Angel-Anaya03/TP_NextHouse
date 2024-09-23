package com.upc.tp_nexthouse.serviceInterface;



import com.upc.tp_nexthouse.Entities.Rol;
import com.upc.tp_nexthouse.Entities.Ubicacion;

import java.util.List;

public interface RolService {
    public Rol savedRol(Rol rol);
    public void eliminarRol(Long  id);
    public Rol modificarRol(Rol rol);
    public List<Rol> list();
}

package com.upc.tp_nexthouse.repositoy;

import com.upc.tp_nexthouse.DTO.Query2DTO;
import com.upc.tp_nexthouse.DTO.Query4DTO;
import com.upc.tp_nexthouse.Entities.Propiedad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PropiedadRepository extends JpaRepository<Propiedad,Long> {
    @Query(" select new com.upc.tp_nexthouse.DTO.Query2DTO(u.nombreCompleto, p.titulo) " +
            " from Propiedad p join p.usuario u " +
            " where p.tipo = 'Casa' and p.estado = 'Disponible' and u.rol.tipoUsuario = 'Arrendatario' " +
            " group by u.nombreCompleto, p.titulo")
    List<Query2DTO> query2();


    @Query("SELECT new com.upc.tp_nexthouse.DTO.Query4DTO(u.ciudad, p.precio) " +
            "FROM Propiedad p JOIN p.ubicacion u " +
            "WHERE p.usuario.rol.tipoUsuario = 'Arrendador'  and  p.estado = 'Alquiler'" +
            "GROUP BY u.ciudad, p.precio")
    List<Query4DTO> query4();


}

package com.upc.tp_nexthouse.DTO;

import com.upc.tp_nexthouse.Entities.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RolDTO {
    private Long idRol;
    private String tipoUsuario;
}

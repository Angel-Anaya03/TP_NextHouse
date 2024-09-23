package com.upc.tp_nexthouse.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    private String nombreCompleto;
    private String DNI;
    private String email;
    private String telefono;
    private String contrasena;
    @ManyToOne
    @JoinColumn(name = "Rol_id_rol")
    private Rol rol;


}

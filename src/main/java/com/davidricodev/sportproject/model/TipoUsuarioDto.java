package com.davidricodev.sportproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity(name = "tipoUsuario")
@Data
@Table(name = "TIPO_USUARIO")
public class TipoUsuarioDto {

  @Column(name = "Nombre", nullable = false, length = 100)
  private String nombre;

  // ----------------------- VER SI ESTA BIEN Y EXPLICAR -------------------------------------
  @OneToOne(mappedBy = "nombre")
  private UsuarioDto usuario;
}

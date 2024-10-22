package com.davidricodev.sportproject.model;

import com.davidricodev.sportproject.enums.GeneroEnum;
import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Data;

@Entity(name = "usuario")
@Data
@Table(name = "USUARIOS")
public class UsuarioDto {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "Id")
  private Long id;

  // ----------------------- VER SI ESTA BIEN Y EXPLICAR -------------------------------------
  @OneToOne
  @JoinColumn(name = "nombre_tipoUsuario")
  @Column(name = "Tipo Usuario", nullable = false)
  private TipoUsuarioDto tipoUsuario;

  @Column(name = "Email", nullable = false, unique = true, length = 225)
  private String email;

  @Column(name = "Dni", nullable = false, unique = true, length = 9)
  private String dni;

  // ---------------------- PREGUNTAR SI ESTA BIEN ------------------------------
  @Column(name = "Genero", nullable = false)
  @Enumerated(EnumType.STRING)
  private GeneroEnum genero;

  @Column(name = "Nombre", nullable = false, length = 250)
  private String nombre;

  @Column(name = "Apellido", nullable = false, length = 250)
  private String apellido;

  @Column(name = "Fecha nacimiento", nullable = false)
  private LocalDate fechaNacimiento;

  @Column(name = "Telefono", nullable = false, unique = true, length = 9)
  private int telefono;

  @Column(name = "Provincia", nullable = false, length = 50)
  private String provincia;

  @Column(name = "Municipio", nullable = false, length = 50)
  private String municipio;

  @Column(name = "Direccion", nullable = false, length = 100)
  private String direccion;

  @Column(name = "Codigo postal", nullable = false, length = 5)
  private int codigoPostal;

  @Column(name = "Password", nullable = false, length = 250)
  private String password;

  /*
  @OneToOne(mappedBy = "id")
  private VentaDto venta;*/

}

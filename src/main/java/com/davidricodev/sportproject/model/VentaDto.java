package com.davidricodev.sportproject.model;

import jakarta.persistence.*;
import java.sql.Timestamp;
import lombok.Data;

@Entity(name = "venta")
@Table(name = "VENTAS")
@Data
public class VentaDto {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "Id")
  private Long id;

  @OneToOne
  @JoinColumn(name = "id_usuario")
  @Column(name = "Id usuario", nullable = false)
  private UsuarioDto idUsuario;

  @Column(name = "Total productos", nullable = false, length = 3)
  private int totalProducto;

  @Column(name = "Precio total", nullable = false)
  private float precioTotal;

  @Column(name = "Fecha", nullable = false)
  private Timestamp fecha;

  /*
  @OneToMany(mappedBy = "venta")
  private List<ProductoDto> productos;
  */

}

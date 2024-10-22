package com.davidricodev.sportproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity(name = "ventaProducto")
@Table(name = "VENTAS_PRODUCTOS")
@Data
public class VentaProductoDto {

  @Column(name = "Id venta", nullable = false)
  private Long idVenta;

  @Column(name = "Id producto", nullable = false)
  private Long idProducto;
}

package com.davidricodev.sportproject.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "producto")
@Data
@Table(name = "PRODUCTOS")
public class ProductoDto {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "Id")
  private Long id;

  @Column(name = "Nombre", nullable = false, length = 225)
  private String nombre;

  @OneToOne
  @JoinColumn(name = "id_marca")
  @Column(name = "Marca", nullable = false)
  private MarcaDto marca;

  @OneToOne
  @JoinColumn(name = "id_categoria")
  @Column(name = "Categoria", nullable = false)
  private CategoriaDto categoria;

  /*
  @ManyToOne
  @JoinColumn(name = "id_venta")
  private VentaDto venta;
  */
  @Column(name = "Imagen")
  private String imagen;

  @Column(name = "Precio", nullable = false)
  private float precio;

  @Column(name = "Stock", nullable = false)
  private int stock;
}

package com.davidricodev.sportproject.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "categoria")
@Data
@Table(name = "CATEGORIAS")
public class CategoriaDto {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "Id")
  private Long id;

  @Column(name = "Nombre", nullable = false, length = 100)
  private String nombre;
}

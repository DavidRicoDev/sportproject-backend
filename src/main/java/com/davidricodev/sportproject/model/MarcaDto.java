package com.davidricodev.sportproject.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "marca")
@Data
@Table(name = "MARCAS")
public class MarcaDto {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "Id")
  private Long id;

  @Column(name = "Nombre", nullable = false, unique = true, length = 100)
  private String nombre;

  @Column(name = "Email", nullable = false, unique = true, length = 225)
  private String email;
}

package com.davidricodev.sportproject.model;

import jakarta.persistence.Entity;

@Entity(name = "carrito")
public class CarritoDto {

  private String producto;

  private int totalProducto;

  private float precioTotal;

  // CONSTRUCTOR
  public CarritoDto(String producto, int totalProducto, float precioTotal) {
    this.producto = producto;
    this.totalProducto = totalProducto;
    this.precioTotal = precioTotal;
  }
}

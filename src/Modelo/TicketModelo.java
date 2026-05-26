/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDateTime;
/**
 *
 * @author yorch
 */
public class TicketModelo {
   int Id;
      int Partido_id;
      LocalDateTime Fecha_partido;
      String Numero_asiento;
      String Seccion;
      double Precio;
      String Estado;

    public TicketModelo(int Id, int Partido_id, LocalDateTime Fecha_partido, String Numero_asiento, String Seccion, double Precio, String Estado) {
        this.Id = Id;
        this.Partido_id = Partido_id;
        this.Fecha_partido = Fecha_partido;
        this.Numero_asiento = Numero_asiento;
        this.Seccion = Seccion;
        this.Precio = Precio;
        this.Estado = Estado;
    }
     
      public TicketModelo() {
    }
 
    public TicketModelo(int Partido_id, String Numero_asiento, String Seccion, double Precio, String Estado) {
        this.Partido_id = Partido_id;
        this.Numero_asiento = Numero_asiento;
        this.Seccion = Seccion;
        this.Precio = Precio;
        this.Estado = Estado;
    }

  

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getPartido_id() {
        return Partido_id;
    }

    public void setPartido_id(int Partido_id) {
        this.Partido_id = Partido_id;
    }

    public LocalDateTime getFecha_partido() {
        return Fecha_partido;
    }

    public void setFecha_partido(LocalDateTime Fecha_partido) {
        this.Fecha_partido = Fecha_partido;
    }

    public String getNumero_asiento() {
        return Numero_asiento;
    }

    public void setNumero_asiento(String Numero_asiento) {
        this.Numero_asiento = Numero_asiento;
    }

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String Seccion) {
        this.Seccion = Seccion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }    
}

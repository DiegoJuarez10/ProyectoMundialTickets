/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

public class PartidoModelo {
   
    int id;
    String equipo_local;
    String equipo_visitante;
    LocalDate fecha;
    String hora;
    String fase;
    String estadio;
    String ciudad;
    int capacidad;
    String estado;

    public PartidoModelo() {
    }

    public PartidoModelo(int id, String equipo_local, String equipo_visitante, LocalDate fecha, String hora, String fase, String estadio, String ciudad, int capacidad, String estado) {
        this.id = id;
        this.equipo_local = equipo_local;
        this.equipo_visitante = equipo_visitante;
        this.fecha = fecha;
        this.hora = hora;
        this.fase = fase;
        this.estadio = estadio;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public PartidoModelo(String equipo_local, String equipo_visitante, LocalDate fecha, String hora, String fase, String estadio, String ciudad, int capacidad) {
        this.equipo_local = equipo_local;
        this.equipo_visitante = equipo_visitante;
        this.fecha = fecha;
        this.hora = hora;
        this.fase = fase;
        this.estadio = estadio;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEquipo_local() {
        return equipo_local;
    }

    public void setEquipo_local(String equipo_local) {
        this.equipo_local = equipo_local;
    }

    public String getEquipo_visitante() {
        return equipo_visitante;
    }

    public void setEquipo_visitante(String equipo_visitante) {
        this.equipo_visitante = equipo_visitante;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }


    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }
    
    
    
    
}
 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.PartidoDao;
import Modelo.PartidoModelo;
import java.util.List;
 import java.time.LocalDate;

/**
 *
 * @author DIEGO JUAREZ
 */
public class PartidoControlador {
     private final PartidoDao dao = new PartidoDao();
public List <PartidoModelo> obtenerPartido(){
    return dao.obtenerTodos();
}
public void crearPartido(String equipo_local, String equipo_visitante, LocalDate fecha, String hora, String fase, String estadio, String ciudad, int capacidad){
    PartidoModelo partido = new PartidoModelo(equipo_local, equipo_visitante, fecha, hora, fase, estadio, ciudad, capacidad);
   dao.guardar(partido);
}
public void modificarPartido(int id, String equipo_local, String equipo_visitante, LocalDate fecha, String hora, String fase, String estadio, String ciudad, int capacidad){
    PartidoModelo partido = new PartidoModelo(id, equipo_local, equipo_visitante, fecha, hora, fase, estadio, ciudad, capacidad, "DISPONIBLE");
    dao.actualizar(partido);
}
public void cambiarPartido(int id, String estado){
    dao.cambiarEstado(id, estado);
}    
public List<PartidoModelo> buscarPorSeleccion(String seleccion) {
        return dao.buscarPorSeleccion(seleccion);
    }
public PartidoModelo buscarPorId(int id){
    return dao.buscarPorId(id);
}

}

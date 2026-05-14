
package Controlador;

import DAO.PartidoDao;
import Modelo.PartidoModelo;
import java.util.List;
import java.time.LocalDateTime;

public class PartidoControlador { 
    
     private final PartidoDao dao = new PartidoDao(); 
     
public List <PartidoModelo> obtenerPartido(){
    return dao.obtenerTodos();
}
public void crearPartido(String equipo_local, String equipo_visitante, String estadio, String ciudad, int capacidad){
    PartidoModelo partido = new PartidoModelo(equipo_local, equipo_visitante, estadio, ciudad, capacidad);
   dao.guardar(partido);
}
public void modificarCliente(int id,String equipo_local, String equipo_visitante, LocalDateTime fecha, String estadio, String ciudad, int capacidad, boolean estado ){
    PartidoModelo partido = new PartidoModelo(id, equipo_local, equipo_visitante, fecha, estadio, ciudad, capacidad, estado);
    dao.actualizar(partido);
}
public void eliminarCliente(int id){
    dao.eliminar(id);
}
}

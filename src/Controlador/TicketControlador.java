
package Controlador; 
import Modelo.TicketModelo;
import Modelo.TicketPartidoDTO;
import Dao.TicketDao;
import java.time.LocalDateTime;
import java.util.List;
      
public class TicketControlador {
      private TicketDao tc = new TicketDao();
    
  public boolean crearTicket(int partido_id, String numero_asiento, String seccion,
                           double precio, String estado, LocalDateTime fecha_partido) {
    TicketModelo tic = new TicketModelo(partido_id, numero_asiento, seccion, precio, estado);
    tic.setFecha_partido(fecha_partido);  
    return tc.insertar(tic);
}

   
     
    public boolean actualizarTicket(int Id, int Partido_id, LocalDateTime Fecha_partido, String Numero_asiento, String Seccion, double Precio, String Estado){
    TicketModelo tic = new TicketModelo (Id, Partido_id, Fecha_partido, Numero_asiento, Seccion, Precio, Estado);
    return tc.actualizar(tic);
}
    
public boolean cambiarEstado(int id, String estado){
    return tc.cambiarEstado(estado, id);
}

            public boolean eliminar(int id){
    return tc.eliminar(id);
}
    public List<TicketModelo>listar(){
    return tc.listar();
}

    public List<TicketPartidoDTO> obtenerTicketsConPartido() {
    return tc.obtenerTicketsconPartido();
}

    public Iterable<TicketPartidoDTO> buscarPorSeleccion(String seleccion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

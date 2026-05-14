
package Controlador; 
import Modelo.TicketModelo;
import Dao.TicketDao;
import java.time.LocalDateTime;
import java.util.List;
      
public class TicketControlador {
      private TicketDao tc = new TicketDao();
    
    public boolean crearTicket(int Partido_id, String Numero_asiento, String Seccion, double Precio, String Estado){
        TicketModelo tic = new TicketModelo(Partido_id, Numero_asiento, Seccion, Precio, Estado);
        return tc.insertar(tic);
    }
     
    public boolean actualizarTicket(int Id, int Partido_id, LocalDateTime Fecha_partido, String Numero_asiento, String Seccion, double Precio, String Estado){
    TicketModelo tic = new TicketModelo (Id, Partido_id, Fecha_partido, Numero_asiento, Seccion, Precio, Estado);
    return tc.actualizar(tic);
}
    
public boolean cambiarEstado(int id, String estado){
    return tc.cambiarEstado(estado, id);
}

            
    public List<TicketModelo>listar(){
    return tc.listar();
}

    
}

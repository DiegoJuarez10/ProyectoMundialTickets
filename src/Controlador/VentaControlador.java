    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.VentaModelo;
import Dao.VentaDao;
import Modelo.TicketModelo;
import java.time.LocalDateTime;
import java.util.List;
/**
 *
 * @author yorch
 */
public class VentaControlador{
    private VentaDao vn;

  
       
     public boolean crearVenta(int Cliente_id, int Cantidad, int Usuario_id, TicketModelo tic){
      VentaModelo v= new VentaModelo(Cliente_id,Cantidad, Usuario_id, 0);
      double total = v.total(tic);   
      total += v.totalIVA(tic);   

    if (Cantidad >= 5 && Cantidad < 10) {
        total -= v.totalDescuento5(tic);
    } else if (Cantidad >= 10) {
        total -= v.totalDescuento10(tic);
    }

    v.setTotal(total);   
          return vn.insertar(v);
     }
    
       
    public boolean actualizarVenta(int Id, LocalDateTime Fecha, int Cliente_id, int Cantidad, int Usuario_id, double Total){
    VentaModelo v = new VentaModelo (Id,Fecha,Cliente_id,Cantidad,Usuario_id,Total);
    return vn.actualizar(v);
}
     
       
    public List<VentaModelo>listar(){
    return vn.listar();
}
  
}

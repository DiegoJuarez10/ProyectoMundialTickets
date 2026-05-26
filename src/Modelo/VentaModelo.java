package Modelo;
import java.time.LocalDateTime;
 
public class VentaModelo {
    int Id;
    LocalDateTime Fecha;
    int Cliente_id;
    int Cantidad;
    int Usuario_id;
    double Total;    
 
    public VentaModelo(int Id, LocalDateTime Fecha, int Cliente_id, int Cantidad, int Usuario_id, double Total) {
        this.Id = Id;   
        this.Fecha = Fecha;
        this.Cliente_id = Cliente_id;
        this.Cantidad = Cantidad;
        this.Usuario_id = Usuario_id;
        this.Total = Total;
    }
 
    public VentaModelo() {
    }
    
    public VentaModelo(int Cliente_id, int Cantidad, int Usuario_id, double Total) {
        this.Cliente_id = Cliente_id;
        this.Cantidad = Cantidad;
        this.Usuario_id = Usuario_id;
        this.Total = Total;
    }
    
    public int getId() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public LocalDateTime getFecha() {
        return Fecha;
    }
    public void setFecha(LocalDateTime Fecha) {
        this.Fecha = Fecha;
    }
    public int getCliente_id() {
        return Cliente_id;
    }
    public void setCliente_id(int Cliente_id) {
        this.Cliente_id = Cliente_id;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    public int getUsuario_id() {
        return Usuario_id;
    }
    public void setUsuario_id(int Usuario_id) {
        this.Usuario_id = Usuario_id;
    }
    public double getTotal() {
        return Total;
    }
    public void setTotal(double Total) {
        this.Total = Total;
    }
    
    public double total(TicketModelo tic) {
        double total = Cantidad * tic.getPrecio();
        return total;
    }
    
    public double totalIVA(TicketModelo tic) {
        double total = Cantidad * tic.getPrecio();
        return total * 0.12;
    }
    
    public double totalDescuento5(TicketModelo tic) {
        if (Cantidad >= 5) {
            double total = Cantidad * tic.getPrecio();
            return total * 0.05;
        }
        return 0;
    }
    
    public double totalDescuento10(TicketModelo tic) {
        if (Cantidad >= 10) {
            double total = Cantidad * tic.getPrecio();
            return total * 0.07;
        }
        return 0;
    }
    
    public double calcularDescuento(double subtotal, int cantidadTickets) {
        if (cantidadTickets >= 10) {
            return subtotal * 0.07;
        } else if (cantidadTickets >= 5) {
            return subtotal * 0.05;
        }
        return 0;
    }

    public double calcularIVA(double subtotal) {
        return subtotal * 0.12;
    }

    public double calcularTotal(double subtotal, double descuento, double iva) {
        return subtotal - descuento + iva;
    }
}
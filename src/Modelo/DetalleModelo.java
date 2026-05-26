package Modelo;

public class DetalleModelo {

    private int id;
    private int venta_id;
    private int ticket_id;
    private int cantidad;
    private double precio;
    private double iva;

    public DetalleModelo() {
    }

    public DetalleModelo(int venta_id, int ticket_id,
            int cantidad, double precio) {

        this.venta_id = venta_id;
        this.ticket_id = ticket_id;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVenta_id() {
        return venta_id;
    }

    public void setVenta_id(int venta_id) {
        this.venta_id = venta_id;
    }

    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    
    
    
    // Metodos 
    public double subtotal(){
        return cantidad * precio;
    }

    public double calcularIVA(){
        return subtotal() * 0.12;
    }

    public double calcularDescuento(){
        if(cantidad >= 10){
            return subtotal() * 0.07;
        }else if(cantidad >= 5){
            return subtotal() * 0.05;
        }
        return 0;
    }

    public double calcularTotal(){
        return subtotal() + calcularIVA() - calcularDescuento();

    }

}
package Modelo;

import java.time.LocalDate;

public class TicketPartidoDTO {

    private int ticketId;
    private String numeroAsiento;
    private String seccion;
    private double precio;
    private String estado;

    private int partidoId;
    private String equipoLocal;
    private String equipoVisitante;

    private LocalDate fecha;
    private String hora;
    private String fase;
    private String estadio;

    public TicketPartidoDTO(int ticketId,
                            String numeroAsiento,
                            String seccion,
                            double precio,
                            String estado,
                            int partidoId,
                            String equipoLocal,
                            String equipoVisitante,
                            LocalDate fecha,
                            String hora,
                            String fase,
                            String estadio) {

        this.ticketId = ticketId;
        this.numeroAsiento = numeroAsiento;
        this.seccion = seccion;
        this.precio = precio;
        this.estado = estado;
        this.partidoId = partidoId;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.fecha = fecha;
        this.hora = hora;
        this.fase = fase;
        this.estadio = estadio;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPartidoId() {
        return partidoId;
    }

    public void setPartidoId(int partidoId) {
        this.partidoId = partidoId;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }
}
package Controlador;

import Dao.DetalleDao;
import Modelo.DetalleModelo;

public class DetalleControlador {

    DetalleDao dao = new DetalleDao();

    public boolean guardarDetalle(DetalleModelo detalle){
        double subtotal = detalle.subtotal();
        double iva = detalle.calcularIVA();
        double descuento = detalle.calcularDescuento();
        double total = detalle.calcularTotal();
        detalle.setIva(iva);
        detalle.setPrecio(total);
        return dao.insertar(detalle);

    }

}
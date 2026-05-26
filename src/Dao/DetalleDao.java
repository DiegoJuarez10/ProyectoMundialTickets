package Dao;

import Modelo.DetalleModelo;
import Conexion.CreateConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DetalleDao {

    String qry = "";

    CreateConnection conFactory = new CreateConnection();

    public boolean insertar(DetalleModelo detalle){
        qry = "INSERT INTO public.detalle_venta "
                + "(venta_id, ticket_id, precio, iva) "
                + "VALUES(?,?,?,?)";
        try{

            Connection con = conFactory.getConnection();
            PreparedStatement ps = con.prepareStatement(qry);
            ps.setInt(1, detalle.getVenta_id());
            ps.setInt(2, detalle.getTicket_id());
            ps.setDouble(3, detalle.calcularTotal());
            ps.setDouble(4, detalle.calcularIVA());
            ps.executeUpdate();
            ps.close();
            
            return true;

        }catch(SQLException e){

            e.printStackTrace();

            return false;
        }
    }
}
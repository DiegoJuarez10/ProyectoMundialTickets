/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import conexion.CreateConnection;
import Modelo.TicketModelo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Timestamp;
import java.time.LocalDateTime;
  
/**
 *
 * @author yorch
 */
public class TicketDao {
    String qry="";
    CreateConnection cn= new CreateConnection();
  //Metodo para insertar
    public boolean insertar(TicketModelo tic){
        qry="insert into public.ticket (Partido_id, Numero_asiento, Seccion, Precio, Estado)"+
                "Values(?,?,?,?,?)";
        try{
            Connection con=cn.getConnection();
            PreparedStatement ps =con.prepareStatement(qry);
            
            ps.setInt(1, tic.getPartido_id());
            ps.setString(2, tic.getNumero_asiento());
            ps.setString(3, tic.getSeccion());
            ps.setDouble(4, tic.getPrecio());
            ps.setString(5, tic.getEstado());
            ps.executeUpdate();
            ps.close();
             return true;
        }catch(SQLException ex){
            System.err.println("error al insertar");
            return false;
        }
    }
        
        public boolean actualizar(TicketModelo tic){
 qry="Update public.ticket SET "
             + "Partido_id=?, Numero_asiento=?, Seccion=?, Precio=?, Estado=?, Fecha_partido=? WHERE id=?";
        
               try{
        Connection con=cn.getConnection();
        PreparedStatement ps=con.prepareStatement(qry);
        ps.setInt(1, tic.getPartido_id());
            ps.setString(2, tic.getNumero_asiento());
            ps.setString(3, tic.getSeccion());
            ps.setDouble(4, tic.getPrecio());
            ps.setString(5, tic.getEstado());
            ps.setTimestamp(6,Timestamp.valueOf(tic.getFecha_partido()));
            ps.setInt(7, tic.getId());
            ps.executeUpdate();
            ps.close();
        ps.close();
                   
        return true;
    }catch(SQLException e ){
         e.printStackTrace();
        return false; 
    }
}

      public boolean cambiarEstado(String estado, int id){
    qry = "UPDATE public.ticket SET estado=? WHERE id=?";
    try{
        Connection con = cn.getConnection();
        PreparedStatement ps = con.prepareStatement(qry);
        ps.setString(1, estado);
        ps.setInt(2, id);
        ps.executeUpdate();
        ps.close();

        return true;

    }catch(SQLException e){

        e.printStackTrace();

        return false;
    }
}
 
     public List<TicketModelo>listar(){
       List<TicketModelo> lista = new ArrayList<>();
 qry = "SELECT * FROM public.ticket";

 try {
     Connection con = cn.getConnection();
     PreparedStatement ps = con.prepareStatement(qry);
     ResultSet rs = ps.executeQuery();

     while(rs.next()){

         TicketModelo tic = new TicketModelo();
         
         tic.setId(rs.getInt("id"));
         tic.setPartido_id(rs.getInt("Partido_Id"));
         tic.setFecha_partido(
         rs.getTimestamp("fecha_registro").toLocalDateTime());
         tic.setNumero_asiento(rs.getString("Numero Asiento"));
         tic.setSeccion(rs.getString("Sección"));
         tic.setPrecio(rs.getDouble("Precio"));
         tic.setEstado(rs.getString("Estado"));
         
         lista.add(tic) ;
     }
     ps.close();
 } catch(SQLException e){
     e.printStackTrace();
 }
 return lista;
 }   
 
      
}


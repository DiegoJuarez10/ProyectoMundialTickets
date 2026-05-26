package Dao;

import Conexion.CreateConnection;
import Modelo.VentaModelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
 
/**
 *
 * @author yorch
 */
public class VentaDao {
    
     String qry="";
    CreateConnection cn= new CreateConnection();
  //Metodo para insertar
    public boolean insertar(VentaModelo ven){
        qry="insert into public.venta (Cliente_id, cantidad, Usuario_id, Total)"+
                "Values(?,?,?,?)";
        try{
            Connection con=cn.getConnection();
            PreparedStatement ps =con.prepareStatement(qry);
            
            ps.setInt(1, ven.getCliente_id());
            ps.setInt(2, ven.getCantidad());
            ps.setInt(3, ven.getUsuario_id());
            ps.setDouble(4, ven.getTotal());
            
            ps.executeUpdate();
            ps.close();
             return true;
        }catch(SQLException ex){
            System.err.println("error al insertar");
            return false;
        }
    }
     
    
       public boolean actualizar(VentaModelo ven){
 qry="Update public.venta SET "
             + "Cliente_id=?, cantidad=?, Usuario_id=?, Total=?, Fecha=? WHERE id=?";
        
               try{
        Connection con=cn.getConnection();
    PreparedStatement ps=con.prepareStatement(qry);
            ps.setInt(1, ven.getCliente_id());
            ps.setInt(2, ven.getCantidad());
            ps.setInt(3, ven.getUsuario_id());
            ps.setDouble(4, ven.getTotal());
            ps.setTimestamp(6,Timestamp.valueOf(ven.getFecha()));
           
            ps.executeUpdate();
            ps.close();
        ps.close();
                   
        return true;
    }catch(SQLException e ){
         e.printStackTrace();
        return false; 
    }
}
    
  public List<VentaModelo>listar(){
       List<VentaModelo> lista = new ArrayList<>();
 qry = "SELECT * FROM public.venta";

 try {
     Connection con = cn.getConnection();
     PreparedStatement ps = con.prepareStatement(qry);
     ResultSet rs = ps.executeQuery();

     while(rs.next()){

         VentaModelo ven = new VentaModelo();
         ven.setId(rs.getInt("id"));
         ven.setFecha(
         rs.getTimestamp("fecha").toLocalDateTime());
         ven.setCliente_id(rs.getInt("cliente_id"));
         ven.setCantidad(rs.getInt("cantidad"));
         ven.setUsuario_id(rs.getInt("usuario_id"));
         ven.setTotal(rs.getDouble("total"));
         
        
         lista.add(ven);
     }
     ps.close();
 } catch(SQLException e){
     e.printStackTrace();
 } 
 return lista;
 }   
    

    
    
}

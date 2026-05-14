/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import conexion.CreateConnection;
import Modelo.PartidoModelo;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.time.LocalDateTime;


public class PartidoDao {
     private final CreateConnection connFactory = new CreateConnection();
   public List <PartidoModelo> obtenerTodos(){
        List <PartidoModelo> lista = new ArrayList<>();
        String sql = "SELECT * FROM partido";
        
        try(Connection conn = connFactory.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()){
            
            while(rs.next()){
                PartidoModelo partido = new PartidoModelo(
                          rs.getInt("id"),
                        rs.getString("equipo_local"),
                        rs.getString("equipo_visitante"),
                        rs.getTimestamp("fecha").toLocalDateTime(),
                        rs.getString("estadio"),
                        rs.getString("ciudad"),
                        rs.getInt("capacidad"),
                     rs.getBoolean("estado")

                );
                lista.add(partido);
                
            }
            ps.close();
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return lista;
    }
    
    public boolean guardar(PartidoModelo partido){
        String sql = "INSERT INTO partido (equipo_local ,equipo_visitante ,estadio, ciudad, capacidad) VALUES (?, ?,?,?,?)";
        
        try(Connection conn = connFactory.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, partido.getEquipo_local());
            ps.setString(2, partido.getEquipo_visitante());
            ps.setString(3, partido.getEstadio());
            ps.setString(4, partido.getCiudad());
            ps.setInt(5, partido.getCapacidad());
        ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        
    }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
}
    
public boolean actualizar(PartidoModelo partido){
    String sql = "UPDATE partido SET equipo_local=?, equipo_visitante=?, estadio=?, ciudad=?, capacidad=? WHERE id = ?";
      try(Connection conn = connFactory.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
             ps.setString(1, partido.getEquipo_local());
            ps.setString(2, partido.getEquipo_visitante());
            ps.setString(3, partido.getEstadio());
            ps.setString(4, partido.getCiudad());
            ps.setInt(5, partido.getCapacidad());
            ps.setInt(6, partido.getId());
        ps.executeUpdate();
        ps.close();
        conn.close();
        return true;
      }catch(SQLException e){
          e.printStackTrace();
      }
      return false;
}

public boolean eliminar(int id){
    String sql = "DELETE FROM partido WHERE id = ?";
    try(Connection conn = connFactory.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
        ps.setInt(1, id);
        ps.executeUpdate();
        ps.close();
        conn.close();
        return true;
    }catch(SQLException e){
          e.printStackTrace();
}
    return false;
}
}




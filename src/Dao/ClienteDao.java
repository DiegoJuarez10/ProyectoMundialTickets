
package DAO;
import Modelo.ClienteModelo;
import Conexion.CreateConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author DIEGO JUAREZ
 */
public class ClienteDao {
 private final CreateConnection connFactory = new CreateConnection();
   public List <ClienteModelo> obtenerTodos(){
        List <ClienteModelo> lista = new ArrayList<>();
        String sql = "SELECT * FROM cliente";
        
        try(Connection conn = connFactory.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()){
            
            while(rs.next()){
                ClienteModelo cli = new ClienteModelo(
                          rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("nit"),
                        rs.getString("email"),
                        rs.getString("direccion")
                );
                lista.add(cli);
                
            }
            ps.close();
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return lista;
    }
    
    public int guardar(ClienteModelo cli){
    String sql = "INSERT INTO cliente (nombre,apellido,nit, email, direccion) VALUES (?, ?,?,?,?)";
    
    try(Connection conn = connFactory.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
        ps.setString(1, cli.getNombre());
        ps.setString(2, cli.getApellido());
        ps.setString(3, cli.getNit());
        ps.setString(4, cli.getEmail());
        ps.setString(5, cli.getDireccion());
        ps.executeUpdate();
        
        ResultSet rs = ps.getGeneratedKeys();
        if(rs.next()){
            return rs.getInt(1);
        }
    }catch(SQLException e){
        e.printStackTrace();
    }
    return 0;
}
    
public boolean actualizar(ClienteModelo cli){
    String sql = "UPDATE cliente SET nombre=?, apellido=?, nit=?, email=?, direccion=? WHERE id = ?";
      try(Connection conn = connFactory.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getApellido());
            ps.setString(3, cli.getNit());
            ps.setString(4, cli.getEmail());
            ps.setString(5, cli.getDireccion());
            ps.setInt(6, cli.getId());
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
    String sql = "DELETE FROM cliente WHERE id = ?";
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



            



package dao;
// Importamos las librerias
import modelo.UsuarioModelo;
import Conexion.CreateConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao{
// Conexion directa, para buenas practicas
private final  CreateConnection connFactory = new CreateConnection();

    public boolean agregar(UsuarioModelo U){
    String query = "INSERT INTO usuario(username, password, rol) VALUES (?,?,?)";
    try(Connection conn = connFactory.getConnection(); 
        PreparedStatement ps = conn.prepareStatement(query)){
        ps.setString(1, U.getUsername());
        ps.setString(2, U.getPassword());
        ps.setString(3, U.getRol());
        ps.executeUpdate();
        ps.close();
        conn.close();
        return true;
    }catch(Exception e){
        e.printStackTrace();
    }
    return false;
    } 
    
    
    public UsuarioModelo login(String username, String password) {
    String query = "SELECT * FROM usuario WHERE username = ? AND password = ? AND rol = 'VENDEDOR' AND estado = TRUE";
    try (Connection conn = connFactory.getConnection();
         PreparedStatement ps = conn.prepareStatement(query)) {
        ps.setString(1, username);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return new UsuarioModelo(
                rs.getInt("id"),
                rs.getString("username"),
                rs.getString("password"),
                rs.getString("rol")
            );
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
}
    
    public boolean actualizar(UsuarioModelo U){
    String query = "UPDATE usuario SET username=?, password=?, rol=? WHERE id=?";
    try(Connection conn = connFactory.getConnection(); 
        PreparedStatement ps = conn.prepareStatement(query)){
        ps.setString(1, U.getUsername());
        ps.setString(2, U.getPassword());
        ps.setString(3, U.getRol());
        ps.setInt(4, U.getId());
        ps.executeUpdate();
        ps.close();
        conn.close();
        return true;
    }catch(Exception e){
        e.printStackTrace();
    }
    return false;
    }
  
    public boolean eliminar(int id){
    String query = "DELETE FROM usuario WHERE id=?";
    try(Connection conn = connFactory.getConnection();
        PreparedStatement ps = conn.prepareStatement(query)){
        ps.setInt(1, id);
        ps.executeUpdate();
        ps.close(); 
        conn.close(); 
        return true; 
    }catch(Exception e){
        e.printStackTrace();
    }
    return false;
    }
   
    public UsuarioModelo consultar(int id){
    String query = "SELECT * FROM usuario WHERE id=?";
    try(Connection conn = connFactory.getConnection();
        PreparedStatement ps = conn.prepareStatement(query)){
        ps.setInt(1, id); 
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
        UsuarioModelo U = new UsuarioModelo( 
             rs.getString("username"),
             rs.getString("password"),
             rs.getString("rol")
        ); 
        return U;
        }
        }catch(Exception e){
         e.printStackTrace();
         }
         return null;
    } 
    
    // Obtener todos los valores en la tabla
    public List<UsuarioModelo>ObtenerTodos(){
    List<UsuarioModelo>lista = new ArrayList<>();
    String query = "SELECT * FROM usuario"; 
    try(Connection conn = connFactory.getConnection();
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery()){
        while(rs.next()){
        UsuarioModelo U = new UsuarioModelo(
                rs.getInt("Id"),
                rs.getString("username"),
                rs.getString("password"),
                rs.getString("rol")
        );
        lista.add(U);
        }
    }catch(Exception e){
    
    }
    return lista; 
    }


}
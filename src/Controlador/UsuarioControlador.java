
package controlador; 
// Importamos libreias 
import dao.UsuarioDao;
import java.util.List;
import modelo.UsuarioModelo;

public class UsuarioControlador{
// La instacia del dao 
    UsuarioDao dao = new UsuarioDao();
    
    public boolean agregarUsuario(String username, String password, String rol){
    UsuarioModelo U = new UsuarioModelo(username, password, rol);
    boolean resultado = dao.agregar(U);
    return resultado;
    } 
    
    public boolean actualizarUsuario(int id, String username, String password, String rol){
    UsuarioModelo U = new UsuarioModelo(id, username, password, rol);
    boolean resultado = dao.actualizar(U);
    return resultado;
    } 
    
    public boolean eliminarUsuario(int id){
    UsuarioModelo U = new UsuarioModelo();
    U.setId(id);
    boolean resultado = dao.eliminar(id);
    return resultado;
    } 
    
    public UsuarioModelo consultarUsuario(int id){
    UsuarioModelo U  = dao.consultar(id);
    return U;
    } 
    
   public List<UsuarioModelo>ObtenerTodos(){
   return dao.ObtenerTodos();
   }

    
}

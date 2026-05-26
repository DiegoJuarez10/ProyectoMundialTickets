
package Controlador;

import DAO.ClienteDao;
import Modelo.ClienteModelo;
import java.util.List;

public class ClienteControlador {
    private final ClienteDao dao = new ClienteDao();
public List <ClienteModelo> obtenerClientes(){
    return dao.obtenerTodos();
}
public int registrarCliente(String nombre, String apellido, String nit, String email, String direccion){
    ClienteModelo cli = new ClienteModelo(0, nombre, apellido, nit, email, direccion);
    return dao.guardar(cli);
}
public void modificarCliente(int id,String nombre, String apellido, String nit, String email, String direccion){
    ClienteModelo cli = new ClienteModelo(id, nombre, apellido, nit, email, direccion);
    dao.actualizar(cli);
}
public void eliminarCliente(int id){
    dao.eliminar(id);
}
}

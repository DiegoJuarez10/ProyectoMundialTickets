/*
Atributos: id, username,
password, rol (Admi o Vendedor)
estado (Estado booleano),
*/  
package modelo; 

public class UsuarioModelo{
// Atributos de la clase Usuario
    private int id; 
    private String username; 
    private String password;
    private String rol; 
    
    // Constructor vacio 
    public UsuarioModelo(){
    } 
    
    // Constructor con ID (UPDATE, SELECT, DELETE)
    public UsuarioModelo(int id, String username, String password, String rol){
    this.id=id;
    this.username = username;
    this.password = password;
    this.rol = rol;
    }
    // Constructor sin ID (INSERT)
    public UsuarioModelo(String username, String password, String rol){ 
        this.username = username;
        this.password = password;
        this.rol = rol;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}

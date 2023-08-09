
package refugiodeanimales.entidadesdenegocio;

public class Usuario {
    private int id;
    private int idRol;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private int top_aux;
    private Rol rol;

    public Usuario() {
    }

    public Usuario(int id, String nombre, String apellido, String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }
     public int getTop_aux() {
        return top_aux;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
     public void setTop_aux(int top_aux) {
        this.top_aux = top_aux;
    }
  
    
}

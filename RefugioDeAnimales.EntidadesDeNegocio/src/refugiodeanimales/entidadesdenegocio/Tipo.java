
package refugiodeanimales.entidadesdenegocio;


public class Tipo {
    
  private int id;
  private String nombre;
  private byte status;
  private int top_aux;

    public Tipo() {
    }

    public Tipo(int id, String nombre, byte status, int top_aux) {
        this.id = id;
        this.nombre = nombre;
        this.status = status;
        this.top_aux = top_aux;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public byte getStatus() {
        return status;
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

    public void setStatus(byte status) {
        this.status = status;
    }

    public void setTop_aux(int top_aux) {
        this.top_aux = top_aux;
    }
  
  
}

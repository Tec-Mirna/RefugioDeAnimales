
package refugiodeanimales.entidadesdenegocio;

public class Mascota {
    private int id;
    private int idTipo;
    private int idGenero;
    private String raza;
    private String nombre;
    private int top_aux;
    private Tipo tipo;
    private Genero genero;

    public Mascota() {
    }

    public Mascota(int id, int idTipo, int idGenero, String raza, String nombre, int top_aux, Tipo tipo, Genero genero) {
        this.id = id;
        this.idTipo = idTipo;
        this.idGenero = idGenero;
        this.raza = raza;
        this.nombre = nombre;
        this.top_aux = top_aux;
        this.tipo = tipo;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public int getIdGenero() {
        return idGenero;
    }

    public String getRaza() {
        return raza;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTop_aux() {
        return top_aux;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTop_aux(int top_aux) {
        this.top_aux = top_aux;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    
}

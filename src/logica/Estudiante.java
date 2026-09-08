package logica;
public class Estudiante extends Persona {
    private int id;
    public Estudiante() {
    }
    public Estudiante(int id, String nombre, String apellido, String ci) {
        super(nombre, apellido, ci);
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
package logica;
import java.util.ArrayList;
public class Docente extends Usuario {
    private int id;
    private ArrayList<Asignatura> asignaturas;
    private ArrayList<Curso> cursos;
    public Docente() {
        this.asignaturas = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    public Docente(int id, String nombre, String apellido,
                   String ci, String contrasena) {

        super(nombre, apellido, ci, contrasena);

        this.id = id;
        this.asignaturas = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }
    public ArrayList<Curso> getCursos() {
        return cursos;
    }
}
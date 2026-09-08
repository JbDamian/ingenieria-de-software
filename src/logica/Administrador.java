package logica;
public class Administrador extends Usuario {
    private int id;
    public Administrador() {
    }
    public Administrador(int id, String nombre, String apellido,
                         String ci, String contrasena) {

        super(nombre, apellido, ci, contrasena);
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Estudiante crearEstudiante(int id, String nombre,
                                      String apellido, String ci) {

        return new Estudiante(id, nombre, apellido, ci);
    }
    public Docente crearDocente(int id, String nombre,
                                String apellido, String ci,
                                String contrasena) {

        return new Docente(id, nombre, apellido, ci, contrasena);
    }
    public void asignarCursoADocente(Curso curso, Docente docente) {
        // lógica para realizar la asignación
    }
    public void asignarAsignaturaADocente(Asignatura asignatura,
                                          Docente docente) {
        // lógica para realizar la asignación
    }

    public void inscribirEstudiante(Estudiante estudiante, Curso curso) {
        // lógica para inscribir al estudiante
    }
}
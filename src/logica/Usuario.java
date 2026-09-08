package logica;
public abstract class Usuario extends Persona {
    private String contrasena;
    public Usuario() {
    }
    public Usuario(String nombre, String apellido, String ci, String contrasena) {
        super(nombre, apellido, ci);
        this.contrasena = contrasena;
    }
    public String getContrasena() {
        return contrasena;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}

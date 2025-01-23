
package es.alejandrosalazargonzalez.instahammer.model;
import java.util.Objects;

/**
 * Usuario comun de la aplicacion
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class UsuarioModel {
    private String codigo;
    private String nombre;
    private String email;
    private String contrasenia;

    /**
     * Constructor vacio
     */
    public UsuarioModel() {
    }

    /**
     * Constructor con el identificador
     * @param codigo identificador
     */
    public UsuarioModel(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Constructor completo
     * @param codigo del usuario
     * @param nombre del usuario
     */
    public UsuarioModel(String codigo, String nombre, String email, String contrasenia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.email = email;
        this.contrasenia = contrasenia;
    }

    //Getters y Setters
    public String getCodigo() {
        return this.codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public String getContrasenia() {
        return this.contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UsuarioModel)) {
            return false;
        }
        UsuarioModel usuarioModelo = (UsuarioModel) o;
        return Objects.equals(codigo, usuarioModelo.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
    

    @Override
    public String toString() {
        return "{" +
            " codigo='" + getCodigo() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", email='" + getEmail() + "'" +
            "}";
    }

}

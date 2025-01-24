package es.alejandrosalazargonzalez.instahammer.view;


/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class AdministradorView {
    private String email;
    private String nombre;

    public AdministradorView(String email, String nombre) {
        this.email = email;
        this.nombre = nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String toString() {
        return "{" +
            " email='" + getEmail() + "'" +
            ", nombre='" + getNombre() + "'" +
            "}";
    }

}

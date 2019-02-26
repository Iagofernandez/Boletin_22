
package boletin22;

/**
 *
 * @author ifernandezblanco
 */
//nueva clase correos, para dar valor a los atributos
public class Correos {
    //variables
     String mensaje;
    boolean leido;
//constructor vacio para iniciar
    public Correos() {
    }
//constructor con las variables
    public Correos(String mensaje, boolean leido) {
        this.mensaje = mensaje;
        this.leido = leido;
    }
//getters y setters para establecer un valor inicial a las variables(setters) y poder acceder a estas(getters)
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    public String getMensaje() {
        return mensaje;
    }

    public boolean getLeido() {
        return leido;
    }
//nos retorna el valor en forma de mensaje
    @Override
    public String toString() {
        return "Mensaje= " + mensaje + "\nLeido=" + leido;
    }

}


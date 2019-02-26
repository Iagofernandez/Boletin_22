
package boletin22;

import java.util.ArrayList;
import utilidades.PedirDatos;

/**
 *
 * @author ifernandezblanco
 */
public class Buzon {
    //creo un arrayList para los correos
    public void Correo(ArrayList<Correos> corre){
        //JOptionPane para introducir el correo
        String correo=PedirDatos.introducirString("Mensaje del correo");
        boolean leido=false;
        //creo un objeto Correo con dos atributos
        Correos cor=new Correos(correo,leido);
        //añade un nuevo elemento a la lista
        corre.add(cor);
    }
    //metodo para recorrer la lista
    public int recorrerLista(ArrayList<Correos> cor){
        //muestra el tamaño actual
        int numero=cor.size();
        //retorna el tamaño actual
        return numero;
    }
    //metod que invoca al arraylist que devuelve un boolean, si has o no leido los correos
    public boolean leer(ArrayList<Correos> cor){
        //para recorrer la lista
        for(Correos corre:cor){
            //si hay correos por leer true, si no false
            if(corre.getLeido()==false){
                return true;
            }
        }
        return false;
    }
    //metodo String que invoca al ArrayList 
        public String mostrar(ArrayList<Correos>cor){
            //variable boolean
        boolean mostra=leer(cor);
        //variable String
        String mensaje;
        
        for(Correos corre: cor){
            if(mostra){
                mensaje=corre.getMensaje();
                corre.setLeido(true);
                return mensaje;
            }
        }
        return "Ninguno por leer";
    }
    
    
    public void mostrar(ArrayList<Correos> cor,int posicion){
        System.out.println(cor.get(posicion-1));
        Correos comprobacion=cor.get(posicion-1);
        if (comprobacion.getLeido()==false){
            comprobacion.setLeido(true);
        }

    }
    //para eliminar elementos(ya se han leido)
    public void eliminar(ArrayList<Correos>cor,int posicion){
        //recorre la lista
        for(Correos corre:cor){
            //con este if indicamos que elemento se quiere eliminar
            if(cor.contains(posicion-1)){
                cor.remove(corre);
            }
        }
    }
}


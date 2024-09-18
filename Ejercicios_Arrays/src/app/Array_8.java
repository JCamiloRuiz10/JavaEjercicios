
package app;

import javax.swing.JOptionPane;

class socios{
    String nombre;
    int edad;
    String libroFavorito;
    
    public socios(String nombre, int edad, String libroFavorito){
        this.nombre = nombre;
        this.edad = edad;
        this.libroFavorito = libroFavorito;
    }
}

public class Array_8 {
    public static void main(String[] args) {
        socios[] lectura = new socios[50];
        lectura[0] = new socios("Luz Mery", 35, "El pricipito");
        lectura[1] = new socios("Cesar", 32, "Cien anios de soledad");
        lectura[2] = new socios("Belen", 33, "Ulises");
        lectura[3] = new socios("Alberto", 19, "El Proceso");
        
        String seleccion;
        do { 
            String[] opciones = {"Mostrar", "Agregar", "Actualizar libro favorito", "Buscar", "Promedio Edad", "Salir"};
            seleccion = (String) JOptionPane.showInputDialog(null,
                "Selecione la funcion de los socios del club de lectura",
                "Funciones",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);
            switch (seleccion) {
                case "Mostrar":
                    String ver = "";
                    for (socios lista : lectura) {
                        if (lista!=null) {
                            ver += ("Nombre: " + lista.nombre +"\n" + "Edad: " + lista.edad + "\n" +"Libro Favorito: " + lista.libroFavorito + "\n\n" );
                        }
                    }
                    JOptionPane.showMessageDialog(null, ver);
                    break;
                case "Agregar":
                    String nombreS = JOptionPane.showInputDialog("Ingrese su nombre");
                    int edadS = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Edad"));
                    String libroFa = JOptionPane.showInputDialog("Ingrese su libro favorito");
                    boolean nuevoSocio = agregarSocio(lectura, nombreS, edadS, libroFa);
                    if (nuevoSocio) {
                        JOptionPane.showMessageDialog(null, nombreS + " es nuevo miembro del club");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo vincular al club");
                    }
                    break;
                case "Actualizar libro favorito":
                    String nombreB = JOptionPane.showInputDialog("Ingrese su nombre");
                    socios busqueda = buscar(lectura, nombreB);
                    if (busqueda != null) {
                        String libroNuevo = JOptionPane.showInputDialog("Ingrese su nuevo libro Favorito");
                        busqueda.libroFavorito = libroNuevo;
                        JOptionPane.showMessageDialog(null, "Su libro se ha cambiado");                        
                    } else {
                        JOptionPane.showMessageDialog(null, "usten no esta asociado al club"); 
                    }
                    break;
                case "Buscar":
                    String nombreSocio = JOptionPane.showInputDialog("Ingrese su nombre");
                    socios busca = buscar(lectura, nombreSocio);
                    if (busca!= null) {
                        JOptionPane.showMessageDialog(null, "Nombre: " + busca.nombre +"\n" + "Edad: " + busca.edad +"\n" + "Libro Favorito: " + busca.libroFavorito);
                    } else {
                        JOptionPane.showMessageDialog(null, "Miembro no vinculado al club");
                    }
                    break;
                case "Promedio Edad":
                    int sumaEdades = 0;
                    int numMiembros = 0;
                    for (socios edades : lectura) {
                        if (edades != null) {
                            sumaEdades += edades.edad;
                            numMiembros++;
                        }
                    }
                    if (numMiembros > 0) {
                        double promedio = sumaEdades / numMiembros;
                        JOptionPane.showMessageDialog(null, "El promedio de esdad de los socios es: " + promedio);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay miembros");
                    }
                    break;
                case "Salir":
                    JOptionPane.showMessageDialog(null, "Salieendo.....");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
            
        } while (!seleccion.equals("Salir"));
    }
    public static boolean agregarSocio(socios[] lectura, String nombre, int edad, String libroFavorito){
        for (int i = 0; i < lectura.length; i++) {
            if (lectura[i] == null) {
                lectura[i] = new socios(nombre, edad, libroFavorito);
                return true;
            }
        }
        return false;
    }
    public static socios buscar(socios[] lectura, String nombre){
        for (socios buscar : lectura) {
            if (buscar != null && buscar.nombre.equals(nombre)) {
                return buscar;
            }
        }
        return null;
    }
}

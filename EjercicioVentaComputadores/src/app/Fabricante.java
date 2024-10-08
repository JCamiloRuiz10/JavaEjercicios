
package app;

import java.util.Objects;

public class Fabricante {
    private String nombre;
    private String pais;
    private int anioFundacion;

    public Fabricante(String nombre, String pais, int anioFundacion) {
        this.nombre = nombre;
        this.pais = pais;
        this.anioFundacion = anioFundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public int getAnioFundacion() {
        return anioFundacion;
    }
    
    
    @Override
    public int hashCode() {
        return Objects.hash(nombre, pais);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fabricante other = (Fabricante) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.pais, other.pais);
    }

    @Override
    public String toString() {
        return "Fabricante:\n" + "-Nombre=" + nombre +"\n" + 
                "-Pais=" + pais + "\n" + "-AnioFundacion=" + anioFundacion;
    }
    
    
    
}

package practica.autoo;

/**
 *
 * @author lalor
 */
public class Cliente {
    private String Nombre;
    private String numLicencia;
    private String numTelefoco;
    private String direccion;
    private String tipoSangre;

    public Cliente() {
    }

    public Cliente(String Nombre, String numLicencia, String numTelefoco, String direccion, String tipoSangre) {
        this.Nombre = Nombre;
        this.numLicencia = numLicencia;
        this.numTelefoco = numTelefoco;
        this.direccion = direccion;
        this.tipoSangre = tipoSangre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(String numLicencia) {
        this.numLicencia = numLicencia;
    }

    public String getNumTelefoco() {
        return numTelefoco;
    }

    public void setNumTelefoco(String numTelefoco) {
        this.numTelefoco = numTelefoco;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
    
    
    
}


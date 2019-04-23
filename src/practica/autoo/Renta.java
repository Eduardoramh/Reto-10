package practica.autoo;

import java.util.Date;

/**
 *
 * @author lalor
 */
public class Renta {
    private Cliente persona;
    private Automovil automovil;
    private Date fechaRegistro;
    private int diasRenta;
    private int status;

    public Renta() {
    }

    public Renta(Cliente persona, Automovil automovil, Date fechaRegistro, int diasRenta) {
        this.persona = persona;
        this.automovil = automovil;
        this.fechaRegistro = fechaRegistro;
        this.diasRenta = diasRenta;
    }

    public Cliente getPersona() {
        return persona;
    }

    public void setPersona(Cliente persona) {
        this.persona = persona;
    }

    public Automovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getDiasRenta() {
        return diasRenta;
    }

    public void setDiasRenta(int diasRenta) {
        this.diasRenta = diasRenta;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
    
}

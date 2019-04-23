package practica.autoo;

/**
 *
 * @author lalor
 */
public class Automovil {
    private int idAutomovil;
    private String identificador;
    private String tipoAutomovil;
    private double precioRentaD;
    private Motor motor;
    private Llanta[] llantas = new Llanta[4];
    private Faros[] faros = new Faros[2];
    
    private int status = 1;

    public Automovil() {
    }

    public Automovil(int idAutomovil, String identificador, String tipoAutomovil, double precioRentaD, Motor motor, Llanta tipoLlanta, Faros tipoFaros) {
        this.idAutomovil = idAutomovil;
        this.identificador = identificador;
        this.tipoAutomovil = tipoAutomovil;
        this.precioRentaD = precioRentaD;
        this.motor = motor;
        this.llantas[0] = tipoLlanta;
        this.llantas[1] = tipoLlanta;
        this.llantas[2] = tipoLlanta;
        this.llantas[3] = tipoLlanta;
        this.faros[0] = tipoFaros;
        this.faros[1] = tipoFaros;
    }

    public int getStatus() {
        return status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }

    public int getIdAutomovil() {
        return idAutomovil;
    }

    public void setIdAutomovil(int idAutomovil) {
        this.idAutomovil = idAutomovil;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(String tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public double getPrecioRentaD() {
        return precioRentaD;
    }

    public void setPrecioRentaD(double precioRentaD) {
        this.precioRentaD = precioRentaD;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    

    
}

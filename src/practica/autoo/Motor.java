package practica.autoo;

/**
 *
 * @author lalor
 */
public class Motor {
    private String numeroSerie;
    private double potencia;
    private int numCilinros;

    public Motor() {
    }

    public Motor(String numeroSerie, double potencia, int numCilinros) {
        this.numeroSerie = numeroSerie;
        this.potencia = potencia;
        this.numCilinros = numCilinros;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public int getNumCilinros() {
        return numCilinros;
    }

    public void setNumCilinros(int numCilinros) {
        this.numCilinros = numCilinros;
    }
    
    
    
}

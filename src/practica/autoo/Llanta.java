package practica.autoo;

/**
 *
 * @author lalor
 */
public class Llanta {
    private String marca;
    private String rodada;

    public Llanta() {
    }

    public Llanta(String marca, String rodada) {
        this.marca = marca;
        this.rodada = rodada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getRodada() {
        return rodada;
    }

    public void setRodada(String rodada) {
        this.rodada = rodada;
    }
    
    
}

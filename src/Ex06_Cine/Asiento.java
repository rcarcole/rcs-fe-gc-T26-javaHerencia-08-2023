package Ex06_Cine;

public class Asiento {
    private char letra;
    private int numero;
    private boolean ocupado;

    public Asiento(char letra, int numero) {
        this.letra = letra;
        this.numero = numero;
        this.ocupado = false;
    }
    
    @Override
    public String toString() {
        return "Asiento: " + numero + letra;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void ocupar() {
        this.ocupado = true;
    }
    
    public boolean estaOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
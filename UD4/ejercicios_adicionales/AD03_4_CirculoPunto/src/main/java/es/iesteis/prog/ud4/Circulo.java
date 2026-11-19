package es.iesteis.prog.ud4;

/**
 * La clase representa círculos con un centro
 * y un valor determinado de radio
 *
 * @author a26jesannysbs
 *
 */
public class Circulo{
    private final double PI = 3.14;
    private double radio;
    private Punto centro;


    public Circulo(Punto centro, double radio) {
        this.radio = radio;
        this.centro = centro;
    }

    public Circulo(double radio) {
        this.radio = radio;
        this.centro = new Punto(0, 0);
    }

    public double getRadio() {
        return radio;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setRadio(int nuevoRadio) {
        radio = nuevoRadio;
    }

    public double calcularArea() {
        return 2 * PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * PI * radio;
    }

    public void setCentroX(int centroX) {
        setCentroX(centroX);
    }

    public void setCentroY(int centroY) {
        setCentroY(centroY);
    }

    public String toString() {

        return "Radio: " + radio + ", centro: " + centro;
    }

    public void printCirculo() {

        System.out.println("Circulo se representa: " + this.toString());
    }
}




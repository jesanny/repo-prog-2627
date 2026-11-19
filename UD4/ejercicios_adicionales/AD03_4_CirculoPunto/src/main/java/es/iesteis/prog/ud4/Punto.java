package es.iesteis.prog.ud4;

/**
 * Representa a un punto en el espacio bidimensional
 *
 * @author
 */
public class Punto {
    private int x;
    private int y;

    /**
     * Constructor de la clase Punto
     */
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {

        return x;
    }


    public int getY() {

        return y;
    }


    public void setX(int x) {

        this.x = x;
    }


    public void setY(int y) {

        this.y = y;
    }


    public String toString() {
        String str = "";
        str = str + "Valor de x = " + x + "\n" + "Valor de y = " + y + "\n";
        return str;
    }

    static void main(String[] args) {


        //Podéis hacer las pruebas de esta clase aquí, creando una instancia de Punto.
    }

}

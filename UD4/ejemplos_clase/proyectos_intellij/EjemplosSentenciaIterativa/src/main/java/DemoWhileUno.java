import java.util.Scanner;
import java.util.Random;

/**
 *  Clase que inclute métodos para probar la
 *  sentencia iterativa while
 *   
 */
public class DemoWhileUno
{
    private final char ESPACIO = ' ';
    private final char ASTERISCO = '*';

    private Random generador;
    private Scanner teclado;
    private Dado dado;
    private Moneda moneda;

    /**
     * Constructor  
     */
    public DemoWhileUno()
    {
        generador = new Random();
        teclado = new Scanner(System.in);
        moneda = new Moneda();
        dado = new Dado();
    }

    /**
     *  
     * Escribir un saludo 10 veces
     *  
     * 
     */
    public void ejemplo01() {
        int contadorSaludos = 0;
        while (contadorSaludos < 10){
            contadorSaludos++;
            System.out.println("Hola " + contadorSaludos);


        }

    }

    /**
     *  
     * Tirar una moneda 10 veces
     * 
     */
    public void ejemplo02() {
        int tirarMoneda = 0;
        while (tirarMoneda < 10){
            tirarMoneda++;
            System.out.println("la moneda es: " + tirarMoneda);
            System.out.printf("Ha salido cara? %b%n",  moneda.esCara());
        }

    }

    /**
     *  
     * Tirar una moneda 30 veces
     * contando las veces que ha salido cara y las que ha salido cruz
     * Uso de contadores
     */
    public void ejemplo03() {
        int tirarMoneda = 0, cara = 0, cruz = 0;

        while (tirarMoneda < 30) {
            tirarMoneda++;
            moneda.tirar();
            if (moneda.esCara())
                cara++;
            else
                cruz++;

        }
        //System.out.printf("se ha tirado: " + tirarMoneda + " monedas, son cara: " + cara + ", son cruces: " + cruz);
        System.out.printf("Han salido %d caras y %d cruces ", cara, cruz);


    }

    /**
     *  
     * Suma y producto de los números naturales desde el 20 hasta el 1
     * Uso de acumuladores
     */
    public void ejemplo04() {


        int suma = 0;
        int contador= 20;
        int producto = 1;

        while (suma <= 20){
            contador++;
            producto += 1;
            suma += 1;

            System.out.printf("La suma es;  " +  suma);
            System.out.println("El producto:  " + producto);
        }
    }

    /**
     *  Generar aleatorios entre 10 y 50 inclusive y escribirlos
     *  El bucle termina cuando sale el 25
     *  Mostrar los números en filas de 6 formateados a 4 espacios
     *  
     *  Bucle controlado por un valor centinela
     */
    public void ejemplo05( ) {

        int columna = 0;
        int numero = (int) (Math.random() * 41) + 10;

        while (numero != 25) {
            System.out.printf("%4d", numero);
            columna++;

            if (columna == 6) {
                System.out.println();
                columna = 0;
            }

            numero = (int) (Math.random() * 41) + 10;
        }

        System.out.printf("%4d", numero);
        System.out.println();

        }




    /**
     *  Generar aleatorios entre 0 y 50 inclusive y sumarlos.
     *  Parar cuando salga el 0. Escribir al final la suma
     *  Bucle controlado por un valor centinela
     */
    public void ejemplo06( ) {
        int suma = 0;
        int numero = (int) (Math.random() * 51);
        while (numero != 0){
            suma += numero;

            numero = (int) (Math.random() * 51);
            System.out.printf("Generado %d\n", numero);

        }
        IO.println(String.format("la suma es %d", suma));


    }

    /**
     *  
     * Tirar una moneda reiteradamente 
     * hasta que salga cara o se hayan hecho 30 tiradas
     * Usar una variable booleana como conmutador (o switch - flag) para
     * salir del bucle
     */
    public void ejemplo07() {
    int tirarMoneda =0, cara = 0, cruz = 0;

    while (tirarMoneda <= 30){
        moneda.tirar();
        tirarMoneda++;
    }
        System.out.printf("monedas tiradas: " + tirarMoneda);

    }

    /**
     *  Suma de pares entre 1 y 100
     *  y producto de impares entre 1 y 100 
     *   
     */
        public  void ejemplo08() {
        int sumarPares = 0;
        int impar = 1;
        boolean tocaImpar = true;
        int contador = 1;

        while (contador <= 100){

            if (tocaImpar){
                impar *= contador;
                tocaImpar = false;
            }
            else {
                    sumarPares += contador;
                    tocaImpar = true;
                }
                contador++;
            }

        }

    /**
     *  Suma de pares entre 1 y 100
     *  y producto de impares entre 1 y 100 
     *  Con una variable booleana que actúe de switch o conmutador
     */
    public  void ejemplo09()
    {

    }

    /**
     * Generar n aleatorios entre 5 y 15 inclusive y contar los pares, los que acaban en 2
     * y sumar los impares
     */
    public  void ejemplo10(int n)
    {

    }

    /**
     * Tirar un dado repetidas veces hasta que salga un 6.
     * Contar las tiradas y sumarlas (se excluye el 6 de los cálculos)
     */
    public  void ejemplo11(int n)
    {

    }

    /**
     *  Pregunta 9 del cuestionario I UT4
     *  
     *  Pide al usuario una letra y valida con un bucle while que sea una vocal 
     *  minúscula. Si no es así pide de nuevo  al usuario otra letra hasta que 
     *  introduzca una letra correcta (hazlo con un while)
     */
    public void ejemplo12()
    {

    }

    /**
     *  Calcular y devolver el nº de cifras de numero
     */
    public int contarCifras(int numero)
    {

        return 0;
    }

    /**
     *  Calcular el inverso de un nº (sin contar previamente sus cifras)
     */
    public int inversoV1(int numero)
    {

         return 0;
    }

    /**
     *  Calcular el inverso de un nº (contando previamente sus cifras)
     */
    public int inversoV2(int numero)
    {

         return 0;
    }


    /**
     * Hacer una traza en papel  de este método y deducir qué salida produce
     * para las llamadas  misterio(1);       misterio(6);    
     *              misterio(19);  misterio(39);     misterio(74);
     */
    public   void misterio1(int x)
    {
        int y = 1;
        int z = 0;
        while (2 * y <= x)   {
            y = y * 2;
            z++;
        }
        System.out.println(y + " " + z);
    }

    /**
     * Para hacer la traza en papel
     */
    public  int misterio2(int a, int b)
    {
        int p = 1;
        int contador = 1;
        while (contador <= b)   {
            p = p * a;
            contador ++;
        }
        return p;

    }

    /**
     * Para hacer la traza en papel
     */
    public  int misterio3(int a, int b)
    {
        int s = 0;
        int contador = 1;
        while (contador <= b)    {
            s = s + a;
            contador ++;
        }
        return s;

    }

    /**
     * Generar 20 nºs aleatorios entre 5 y 10 incluidos
     * y para cada número calcular y escribir su sumatorio
     */
    public  void bucleAnidado01()
    {

    }

     /**
     * Generar 10 nºs aleatorios entre 5 y 50 incluidos
     * y mostrar un  histograma
     * 
     *  7: * * * * * * *
        6: * * * * * *
        7: * * * * * * *
        9: * * * * * * * * *
       10: * * * * * * * * * *
        8: * * * * * * * *
        9: * * * * * * * * *
       10: * * * * * * * * * *
        5: * * * * *
        9: * * * * * * * * *
     */
    public  void bucleAnidado02()
    {

    }

    /**
     * Mostrar la siguiente figura  (6 filas y 10 columnas)
     *  1 1 1 1 1 1 1 1 1 1
     *  2 2 2 2 2 2 2 2 2 2
     *  3 3 3 3 3 3 3 3 3 3
     *  4 4 4 4 4 4 4 4 4 4
     *  5 5 5 5 5 5 5 5 5 5
     *  6 6 6 6 6 6 6 6 6 6
     * 
     */
    public  void bucleAnidado03()
    {

    }

    /**
     * Mostrar la siguiente figura  (6 filas y 10 columnas)
     *  1
     *  1 2
     *  1 2 3
     *  1 2 3 4
     *  1 2 3 4 5
     *  1 2 3 4 5 6
     *  ...................
     *  
     */
    public  void bucleAnidado04()
    {

    }
    
    
     /**
     *  Mostrar la serie usando escribirEspacios()
     *        1
     *       21
     *      321
     *     4321
     *    54321
     *   654321
     *  7654321
     *
     *  
     */
    public  void bucleAnidado05(int n)
    {
 

    }

      /**
     *  escribir n espacios
     *  
     */
    private void escribirEspacios(int n)
    {
        
    }
    /**
     * El programa hace una pausa de los milisegundos especificados
     */
    public void esperar(int milisegundos)
    {
        try {
            Thread.sleep(milisegundos);
        } 
        catch (Exception e)  {
            // ignorar la excepción
        }
    }

    static void main(String[] args) {
        DemoWhileUno miDemo = new DemoWhileUno();
        miDemo.ejemplo07();

        //DemoWhileUno miOtroDemo = new DemoWhileUno();
        //miOtroDemo.ejemplo02();
        //TODO añadir aqui el codigo de pruebas: crear instancia y llamar a las funciones
    }

}

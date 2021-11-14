import java.util.Random;
/**
 *    Inigo Camarero Alli
 *    1.0
 */
public class PracticaBucles {
    private final char ESPACIO = ' ';
    private final char CARACTER = '\u0040';
    private Random generador;

    /**
     * Constructor  
     */
    public PracticaBucles()    {
        generador = new Random();
    }

    /**
     *  El método  genera  números aleatorios  entre -1000 y 5000 (inclusive)
     *  y calcula y escribe:
     *      - la media de todos los números
     *      - la suma de los impares
     *      - el máximo de los pares
     *        
     *  El proceso termina cuando sale un 0 o bien se han escrito n nºs
     *  
     *  Los números se escriben  en filas de 5 columnas 
     *  Cada nº aleatorio se muestra en un espacio de 12 posiciones en la pantalla  
     *  y al lado de cada nº se muestra otro nº con las mismas cifras y 
     *  en el mismo orden pero sin ceros (en 5 posiciones)
     *  
     *   Utiliza solo bucles while
     */
    public void generarNumeros(int n)   {
        System.out.println("Numero de numeros aleatorios a generar " + n);
        System.out.println("o hasta que salga el numero 0");
        System.out.println();
        int numerogenerado = generador.nextInt(6001)-1000;
        int numerogenerados = 0;
        double media = 0;
        int total = 0;
        total = total + numerogenerado;
        int impares = 0;
        int maximo = 0;
        while (numerogenerado == 0 ||numerogenerados <= n ) {
            numerogenerado = generador.nextInt(6001)-1000;
            System.out.printf("%15d"+"%s"+"%10d",numerogenerado,":",obtenerNumeroSinCeros(numerogenerado));
            total = total + numerogenerado;
            numerogenerados ++;
            media = total / numerogenerados;
            if(numerogenerado > maximo && numerogenerado %2 == 0) {
                maximo = numerogenerado;
            }

            if(numerogenerados % 10 == 0 ||numerogenerados % 10 == 5) {
                System.out.println();
            }
            
            if(numerogenerado % 2 != 0) {
                impares = impares + numerogenerado;
            }
        }
        System.out.println("\n" + "\n");
        System.out.printf("%25s"+"%10.2f","Media :" ,media);
        System.out.println();
        System.out.printf("%25s"+"%10d","Suma Impares :" ,impares);
        System.out.println();
        System.out.printf("%25s"+"%10d","Maximo Pares :" ,maximo);
    }

    /**
     *  Devuelve true si numero es impar, false en otro caso
     *  Hazlo sin utilizar if
     */
    public boolean esImpar(int numero)   {
        return  numero %2 != 0;
    }

    /**
     *  Dado un nº genera y devuelve otro nuevo 
     *  con las mismas cifras y en el mismo orden pero sin 
     *  los 0
     *  Ej - si numero = 2040 devuelve  24, si numero = 1009 devuelve  19
     *  si numero = 3000 devuelve 3
     *   
     *   
     */
    public int obtenerNumeroSinCeros(int numero)   {
        int resto = 0;
        int potencia = 0;
        int resultado = 0;
        while (numero != 0){
            resto = numero % 10;
            numero = numero / 10;
            if (resto != 0){
                resultado+= resto * Math.pow(10,potencia);
                potencia ++;
            }
        }
        return resultado;
    }

    /**
     *  Borrar la pantalla
     *
     */
    public void borrarPantalla()    {
        System.out.println('\u000C');
    }

    /**
     *  
     *  Dibuja la letra N (ver figura en el enunciado)
     *  Con bucles for
     *  
     *  Hay que usar el método escribirCaracter()
     *  
     *  
     *   
     */
    public void escribirLetraN(int altura)    {
        for(altura= 0;altura >2;altura--) {
            char caracter = 0;
            int n = 0;
            System.out.println("\n @ @   @");
            escribirCaracter(caracter, n);
        }
    }

    /**
     *  escribe n veces el caracter  indicado en la misma línea
     *  con bucles for
     */
    private void escribirCaracter(char caracter, int n)    {
        for(n= 0;n >= 0;n--) {
            System.out.println(caracter);
        }
    }
}

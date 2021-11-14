import java.util.Scanner;

/**
 * Incluye todo el código dentro del main()
 * No declares ningún nuevo método en esta clase ni atributos
 *  
 */
public class TestPracticaBucles
{
    /**
     *  Punto de entrada a la aplicación
     *  - define y crea el teclado  
     *  - define e instancia un objeto PracticaBucles
     *  - pide al usuario la cantidad máxima de aleatorios a generar
     *    (valida que sea  un nº positivo)
     *  - muestra las estadísticas de números aleatorios
     *  - haz una pausa y borra la pantalla    
     *  
     *  - pide al usuario un valor para la altura de la letra N -
     *          Valida que este valor es correcto, es decir,
     *          está en el intervalo 3 <= altura <= 10
     *  - muestra la letra N
     *  
     */
    public static void main(String[] args)    {
        Scanner sc = new Scanner(System.in);  //Se crea Scanner
        System.out.print("Introduzca el numero maximo de numeros a generar ");
        int n = sc.nextInt(); //Escribir
        PracticaBucles.generarNumeros(n);
        Utilidades.hacerPausa();
        Utilidades.borrarPantalla();
        System.out.print("Introduzca un Valor Para la Altura ");
        int altura = sc.nextInt(); //Escribir
        PracticaBucles.escribirLetraN(altura);
    }
} 


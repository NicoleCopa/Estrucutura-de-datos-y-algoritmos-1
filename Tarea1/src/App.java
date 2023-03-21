/* Escriba un método estático que tome un año como parámetro y 
devuelva false si el año es bisiesto y true en caso contrario. */

import java.util.Scanner; //Importamos librerias
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("- A Ñ O  B I S I E S T O -");
        
        //Declaramos variable
        int anio = 0;

        //Declaración de objetos
        Scanner entrada = new Scanner(System.in);

        //Pedimos al usuario que ingrese un año
        System.out.println("Ingrese un año: ");
        anio = entrada.nextInt();

        //Comprobamos si el año es bisiesto o no
        if(anio % 4 == 0){
            System.out.println("FALSE - El año es bisiesto.");
        }
        else{
            System.out.println("TRUE - El año no es bisiesto.");
        }
    }
}

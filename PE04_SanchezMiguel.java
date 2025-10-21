package Practica4;
import java.util.Scanner;
public class PE04_SanchezMiguel {

    //Variables globals per llum
    static boolean llumMenjador = false;
    static boolean llumCuina = false;
    static boolean llumBany = false;
    static boolean lllumH1 = false;
    static boolean llumH2 = false;
    static boolean llumH3 = false;

    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        int varPrincipal = 0;

        //Bucle principal del programa
        do {
            System.out.println("\nBenvingut de nou - Que vols controlar?");
            System.out.println("1. Control de llums");
            System.out.println("2. Control de persianes");
            System.out.println("3.control d'aire acondicionat");
            System.out.println("4. Control  d'altaveus");
            System.out.println("5. Control de cortines");
            System.out.println("6. Sortir del programa");
            System.out.println("Selecciona una opció");
            varPrincipal = j.nextInt();

            switch (varPrincipal) {
                case 1 :
                    controlarLlums(j);
                    break;
                case 2:
                    //Opcio de persianes no feta
                    break;
                case 3:
                    //Opcio aire acondicionat no feta
                    break;
                case 4:
                    //Opcio altaveus no feta
                    break;
                case 5:
                    //Opcio cortines no feta
                    break;
                case 6:
                    System.out.println("Apagant el sistema domotic... Fins aviat");
                    break;
                default:
            }
        } while ( varPrincipal != 6);

        j.close();

    }


// - - - - - - - - - - Definicio de metodes - - - - - - - - - - 
// - - - - - - - - - - Metode: Control de llums -  - - - - - - 
public static void controlarLlums(Scanner j) {
    int varLlums = 0;

    do {
        System.out.println("\nMenu controlador de llums");
        System.out.println("1. Encendre/Apagar llums d'una habitacio");
        System.out.println("2. Encendre/Apagar totes les llums");
        System.out.println("3. Mostrar estat actual");
        System.out.println("4. Tornar al menú principal");
        System.out.println("Selecciona una opcio: ");
        varLlums = j.nextInt();

        switch (varLlums) {
            case 1: 
                controlarHabitacio(j);
                break;
            case 2: 
                encendreApagarTotes();
                break;
            case 3:
                mostrarEstat();
                break;
            case 4:
                System.out.println("Tornant al menú prinipal...");
                break;
            default:
                System.out.println("Opcio no valida");
        }
    }   while (varLlums != 4);
}












}
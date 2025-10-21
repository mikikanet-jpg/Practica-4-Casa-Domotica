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
        while (varPrincipal != 6) {
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

            }
        }
    }
}

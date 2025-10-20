package Practica4;

import java.util.Scanner;

public class PE04_SanchezMiguel {
    
    //variables Globls (nomes per les llums)
    static boolean llumMenjador = false;
    static boolean llumCüina = false;
    static boolean llumHabitació = false;

    public static void main(String[] args) {
        Scanner j = new Scanner(System.in);
        int var = 0;

        //  Bucle per repetir el menu principal
        while (var != 6) {
            System.out.println("\n Benvingut, que vols fer.");
            System.out.println("1. Controlar llums");
            System.out.println("2. Controlar persianes");
            System.out.println("3. Controlar aire acondicionat");
            System.out.println("4. Controlar altaveus");
            System.out.println("5. Controlar cortines");
            System.out.println("6. Sortir");
            System.out.println("Selecciona una opció: ");
            var = j.nextInt();

            if (var == 1) {

            } else if (var == 2) {

            } else if (var == 3) {

            } else if (var == 4) {

            } else if (var == 5) {

            } else if (var == 6) {
                System.out.println("Sortint del sistema domotic");
            } else {
                System.out.println("Opcio no valida!");
            }


        }


    }
}

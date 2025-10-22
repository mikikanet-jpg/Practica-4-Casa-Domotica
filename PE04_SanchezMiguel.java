package Practica4;
import java.util.Scanner;
public class PE04_SanchezMiguel {

    //Variables globals per llum
    static String llumMenjador = "off";
    static String llumCuina = "off";
    static String llumBany = "off";
    static String llumH1 = "off";
    static String llumH2 = "off";
    static String llumH3 = "off";

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
    // - - - - - - - - - - Metode: Control de llums -  - - - - - - -
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
                    controlarTotes(j);
                    break;
                case 4:
                    System.out.println("Tornant al menú prinipal...");
                    break;
                default:
                    System.out.println("Opcio no valida");
                    break;
            }
        }   while (varLlums != 4);
    }

    //- - - - Metode per encendre o apagar una habitació concreta - - - - 
    public static void controlarHabitacio(Scanner j) {
        System.out.println("\nSelecciona l'habitació: ");
        System.out.println("1- Menjador");
        System.out.println("2- Cuina");
        System.out.println("3- H1");
        System.out.println("4- H2");
        System.out.println("5- H3");
        System.out.println("6- Bany");
        System.out.println("Selcciona una opcio: ");
        int hab = j.nextInt();

        System.out.println("Escriu on/off: ");
        String encesApagat = j.next().toLowerCase();

        String nomHabitacio = "";

        switch (hab) {
            case 1:
                nomHabitacio = "Menjador";
            break;
            case 2:
                nomHabitacio = "Cuina";
            break;
            case 3:
                nomHabitacio = "Habitacio1";
            break;
            case 4:
                nomHabitacio = "Habitacio2";
            break;
            case 5:
                nomHabitacio = "Habitacio3";
            break;
            case 6:
                nomHabitacio = "Bany";
            break;
            default:
                System.out.println("Habitacio no valida");
                return;
        }
        comprovarEstat(nomHabitacio, encesApagat);
    }

    //- - - - - Comprovar estat per poder enviar els missatges - - - - -
    public static void comprovarEstat(String habitacio, String encesApagat) {

        switch (habitacio) {
            case "Menjador":
                if (llumMenjador.equals(encesApagat)) {
                    System.out.println("La llum del " + habitacio + " ja està " + encesApagat + ".");
                } else {
                    llumMenjador = encesApagat;
                    System.out.println("La llum del " + habitacio + " s'ha posat " + encesApagat + " correctament.");
                }
                break;

            case "Cuina":
                if (llumCuina.equals(encesApagat)) {
                    System.out.println("La llum de la " + habitacio + " ja està " + encesApagat + ".");
                } else {
                    llumCuina = encesApagat;
                    System.out.println("La llum de la " + habitacio + " s'ha posat " + encesApagat + " correctament.");
                }
                break;

            case "Habitació 1":
                if (llumH1.equals(encesApagat)) {
                    System.out.println("La llum de " + habitacio + " ja està " + encesApagat + ".");
                } else {
                    llumH1 = encesApagat;
                    System.out.println("La llum de " + habitacio + " s'ha posat " + encesApagat + " correctament.");
                }
                break;

            case "Habitació 2":
                if (llumH2.equals(encesApagat)) {
                    System.out.println("La llum de " + habitacio + " ja està " + encesApagat + ".");
                } else {
                    llumH2 = encesApagat;
                    System.out.println("La llum de " + habitacio + " s'ha posat " + encesApagat + " correctament.");
                }
                break;

            case "Habitació 3":
                if (llumH3.equals(encesApagat)) {
                    System.out.println("La llum de " + habitacio + " ja està " + encesApagat + ".");
                } else {
                    llumH3 = encesApagat;
                    System.out.println("La llum de " + habitacio + " s'ha posat " + encesApagat + " correctament.");
                }
                break;

            case "Bany":
                if (llumBany.equals(encesApagat)) {
                    System.out.println("La llum del " + habitacio + " ja està " + encesApagat + ".");
                } else {
                    llumBany = encesApagat;
                    System.out.println("La llum del " + habitacio + " s'ha posat " + encesApagat + " correctament.");
                }
                break;

            default:
                System.out.println("Habitació no vàlida!");
                break;
            }
        }

    //- - - - - - - - Controlar totes les habitacions - - - - - - - - 
    public static void controlarTotes (Scanner j) {
        System.out.println("\nescriu on/off per totes les habitacions: ");
        String encesApagat = j.next().toLowerCase();

        llumMenjador = encesApagat;
        llumCuina = encesApagat;
        llumH1 = encesApagat;
        llumH2 = encesApagat;
        llumH3 = encesApagat;
        llumBany = encesApagat;

        System.out.println("Totes les llums estan "  + encesApagat + "  correctament.");
    }
        //- - - - - - - - - - Mostar estat - - - - - - - - -
    public static void mostrarEstat() {
        System.out.println("\n Estat actual de les llums:");
        System.out.println("Menjador ("  + llumMenjador + ")");
        System.out.println("Cuina ("  + llumCuina + ")");
        System.out.println("Habitacio 1 ("  + llumH1 + ")");
        System.out.println("Habitacio 2 ("  + llumH2 + ")");
        System.out.println("Habitacio 3 ("  + llumH3 + ")");
        System.out.println("Bany ("  + llumBany + ")");
    }
}












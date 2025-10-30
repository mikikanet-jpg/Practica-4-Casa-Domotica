package Practica4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class PE04_SanchezMiguel {
    //Variables globals per llum
    Scanner j = new Scanner(System.in);
    String llumMenjador = "off";
    String llumCuina = "off";
    String llumBany = "off";
    String llumH1 = "off";
    String llumH2 = "off";
    String llumH3 = "off";

    public static void main(String[] args) {
        PE04_SanchezMiguel p = new PE04_SanchezMiguel();
        p.principal();
    }
    public void principal() {
        int varPrincipal = 0;
        //Bucle principal del programa
        do {
            try {
            System.out.println("\nBenvingut de nou - Que vols controlar?");
            System.out.println("1. Control de llums");
            System.out.println("2. Control de persianes");
            System.out.println("3. Control d'aire acondicionat");
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
                    controlarPersianes(j);
                break;
                case 3:
                    controlarAire(j);    
                break;
                case 4:
                    controlarAltaveus(j);
                break;
                case 5:
                    controlarCortines(j);
                break;
                case 6:
                    System.out.println("Apagant el sistema domotic... Fins aviat");
                break;
                default:
                    System.out.println("Opcio no valida.");
            }
            } catch (InputMismatchException e) {
                System.out.println(" Error: introdueix un número vàlid!");
                j.nextLine(); // netejar buffer
                }
        } while ( varPrincipal != 6);

        j.close();

    }


    // - - - - - - - - - - Definicio de metodes - - - - - - - - - - 
    // - - - - - - - - - - Metode: Control de llums -  - - - - - - -
    public void controlarLlums(Scanner j) {
        int varLlums = 0;

        do {
            try {
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
                case 3:
                    mostrarEstat();
                break;
                case 4:
                    System.out.println("Tornant al menú prinipal...");
                    break;
                default:
                    System.out.println("Opcio no valida");
                    break;
            }
                 } catch (InputMismatchException e) {
                    System.out.println("Error: introdueix un número vàlid!");
                     j.nextLine(); // netejar buffer
                 }
        }   while (varLlums != 4);
    }

    //- - - - Metode per encendre o apagar una habitació concreta - - - - 
    public void controlarHabitacio(Scanner j) {
     try {
        System.out.println("\nSelecciona l'habitació: ");
        System.out.println("1- Menjador");
        System.out.println("2- Cuina");
        System.out.println("3- H1");
        System.out.println("4- H2");
        System.out.println("5- H3");
        System.out.println("6- Bany");
        System.out.println("Selcciona una opcio: ");
        int hab = j.nextInt();

        System.out.print("Escriu on/off (on = ences / off = apagat): ");
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
                nomHabitacio = "Habitació 1";
            break;
            case 4:
                nomHabitacio = "Habitació 2";
            break;
            case 5:
                nomHabitacio = "Habitació 3";
            break;
            case 6:
                nomHabitacio = "Bany";
            break;
            default:
                System.out.println("Habitacio no valida");
                return;
        }
            controlarEstat(nomHabitacio, encesApagat);

            } catch (InputMismatchException e) {
                System.out.println("Error: introdueix un número vàlid!");
                j.nextLine(); // netejar buffer
            }
    }

    //- - - - - Comprovar estat per poder enviar els missatges - - - - -
    public void controlarEstat(String habitacio, String encesApagat) {

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
    public void controlarTotes (Scanner j) {
        System.out.println("\nEscriu on/off per totes les habitacions: ");
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
    public void mostrarEstat() {
        System.out.println("\nEstat actual de les llums:");
        System.out.println("Menjador ("  + llumMenjador + ")");
        System.out.println("Cuina ("  + llumCuina + ")");
        System.out.println("Habitacio 1 ("  + llumH1 + ")");
        System.out.println("Habitacio 2 ("  + llumH2 + ")");
        System.out.println("Habitacio 3 ("  + llumH3 + ")");
        System.out.println("Bany ("  + llumBany + ")");
    }
//---------------------------------------------------------------------
//Aire, presianes, cortines i altaveus amb variables locals i sense automatitzacio.

public void controlarAire(Scanner j) {
    String aireMenjador ="off";
    String aireCuina ="off";
    String aireH1 ="off";
    String aireH2 ="off";
    String aireH3 ="off";
    String aireBany ="off";

    int varAire = 0;
    do{
        try {
        System.out.println("\nMENÚ AIRE CONDICIONAT");
        System.out.println("1. Encendre/Apagar una habitació");
        System.out.println("2. Encendre/Apagar tot l'aire condicionat");
        System.out.println("3. Mostrar estat actual");
        System.out.println("4. Tornar al menú principal");
        System.out.print("Selecciona una opció: ");
        varAire = j.nextInt();

        switch (varAire) {
            case 1:
                System.out.println("\nSelecciona l'habitació:");
                System.out.println("1- Menjador");
                System.out.println("2- Cuina");
                System.out.println("3- H1");
                System.out.println("4- H2");
                System.out.println("5- H3");
                System.out.println("6- Bany");
                System.out.print("Opció: ");
                int hab = j.nextInt();

                System.out.print("Escriu on/off: ");
                String onOff = j.next().toLowerCase();

                switch (hab) {
                    case 1:
                        aireMenjador = comprovarEstatLocal("Menjador", onOff, aireMenjador, "Aire acondicionat");
                    break;
                    case 2:
                        aireCuina = comprovarEstatLocal("Cuina", onOff, aireCuina, "Aire acondicionat");
                    break;
                    case 3:
                        aireH1 = comprovarEstatLocal("Habitacio 1", onOff, aireH1, "Aire acondicionat");
                    break;
                    case 4:
                        aireH2 = comprovarEstatLocal("Habitacio 2", onOff, aireH2, "Aire acondicionat");
                    break;
                    case 5:
                        aireH3 = comprovarEstatLocal("Habitacio 3", onOff, aireH3, "Aire acondicionat");
                    break;
                    case 6:
                        aireBany = comprovarEstatLocal("Bany", onOff, aireBany, "Aire acondicionat");
                    break;
                    default:
                        System.out.println("Habitacio no valida");
                        break;
                }
                break;
            case 2:
                System.out.print("\nEscriu on/off per tot l'aire condicionat: ");
                String accio = j.next().toLowerCase();
                aireMenjador = aireCuina = aireBany = aireH1 = aireH2 = aireH3 = accio;
                System.out.println("Tot l'aire condicionat s'ha posat " + accio + " correctament.");
            break;
            case 3:
                System.out.println("\nEstat actual de l'aire condicionat:");
                System.out.println("Menjador (" + aireMenjador + ")");
                System.out.println("Cuina (" + aireCuina + ")");
                System.out.println("H1 (" + aireH1 + ")");
                System.out.println("H2 (" + aireH2 + ")");
                System.out.println("H3 (" + aireH3 + ")");
                System.out.println("Bany (" + aireBany + ")");
            break;
            case 4:
                System.out.println("Tornant al menu principal.....");
            break;
            default:
                    System.out.println("Opcio no valida");
            break;
        }
        } catch (InputMismatchException e) {
            System.out.println("Error: introdueix un número vàlid!");
            j.nextLine(); // netejar buffer
        }
    }  while (varAire != 4);
}

public void controlarPersianes(Scanner j) {
    //var locals
    String  perMenjador = "off";
    String  perCuina = "off";
    String  perBany = "off";
    String  perH1 = "off";
    String  perH2 = "off";
    String  perH3 = "off";
    int varPersianes;

    do {
        System.out.println("\nMENÚ PERSIANES");
        System.out.println("1. Obrir/Tancar una persiana");
        System.out.println("2. Obrir/Tancar totes les persianes");
        System.out.println("3. Mostrar estat actual");
        System.out.println("4. Tornar al menú principal");
        System.out.print("Selecciona una opció: ");
        varPersianes = j.nextInt();

        switch (varPersianes) {
            case 1 :
                System.out.println("\nSelecciona l'habitació:");
                System.out.println("1- Menjador");
                System.out.println("2- Cuina");
                System.out.println("3- H1");
                System.out.println("4- H2");
                System.out.println("5- H3");
                System.out.println("6- Bany");
                System.out.print("Opció: ");
                int hab = j.nextInt();

                System.out.print("Escriu on/off (on = oberta / off = tancada): ");
                String onOff = j.next().toLowerCase();

                switch (hab) {
                    case 1:
                        perMenjador = comprovarEstatLocal("Menjador", onOff, perMenjador, "persiana");
                    break;
                    case 2:
                        perCuina = comprovarEstatLocal("Cuina", onOff, perCuina, "persiana");
                    break;
                    case 3:
                        perH1 = comprovarEstatLocal("H1", onOff, perH1, "persiana");
                    break;
                    case 4:
                        perH2 = comprovarEstatLocal("H2", onOff, perH2, "persiana");
                    break;
                    case 5:
                        perH3 = comprovarEstatLocal("H3", onOff, perH3, "persiana");
                    break;
                    case 6:
                        perBany = comprovarEstatLocal("Bany", onOff, perBany, "persiana");
                    break;
                    default: 
                    System.out.println("Habitació no vàlida!");
                    break;
                }
            break;
            case 2:
                System.out.print("\nEscriu on/off per totes les persianes: ");
                String accio = j.next().toLowerCase();
                perMenjador = perCuina = perBany = perH1 = perH2 = perH3 = accio;
                System.out.println("Totes les persianes s'han posat " + accio + " correctament.");
            break;
            case 3:
                System.out.println("\nEstat actual de les persianes:");
                System.out.println("Menjador (" + perMenjador + ")");
                System.out.println("Cuina (" + perCuina + ")");
                System.out.println("H1 (" + perH1 + ")");
                System.out.println("H2 (" + perH2 + ")");
                System.out.println("H3 (" + perH3 + ")");
                System.out.println("Bany (" + perBany + ")");
            break;
            case 4:
                System.out.println("Tornant al menú principal...");
            break;
            default:
                System.out.println("Opció no vàlida");
            break;
        }
    } while (varPersianes != 4);
}

public void controlarCortines(Scanner j) {
    //var locals
    String  corMenjador = "off";
    String  corCuina = "off";
    String  corBany = "off";
    String  corH1 = "off";
    String  corH2 = "off";
    String  corH3 = "off";
    int varCortines = 0; 

    do {
        System.out.println("\nMENÚ CORTINES");
        System.out.println("1. Obrir/Tancar una cortina");
        System.out.println("2. Obrir/Tancar totes les cortines");
        System.out.println("3. Mostrar estat actual");
        System.out.println("4. Tornar al menú principal");
        System.out.print("Selecciona una opció: ");
        varCortines = j.nextInt();

        switch (varCortines) {
            case 1 :
                System.out.println("\nSelecciona l'habitació:");
                System.out.println("1- Menjador");
                System.out.println("2- Cuina");
                System.out.println("3- H1");
                System.out.println("4- H2");
                System.out.println("5- H3");
                System.out.println("6- Bany");
                System.out.print("Opció: ");
                int hab = j.nextInt();

                System.out.print("Escriu on/off (on = oberta / off = tancada): ");
                String onOff = j.next().toLowerCase();

                switch (hab) {
                    case 1:
                        corMenjador = comprovarEstatLocal("Menjador", onOff, corMenjador, "persiana");
                    break;
                    case 2:
                        corCuina = comprovarEstatLocal("Cuina", onOff, corCuina, "persiana");
                    break;
                    case 3:
                        corH1 = comprovarEstatLocal("H1", onOff, corH1, "persiana");
                    break;
                    case 4:
                        corH2 = comprovarEstatLocal("H2", onOff, corH2, "persiana");
                    break;
                    case 5:
                        corH3 = comprovarEstatLocal("H3", onOff, corH3, "persiana");
                    break;
                    case 6:
                        corBany = comprovarEstatLocal("Bany", onOff, corBany, "persiana");
                    break;
                    default: 
                    System.out.println("Habitació no vàlida!");
                    break;
                }
            break;
            case 2:
                System.out.print("\nEscriu on/off per totes les persianes: ");
                String accio = j.next().toLowerCase();
                corMenjador = corCuina = corBany = corH1 = corH2 = corH3 = accio;
                System.out.println("Totes les persianes s'han posat " + accio + " correctament.");
            break;
            case 3:
                System.out.println("\nEstat actual de les persianes:");
                System.out.println("Menjador (" + corMenjador + ")");
                System.out.println("Cuina (" + corCuina + ")");
                System.out.println("H1 (" + corH1 + ")");
                System.out.println("H2 (" + corH2 + ")");
                System.out.println("H3 (" + corH3 + ")");
                System.out.println("Bany (" + corBany + ")");
            break;
            case 4:
                System.out.println("Tornant al menú principal...");
            break;
            default:
                System.out.println("Opció no vàlida");
            break;
        }
    } while (varCortines != 4);
}

public void controlarAltaveus(Scanner j) {
    //var locals
    String  altMenjador = "off";
    String  altCuina = "off";
    String  altBany = "off";
    String  altH1 = "off";
    String  altH2 = "off";
    String  altH3 = "off";
    int varAltaveus = 0;
    do {
        System.out.println("\nMENÚ ALTAVEUS");
        System.out.println("1. Encendre/Apagar un altaveu");
        System.out.println("2. Encendre/Apagar tots els altaveus");
        System.out.println("3. Mostrar estat actual");
        System.out.println("4. Tornar al menú principal");
        System.out.print("Selecciona una opció: ");
        varAltaveus = j.nextInt();

        switch (varAltaveus) {
            case 1 :
                System.out.println("\nSelecciona l'habitació:");
                System.out.println("1- Menjador");
                System.out.println("2- Cuina");
                System.out.println("3- H1");
                System.out.println("4- H2");
                System.out.println("5- H3");
                System.out.println("6- Bany");
                System.out.print("Opció: ");
                int hab = j.nextInt();

                System.out.print("Escriu on/off (on = ences / off = apagat): ");
                String onOff = j.next().toLowerCase();

                switch (hab) {
                    case 1:
                        altMenjador = comprovarEstatLocal("Menjador", onOff, altMenjador, "persiana");
                    break;
                    case 2:
                        altCuina = comprovarEstatLocal("Cuina", onOff, altCuina, "persiana");
                    break;
                    case 3:
                        altH1 = comprovarEstatLocal("H1", onOff, altH1, "persiana");
                    break;
                    case 4:
                        altH2 = comprovarEstatLocal("H2", onOff, altH2, "persiana");
                    break;
                    case 5:
                        altH3 = comprovarEstatLocal("H3", onOff, altH3, "persiana");
                    break;
                    case 6:
                        altBany = comprovarEstatLocal("Bany", onOff, altBany, "persiana");
                    break;
                    default: 
                    System.out.println("Habitació no vàlida!");
                    break;
                }
            break;
            case 2:
                System.out.print("\nEscriu on/off per totes les persianes: ");
                String accio = j.next().toLowerCase();
                altMenjador = altCuina = altBany = altH1 = altH2 = altH3 = accio;
                System.out.println("Totes les persianes s'han posat " + accio + " altrectament.");
            break;
            case 3:
                System.out.println("\nEstat actual de les persianes:");
                System.out.println("Menjador (" + altMenjador + ")");
                System.out.println("Cuina (" + altCuina + ")");
                System.out.println("H1 (" + altH1 + ")");
                System.out.println("H2 (" + altH2 + ")");
                System.out.println("H3 (" + altH3 + ")");
                System.out.println("Bany (" + altBany + ")");
            break;
            case 4:
                System.out.println("Tornant al menú principal...");
            break;
            default:
                System.out.println("Opció no vàlida");
            break;
        }
    } while (varAltaveus!= 4);
}

public String comprovarEstatLocal(String habitacio, String onOff, String estatActual, String tipus) {
    if (estatActual.equals(onOff)) {
        System.out.println("El " + tipus + " del " + habitacio + " ja està " + onOff + ".");
    } else {
        estatActual = onOff;
        System.out.println("El " + tipus + " del " + habitacio + " s'ha posat " + onOff + " correctament.");
    }
    return estatActual;
}

}
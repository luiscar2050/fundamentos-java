import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Ejercicios de Casteo");
            System.out.println("2. Ejercicios de Operadores de Asignación");
            System.out.println("3. Ejercicios de Operadores de Incremento y Decremento");
            System.out.println("4. Ejercicios Combinados");
            System.out.println("0. Salir");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    menuCasteo();
                    break;
                case 2:
                    menuOperadoresAsignacion();
                    break;
                case 3:
                    menuOperadoresIncrementoDecremento();
                    break;
                case 4:
                    menuEjerciciosCombinados();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (option != 0);

        scanner.close();
    }

    private static void menuCasteo() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Seleccione una opción de Casteo:");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Ejercicio 7");
            System.out.println("8. Ejercicio 8");
            System.out.println("9. Ejercicio 9");
            System.out.println("10. Ejercicio 10");
            System.out.println("0. Volver al menú principal");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    Main.casteo1();
                    break;
                case 2:
                    Main.casteo2();
                    break;
                case 3:
                    Main.casteo3();
                    break;
                case 4:
                    Main.casteo4();
                    break;
                case 5:
                    Main.casteo5();
                    break;
                case 6:
                    Main.casteo6();
                    break;
                case 7:
                    Main.casteo7();
                    break;
                case 8:
                    Main.casteo8();
                    break;
                case 9:
                    Main.casteo9();
                    break;
                case 10:
                    Main.casteo10();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (option != 0);
    }

    private static void menuOperadoresAsignacion() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Seleccione una opción de Operadores de Asignación:");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("0. Volver al menú principal");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    Main.asignacion1();
                    break;
                case 2:
                    Main.asignacion2();
                    break;
                case 3:
                    Main.asignacion3();
                    break;
                case 4:
                    Main.asignacion4();
                    break;
                case 5:
                    Main.asignacion5();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (option != 0);
    }

    private static void menuOperadoresIncrementoDecremento() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Seleccione una opción de Operadores de Incremento y Decremento:");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("0. Volver al menú principal");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    Main.incrementoDecremento1();
                    break;
                case 2:
                    Main.incrementoDecremento2();
                    break;
                case 3:
                    Main.incrementoDecremento3();
                    break;
                case 4:
                    Main.incrementoDecremento4();
                    break;
                case 5:
                    Main.incrementoDecremento5();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (option != 0);
    }

    private static void menuEjerciciosCombinados() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Seleccione una opción de Ejercicios Combinados:");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Ejercicio 7");
            System.out.println("8. Ejercicio 8");
            System.out.println("9. Ejercicio 9");
            System.out.println("10. Ejercicio 10");
            System.out.println("0. Volver al menú principal");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    Main.combinados1();
                    break;
                case 2:
                    Main.combinados2();
                    break;
                case 3:
                    Main.combinados3();
                    break;
                case 4:
                    Main.combinados4();
                    break;
                case 5:
                    Main.combinados5();
                    break;
                case 6:
                    Main.combinados6();
                    break;
                case 7:
                    Main.combinados7();
                    break;
                case 8:
                    Main.combinados8();
                    break;
                case 9:
                    Main.combinados9();
                    break;
                case 10:
                    Main.combinados10();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (option != 0);
    }
}
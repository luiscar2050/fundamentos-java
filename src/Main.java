import java.util.Scanner;

public class Main {

    // Funciones de Casteo
    public static void casteo1() {
        int x = (int) 5.89 + (int) 3.45;
        System.out.println("El resultado es: " + x);
    }

    public static void casteo2() {
        char c = 'A';
        int ASCII = (int) c;
        System.out.println("El resultado es: " + ASCII);
    }

    public static void casteo3() {
        double d = 100.04;
        long l = (long) d;
        int i = (int) l;
        System.out.println("El resultado es: " + i);
    }

    public static void casteo4() {
        String numero = "333";
        int num = Integer.parseInt(numero);
        System.out.println("El resultado es: " + num);
    }

    public static void casteo5() {
        int resultado = (int) (char) (byte) -1;
        System.out.println("El resultado es: " + resultado);
    }

    public static void casteo6() {
        int numero = 65;
        char myChar = (char) numero;
        System.out.println("El resultado es: " + myChar);
    }

    public static void casteo7() {
        System.out.println("En este ejercicio Si intentas asignar un long a un int sin casteo explícito, obtendrás un error de compilación porque long es de mayor tamaño que int y puede perder datos.");
    }

    public static void casteo8() {
        float dato = 3.19f;
        String str = Float.toString(dato);
        System.out.println("El resultado es: " + str);
    }

    public static void casteo9() {
        int res = (int) Math.round(3.7);
        System.out.println("El resultado es: " + res);
    }

    public static void casteo10() {
        byte b = 50;
        short s = b;
        System.out.println("El resultado es: " + s);
    }

    // Funciones de Operadores de Asignación
    public static void asignacion1() {
        int x = 10;
        x += 5;
        System.out.println("El resultado es: " + x);
    }

    public static void asignacion2() {
        int y = 5;
        int x = 5;
        y *= (x + 5);
        System.out.println("El resultado es: " + y);
    }

    public static void asignacion3() {
        int a = 15;
        a %= 4;
        System.out.println("El resultado es: " + a);
    }

    public static void asignacion4() {
        int x = 10;
        int y = 9;
        x += y;
        System.out.println("El resultado es: " + x);
    }

    public static void asignacion5() {
        int x = 5; // 0101 en binario
        System.out.println("Valor inicial de x es: " + x);
        x ^= 2; // Realiza la operación XOR bit a bit con 2 (0010 en binario)
        System.out.println("Valor de x después de x ^= 2 es: " + x);
        System.out.println("La operación x ^= 2 realiza una operación XOR bit a bit entre x y 2.");
    }

    // Funciones de Operadores de Incremento y Decremento
    public static void incrementoDecremento1() {
        int x = 5;
        int y = ++x;
        System.out.println("El valor de x es: " + x);
        System.out.println("El valor de y es: " + y);
    }

    public static void incrementoDecremento2() {
        int a = 5;
        System.out.println("El resultado es: " + a++);
        System.out.println("El resultado es: " + a);
    }

    public static void incrementoDecremento3() {
        int count = 10;
        count--;
        System.out.println("El resultado es: " + count);
    }

    public static void incrementoDecremento4() {
        System.out.println("++i incrementa el valor de i y luego devuelve el valor incrementado.");
        System.out.println("i++ devuelve el valor actual de i y luego incrementa i.");
    }

    public static void incrementoDecremento5() {
        int x = 3;
        x = x++;
        System.out.println("El resultado es: " + x);
    }

    // Funciones de Ejercicios Combinados
    public static void combinados1() {
        int i = 5;
        i += ++i + i++ + ++i;
        System.out.println("El resultado es: " + i);
    }

    public static void combinados2() {
        double d = 5.7;
        int i = (int) d;
        i++;
        System.out.println("El resultado es: " + i);
    }

    public static void combinados3() {
        double d = 5.7;
        int i = (int) d;
        i *= 2;
        System.out.println("El resultado es: " + i--);
        System.out.println("El resultado es: " + i);
    }

    public static void combinados4() {
        int num = 10;
        double result = num / 2.0;
        System.out.println("El resultado es: " + result);
    }

    public static void combinados5() {
        char c = 'X';
        c += 32;
        System.out.println("El resultado es: " + c);
    }

    public static void combinados6() {
        long l = 123456789L;
        short s = (short) l;
        s *= 3;
        System.out.println("El resultado es: " + s);
    }

    public static void combinados7() {
        int x = 10;
        x += (x++) + (++x);
        System.out.println("El resultado es: " + x);
    }

    public static void combinados8() {
        float f = 10.5f;
        byte b = (byte) f;
        b = (byte) (--b);
        System.out.println("El resultado es: " + b);
    }

    public static void combinados9() {
        int i = 257;
        byte b = (byte) i;
        System.out.println("El resultado es: " + b);
    }

    public static void combinados10() {
        double d = 7.8;
        int i = (int) d;
        i += 5;
        i++;
        System.out.println("El resultado es: " + i);
    }
}

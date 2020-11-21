import java.util.Scanner;
public class Practica3 {
    public static void main(String [] args) {
        //Práctica realizada por Natalia Cristóbal, curso 1A de DAW
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Sobre que tipo de ejercicio quieres resolver el ejercicio?");
        System.out.println("1-Estructura if");
        System.out.println("2-Estructura switch");

        /*  Primero hay que comprobar si la opción elegida es correcta, para ello analizaremos con if else
        si la estructura introducida es igual a 1 o 2, si no es así se dara un error  */
        int estructura = sc.nextInt();

        if (estructura == 1) {
            System.out.println("Elija el número de ejercicio que quieras resolver:");
            System.out.println("1-Par o impar");
            System.out.println("2-Sueldo anual e impuestos");
            System.out.println("5-Triángulo válido");
            System.out.println("6-Fiesta de marmotas");
            System.out.println("7-Notas");

            /*  La estructura introducida es válida, por ello procedemos a escanear el número del
            ejercicio y pondremos un switch para ejecutar las distintas operaciones si entran dentro de
            las opciones, en estas lo resolveremos con if  */

            int ejercicio = sc.nextInt();

            switch (ejercicio) {
                case 1:
                    //En este caso comprobaremos si el número es par mediante el resto que dé al dividir entre 2
                    System.out.println("Introduce un número:");
                    int n1 = sc.nextInt();
                    int resto = n1%2;
                        if (resto == 0) {
                            System.out.println("El número es par");
                        } else {
                            System.out.println("El número es impar");
                        }
                    break;

                case 2:
                    //Si el sueldo introducido es > a 9000 daremos unas instrucciones, usamos solo un if y un else
                    System.out.println("Introduce el sueldo anual:");
                    int sueldo = sc.nextInt();
                        if (sueldo>9000) {
                            System.out.println("Se debe pagar impuestos");
                        } else {
                            System.out.println("No se debe pagar impuestos");
                        }
                    break;

                case 5:
                    /* Aqui usaremos el else if para comprobar que todos los resultados que puede haber con la suma
                    de las variantes escaneadas con correctos o no */
                    System.out.println("Vamos a determinar si hay un triangulo." +
                            " Introduce el lado A:");
                    int A = sc.nextInt();
                    System.out.println("Introduce el lado B:");
                    int B = sc.nextInt();
                    System.out.println("Introduce el lado C:");
                    int C = sc.nextInt();
                        if (A + B > C) {
                            System.out.println("Sí");
                        } else if (A + C > B) {
                            System.out.println("Sí");
                        } else if (B + C > A) {
                            System.out.println("Sí");
                        } else{
                            System.out.println("No");
                        }
                    break;

                case 6:
                    /*  Usamos la estructura if/else para comprobar si el número de tazas entran dentro de los parámetros
                    y ponemos un boolean para determinar si es fin de semana o no */
                    System.out.println("Introduce el número de tazas de mantequilla de cacahuete:");
                    int tazas = sc.nextInt();
                    System.out.println("¿Es fin de semana (true o false)?");
                    boolean finde = sc.nextBoolean();
                    boolean exito = false;

                    if (finde) {
                        if (tazas >=15 && tazas <= 25) {
                            exito = true;
                        }
                    } else {
                        if (tazas >=10 && tazas <= 20) {
                            exito = true;
                        }
                    }
                    System.out.println(exito);
                    break;

                case 7:
                    // Comprobaremos si la variable introducida esta dentro de los valores establecidos en cada caso
                    System.out.println("Introduce la nota numérica (entre 0 y 10):" );
                    double nota = sc.nextDouble();
                    if (0>=nota && nota<3) {
                        System.out.println("MD");
                    } else if (3<=nota && nota<5) {
                        System.out.println("INS");
                    } else if (5<=nota && nota<6) {
                        System.out.println("SUF");
                    } else if (6<=nota && nota<7) {
                        System.out.println("B");
                    } else if (7<=nota && nota<9) {
                        System.out.println("N");
                    } else if (9<=nota && nota<=10){
                        System.out.println("SB");
                    } else {
                        System.out.println("Error, nota no válida");
                    }
                    break;

                default:
                    System.out.println("Error, el ejercicio " +ejercicio+ " no se encuentra en la lista");
            }


        } else if (estructura == 2) {
            System.out.println("Elija el número de ejercicio que quieras resolver:");
            System.out.println("2-Programa elegido");
            System.out.println("3-Del 1 al 9");
            System.out.println("4-Harry Potter");
            System.out.println("5-Subir o bajar");

            /*  La estructura introducida es válida, por ello procedemos a escanear el número del
            ejercicio y pondremos un switch para ejecutar las distintas operaciones si entran dentro de
            las opciones, en estas las resolveremos tambien con switch  */

            int ejercicio = sc.nextInt();

            switch (ejercicio) {
                case 2:
                    // Declararemos que solo "a" es la respuesta correcta, y los siguientes casos son incorrectos
                    System.out.println("Introduce en lenguaje de programación que estas estudiando (indica la letra):");
                    System.out.println("a. Java");
                    System.out.println("b. Kotlin");
                    System.out.println("c. Scala");
                    System.out.println("d. Python");

                    String letra = sc.next();

                        switch (letra) {
                            case "a":
                                System.out.println("¡Sí!");
                                break;
                            case "b":
                            case "c":
                            case "d":
                                System.out.println("¡No!");
                                break;
                            default:
                                System.out.println("Opción desconocida");
                                break;
                        }
                    break;

                case 3:
                    /* Aqui haremos que el escaner lea cadenas de caracteres del uno al nueve. Dependiendo de la cadena
                    se imprimira una respuesta u otra */
                    System.out.println("Escribe un número con letras (del 1 al 9):");
                    String numero = sc.next();

                    switch (numero) {
                        case "uno":
                            System.out.println("1");
                            break;
                        case "dos":
                            System.out.println("2");
                            break;
                        case "tres":
                            System.out.println("3");
                            break;
                        case "cuatro":
                            System.out.println("4");
                            break;
                        case "cinco":
                            System.out.println("5");
                            break;
                        case "seis":
                            System.out.println("6");
                            break;
                        case "siete":
                            System.out.println("7");
                            break;
                        case "ocho":
                            System.out.println("8");
                            break;
                        case "nueve":
                            System.out.println("9");
                            break;
                        default:
                            System.out.println("Número no válido");
                            break;
                    }
                    break;

                case 4:
                    /* Igual que el ejercicio anterior haremos que el escaner lea una cadena e imprima dependiendo
                    de cual sea, mostraremos las posibilidades que se pueden introducir */
                    System.out.println("Introduce tu casa de Howards:");
                    System.out.println("-Gryffindor");
                    System.out.println("-Hufflepuff");
                    System.out.println("-Slytherin");
                    System.out.println("-Ravenclaw");
                    String casa = sc.next();

                    switch (casa) {
                        case "Gryffindor" :
                            System.out.println("Valentía");
                            break;
                        case "Hufflepuff" :
                            System.out.println("Lealtad");
                            break;
                        case "Slytherin" :
                            System.out.println("Astucia");
                            break;
                        case "Ravenclaw" :
                            System.out.println("Intelecto");
                            break;
                        default:
                            System.out.println("No es una casa válida");
                            break;
                    }

                    break;

                case 5:
                    // Aqui introducideros el número de la opción que querramos ejercutar
                    System.out.println("Introduce el número de dirección:");
                    System.out.println("1- Arriba");
                    System.out.println("2- Abajo");
                    System.out.println("3- Izquierda");
                    System.out.println("4- Derecha");
                    System.out.println("0- No mover");
                    int direccion = sc.nextInt();

                    switch (direccion) {
                        case 1 :
                            System.out.println("Subir");
                            break;
                        case 2 :
                            System.out.println("Bajar");
                            break;
                        case 3 :
                            System.out.println("Mover a la izquierda");
                            break;
                        case 4 :
                            System.out.println("Mover a la derecha");
                            break;
                        case 0 :
                            System.out.println("No mover");
                            break;
                        default:
                            System.out.println("¡Error!");
                            break;
                    }

                    break;

                default:
                    System.out.println("Error, el ejercicio " +ejercicio+ " no se encuentra en la lista");
            }


        } else {
            // Al no ser válido el número escaneado escribimos la order de error
            System.out.println("Error, estructura no válida");
        }


    }
}

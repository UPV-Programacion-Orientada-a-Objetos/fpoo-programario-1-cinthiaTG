package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.Problema1.ProblemaUno;
import edu.upvictoria.fpoo.Problema2.ProblemaDos;
import edu.upvictoria.fpoo.Problema3.ProblemaTres;
import edu.upvictoria.fpoo.Problema4.ProblemaCuatro;
import edu.upvictoria.fpoo.Problema5.ProblemaCinco;
import edu.upvictoria.fpoo.Problema6.ProblemaSeis;
import edu.upvictoria.fpoo.Problema7.ProblemaSiete;
import edu.upvictoria.fpoo.Problema8.ProblemaOcho;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    public void printMenu() {
        System.out.println("#-------------PROBLEMARIO 1----------#");
        System.out.println("1) Suma de dos números int double");
        System.out.println("2) promedio de calificaciones");
        System.out.println("3) Área de rectángulo");
        System.out.println("4) Área de circulo");
        System.out.println("5) Área de un terreno con la forma de la figura A");
        System.out.println("6) Área de un cono de nieve a partir del radio e hipotenusa");
        System.out.println("7) Ganancias de un productor de leche de litros a galones");
        System.out.println("8) Distancia entre dos puntos");
        System.out.println("9) Sueldo semanal de un trabajador con base a sus horas trabajadas.");
        System.out.println("10) Modista- medidas de la tela de Metros->Pulgadas.");
        System.out.println("11) Conagua- pago por persona.");
        System.out.println("12) Área de un triángulo");
        System.out.println("13) Conversiones de peso a dólar");
        System.out.println("14) Edad del personal");
        System.out.println("15) Estacionamiento");
        System.out.println("16) Pinturas");
        System.out.println("17) Hipotenusa");
        System.out.println("18) Autobuses \"La curva loca\"");
        System.out.println("19) Tiempo en bicicleta");
        System.out.println("20) Costo de llamada telefónica");
        System.out.println("21) CONAGUA");
        System.out.println("22) Compañía de luz y sombras CLS");
        System.out.println("23) Descuento e IVA");
        System.out.println("24) Ahorro");
        System.out.println("25) Cheques");
        System.out.println("26) Concepto de monto");
        System.out.println("27) Salir");
    }

    public void selectOpc() {
        try (BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in))) {
            int opc = 0;
            printMenu();
            opc = Integer.parseInt(scanner.readLine());
            switch (opc) {
                case 1:
                    ProblemaUno ejercicio1 = new ProblemaUno();
                    break;
                case 2:
                    ProblemaDos ejercicio2 = new ProblemaDos();
                    break;
                case 3:
                    ProblemaTres ejercicio3 = new ProblemaTres();
                    break;
                case 4:
                    ProblemaCuatro ejercicio4 = new ProblemaCuatro();
                    break;
                case 5:
                    ProblemaCinco ejercicio5 = new ProblemaCinco();
                    break;
                case 6:
                    ProblemaSeis ejercicio6 = new ProblemaSeis();
                    break;
                case 7:
                    ProblemaSiete ejercicio7 = new ProblemaSiete();
                    break;
                case 8:
                    ProblemaOcho ejercicio8 = new ProblemaOcho();
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}

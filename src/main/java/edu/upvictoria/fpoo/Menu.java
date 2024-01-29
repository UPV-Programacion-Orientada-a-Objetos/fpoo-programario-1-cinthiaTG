package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.Problema1.ProblemaUno;
import edu.upvictoria.fpoo.Problema10.ProblemaDiez;
import edu.upvictoria.fpoo.Problema11.ProblemaOnce;
import edu.upvictoria.fpoo.Problema12.ProblemaDoce;
import edu.upvictoria.fpoo.Problema14.ProblemaCatorce;
import edu.upvictoria.fpoo.Problema15.ProblemaQuince;
import edu.upvictoria.fpoo.Problema16.ProblemaDieciseis;
import edu.upvictoria.fpoo.Problema17.ProblemaDiecisiete;
import edu.upvictoria.fpoo.Problema18.ProblemaDieciocho;
import edu.upvictoria.fpoo.Problema19.ProblemaDiecinueve;
import edu.upvictoria.fpoo.Problema2.ProblemaDos;
import edu.upvictoria.fpoo.Problema20.ProblemaVeinte;
import edu.upvictoria.fpoo.Problema21.ProblemaVeintiuno;
import edu.upvictoria.fpoo.Problema22.ProblemaVeintidos;
import edu.upvictoria.fpoo.Problema23.ProblemaVeintitres;
import edu.upvictoria.fpoo.Problema24.ProblemaVeinticuatro;
import edu.upvictoria.fpoo.Problema25.ProblemaVeinticinco;
import edu.upvictoria.fpoo.Problema26.ProblemaVeintiseis;
import edu.upvictoria.fpoo.Problema3.ProblemaTres;
import edu.upvictoria.fpoo.Problema4.ProblemaCuatro;
import edu.upvictoria.fpoo.Problema5.ProblemaCinco;
import edu.upvictoria.fpoo.Problema6.ProblemaSeis;
import edu.upvictoria.fpoo.Problema7.ProblemaSiete;
import edu.upvictoria.fpoo.Problema8.ProblemaOcho;
import edu.upvictoria.fpoo.Problema9.ProblemaNueve;
import edu.upvictoria.fpoo.problema13.ProblemaTrece;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    public void MostrarMenu() {
        System.out.println("#-------------PROBLEMARIO 1------------#");
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
        System.out.println("13) convertir peso a dólar");
        System.out.println("14) Edad personal");//
        System.out.println("15) Estacionamiento");
        System.out.println("16) Pinturas");
        System.out.println("17) Hipotenusa");
        System.out.println("18) Autobuses");
        System.out.println("19) Tiempo en bicicleta");
        System.out.println("20) Costo de llamada telefónica");
        System.out.println("21) Conagua");
        System.out.println("22) Compañía de luz");
        System.out.println("23) Descuento e IVA");
        System.out.println("24) Ahorro");
        System.out.println("25) Cheques");
        System.out.println("26) Montos desglosados");
    }

    public void Opcion() {
        try (BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in))) {
            int opc = 0;
            MostrarMenu();
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
                case 9:
                    ProblemaNueve ejercicio9 = new ProblemaNueve();
                    break;
                case 10:
                    ProblemaDiez ejercicio10 = new ProblemaDiez();
                    break;
                case 11:
                    ProblemaOnce ejercicio11 = new ProblemaOnce();
                    break;
                case 12:
                    ProblemaDoce ejercicio12 = new ProblemaDoce();
                    break;
                case 13:
                    ProblemaTrece ejercicio13 = new ProblemaTrece();
                    break;
                case 14:
                    ProblemaCatorce ejercicio14 = new ProblemaCatorce();
                    break;
                case 15:
                    ProblemaQuince ejercicio15 = new ProblemaQuince();
                    break;
                case 16:
                    ProblemaDieciseis ejercicio16 = new ProblemaDieciseis();
                    break;
                case 17:
                    ProblemaDiecisiete ejercicio17 = new ProblemaDiecisiete();
                    break;
                case 18:
                    ProblemaDieciocho ejercicio18 = new ProblemaDieciocho();
                    break;
                case 19:
                    ProblemaDiecinueve ejercicio19 = new ProblemaDiecinueve();
                    break;
                case 20:
                    ProblemaVeinte ejercicio20 = new ProblemaVeinte();
                    break;
                case 21:
                    ProblemaVeintiuno ejercicio21 = new ProblemaVeintiuno();
                    break;
                case 22:
                    ProblemaVeintidos ejercicio22 = new ProblemaVeintidos();
                    break;
                case 23 :
                    ProblemaVeintitres ejercicio23 = new ProblemaVeintitres();
                    break;
                case 24:
                    ProblemaVeinticuatro ejercicio24 = new ProblemaVeinticuatro();
                    break;
                case 25:
                    ProblemaVeinticinco ejercicio25 = new  ProblemaVeinticinco();
                    break;
                case 26:
                    ProblemaVeintiseis ejercicio26 = new ProblemaVeintiseis();
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}

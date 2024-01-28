package edu.upvictoria.fpoo.Problema4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu{
    public Menu() {

    }

     public void main(int opc) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Elige la forma de entrada de los datos:");
        System.out.println("1) Entero");
        System.out.println("2) Doble");
        String input = bufer.readLine();
        int valor = Integer.parseInt(input);
        if (opc == 1) {
            calcular_radio(valor);
        } else {
            calcular_diametro(valor);
        }
    }

    public void calcular_radio(int opc) throws IOException {
        if (opc == 1) {
            int a = opc_1();
            System.out.println(AreaCirculo.calcularAreaCirculo(a));

        } else {
            double b = opc_2();
            System.out.println(AreaCirculo.calcularAreaCirculo(b));

        }
    }

    public void calcular_diametro(int opc) throws IOException {

        if (opc == 1) {
            int a = opc_1();
            System.out.println(AreaCirculo.calcularAreaCirculoConDiametro(a));
        } else {
            double b = opc_2();
            System.out.println(AreaCirculo.calcularAreaCirculoConDiametro(b));

        }
    }

    public double opc_2() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese el valor: ");
        String input = bufer.readLine();
        double valor = Double.parseDouble(input);
        return valor;
    }

    public int opc_1() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese el valor: ");
        String input = bufer.readLine();
        int valor = Integer.parseInt(input);
        return valor;
    }

}

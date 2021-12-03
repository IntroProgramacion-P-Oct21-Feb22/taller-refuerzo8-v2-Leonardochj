/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);
    
    String nombre_cliente;
    int cedula_cliente;
    int precio_individual;
    int valor_total1;
    int valor_total2;
    int valor_total3;
    int valor_total4;
    int numero_computadora;
    int tipo_cliente;
    double valor_total;
    int cantidad_computadora;
    double descuento1;
    double descuento2;
    double descuento3;
    double descuento4;
    int porcentaje1;
    int porcentaje2;
    int porcentaje3;
    int porcentaje4;
    porcentaje1 = 1;
    porcentaje2 = 5;
    porcentaje3 = 10;
    porcentaje4 = 15;
    String acumulador;
    
    System.out.println("Ingresar el nombre del empleado");
    nombre_cliente = entrada.nextLine();
    System.out.println("Ingresar la cedula");
    cedula_cliente = entrada.nextInt();
    System.out.println("Ingresar el tipo de cliente");
    tipo_cliente = entrada.nextInt();
    System.out.println("Ingresar el numero de la computadora");
    numero_computadora = entrada.nextInt();
    System.out.println("Ingresar la cantidad de la computadora");
    cantidad_computadora = entrada.nextInt();
    System.out.println("Ingresar el precio individual");
    precio_individual = entrada.nextInt();
    
    valor_total = precio_individual*cantidad_computadora;       
    
    if ((numero_computadora == 1) && (tipo_cliente == 1)){
        valor_total1 = precio_individual*cantidad_computadora;
        descuento1 = (valor_total1*porcentaje1)/100;
        valor_total = valor_total1 - descuento1;
    }
    if ((numero_computadora == 1) && (tipo_cliente == 2)){
        valor_total2 = precio_individual * cantidad_computadora;
        descuento2 = (valor_total2*porcentaje2)/100;
        valor_total = valor_total2 - descuento2;
    }
    if ((numero_computadora == 1) && (tipo_cliente == 3)){
        valor_total3 = precio_individual * cantidad_computadora;
        descuento3 = (valor_total3*porcentaje3)/100;
        valor_total = valor_total3 - descuento3;
    }
    if ((numero_computadora == 1) && (tipo_cliente == 4)){
        valor_total4 = precio_individual * cantidad_computadora;
        descuento4 = (valor_total4*porcentaje4)/100;
        valor_total = valor_total4 - descuento4;
    }
    if ((numero_computadora == 2) && (tipo_cliente == 1)){
        valor_total1 = precio_individual * cantidad_computadora;
        descuento1 = (valor_total1*porcentaje1)/100;
        valor_total = valor_total1 - descuento1;
    }
    if ((numero_computadora == 2) && (tipo_cliente == 2)){
        valor_total2 = precio_individual * cantidad_computadora;
        descuento2 = (valor_total2*porcentaje2)/100;
        valor_total = valor_total2 - descuento2;
    }
    if ((numero_computadora == 2) && (tipo_cliente == 3)){
        valor_total3 = precio_individual * cantidad_computadora;
        descuento3 = (valor_total3*porcentaje3)/100;
        valor_total = valor_total3 - descuento3;
    }
    if ((numero_computadora == 2) && (tipo_cliente == 4)){
        valor_total4 = precio_individual * cantidad_computadora;
        descuento4 = (valor_total4*porcentaje4)/100;
        valor_total = valor_total4 - descuento4;
    }
    if ((numero_computadora == 3) && (tipo_cliente == 1)){
        valor_total1 = precio_individual * cantidad_computadora;
        descuento1 = (valor_total1*porcentaje1)/100;
        valor_total = valor_total1 - descuento1;
    }
    if ((numero_computadora == 3) && (tipo_cliente == 2)){
        valor_total2 = precio_individual * cantidad_computadora;
        descuento2 = (valor_total2*porcentaje2)/100;
        valor_total = valor_total2 - descuento2;
    }
    if ((numero_computadora == 3) && (tipo_cliente == 3)){
        valor_total3 = precio_individual * cantidad_computadora;
        descuento3 = (valor_total3*porcentaje3)/100;
        valor_total = valor_total3 - descuento3;
    }
    if ((numero_computadora == 3) && (tipo_cliente == 4)){
        valor_total4 = precio_individual * cantidad_computadora;
        descuento4 = (valor_total4*porcentaje4)/100;
        valor_total = valor_total4 - descuento4;
    }
    
    acumulador = String.format("%s\n%d\n%d\n%d\n%d\n%d\n", nombre_cliente, 
            cedula_cliente, tipo_cliente, numero_computadora, 
            cantidad_computadora, precio_individual);
    System.out.printf("Dato de la compra son:\n%s\n", acumulador);
    System.out.println("El valor a pagar es:" + valor_total);
    
    }
    
}

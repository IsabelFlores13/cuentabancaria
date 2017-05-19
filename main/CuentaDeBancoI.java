/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import cuentadebanco.CuentaDeAhorros;
import cuentadebanco.CuentaDeBanco;
import cuentadebanco.CuentaDeCheques;
import java.util.Scanner;

/**
 *
 * @author The_Flowers
 */
public class CuentaDeBancoI {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la opcion , ¿Que cuenta desea abrir?");
            System.out.println("1 ->  Cuenta Bancaria");
            System.out.println("2 ->  Cuenta de Ahorro");
            System.out.println("3 ->  Cuenta de Cheques");
            int cuenta = entrada.nextInt();
        
        if (cuenta == 1){    
        System.out.println("Numero de la cuenta. ");
        int numeroDeCuenta = entrada.nextInt();
        System.out.println("Nombre del cliente. ");
        String cliente = entrada.next();
       CuentaDeBanco cuentaBancaria = 
                new CuentaDeBanco(numeroDeCuenta,cliente);
        int contador = 0;
        while (contador == 0){
            System.out.println("Ingrese la opcion , ¿Que accion desea realizar?");
            System.out.println("1 -> Depositar");
            System.out.println("2 -> Retirar");
            System.out.println("3 ->  Finalizar");
            int accion = entrada.nextInt();
            if (accion == 1){
                System.out.println("Ingresa el monto a depositar");
                double cantidad = entrada.nextDouble();
                cuentaBancaria.Depositar(cantidad);
            }
            if (accion == 2){
                System.out.println("Ingresa el monto a retirar");
                double cantidad = entrada.nextDouble();
                cuentaBancaria.Retirar(cantidad);
            }
            if (accion == 3){
                System.out.println("Fin");
                contador = 1;
            }
            double saldo = cuentaBancaria.getSaldo();
            System.out.println(+saldo);
            }   
        }
        
        if(cuenta == 2){
            System.out.println("Numero de la cuenta :  ");
            int numeroDeCuenta = entrada.nextInt();
            System.out.println("Nombre del cliente : ");
            String cliente = entrada.next();
            CuentaDeAhorros nuevaCuenta = 
                    new CuentaDeAhorros(numeroDeCuenta,cliente);
            
            System.out.println(nuevaCuenta.getSaldo());
           nuevaCuenta.Depositar(200);
            System.out.println(nuevaCuenta.getSaldo());
            nuevaCuenta.corteMensual();
            System.out.println(nuevaCuenta.getSaldo());    
            nuevaCuenta.Retirar(500);
            System.out.println(nuevaCuenta.getSaldo());
            nuevaCuenta.corteMensual();
            System.out.println(nuevaCuenta.getSaldo());
        }
        
        if (cuenta == 3){    
        System.out.println("Numero de la cuenta : ");
        int numeroDeCuenta = entrada.nextInt();
        System.out.println("Nombre del cliente. : ");
        String cliente = entrada.next();
        CuentaDeCheques cuentaDeCheques = 
                new CuentaDeCheques(numeroDeCuenta,cliente);
        int contador = 0;
        while (contador == 0){
            System.out.println("Ingrese la opcion , ¿Que accion desea realizar?");
            System.out.println("1 ->  Depositar");
            System.out.println("2 ->  Retirar");
            System.out.println("3 ->  Finalizar");
            int accion = entrada.nextInt();
            if (accion == 1){
                System.out.println("ingresa el monto a deposito?");
                double cantidad = entrada.nextDouble();
                cuentaDeCheques.Depositar(cantidad);
            }
            if (accion == 2){
                System.out.println("ingresa el monto a retiro");
                double cantidad = entrada.nextDouble();
                cuentaDeCheques.Retirar(cantidad);
            }
            if (accion == 3){
                System.out.println("Fin");
                contador = 1;
            }
            double saldo = cuentaDeCheques.getSaldo();
            System.out.println(+saldo);
            }   
        }
    }
    
}      

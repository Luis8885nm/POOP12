/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

/**
 *
 * @author poo01alu34
 */
public class POOP12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        HiloT primero = new HiloT("Primer hilo");
        primero.start();
        new HiloT("Segundo hilo").start();
        
        new Thread(new HiloR(), "Tercer Hilo").start();
        new Thread(new HiloR(), "Cuarto hilo").start();
        */
         /*
        new CuentaBancaria("Retiro 1").start();
        new CuentaBancaria("Retiro 2").start();
        new CuentaBancaria("Deposito 1").start();
        new CuentaBancaria("Deposito 2").start();
        */
        
        for (int i = 0; i < 50; i++) {
            
            new CuentaBancaria("Retiro 1").start();
            new CuentaBancaria("Retiro 2").start();
            new CuentaBancaria("Deposito 1").start();
            new CuentaBancaria("Deposito 2").start();
            
        }
        
        //hacer al menos 50 depositos y retiros para la actividad extra
        
        
        
        
        
    }
    
}

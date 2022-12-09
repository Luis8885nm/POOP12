/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author poo01alu34
 */
public class CuentaBancaria extends Thread{
    
    private static double saldo;

    public CuentaBancaria(String name) {
        super(name);
        saldo = 0;
    }

    public static double consultarSaldo() {
        return saldo;
    }
    
    public synchronized void depositarDinero(double monto){
        saldo+=monto;
        System.out.println("Depositando... Saldo: $" + saldo);
        notifyAll();
    }
    
    public synchronized void retirarDinero(double monto){
        if(monto>saldo){
            System.out.println(getName()+" debe esperar un deposito Saldo: "+saldo);
            try {
                sleep(5000); //mitiga el proceso para que haya mas posibilidad de que los depositantes si puedan depositar 
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }else{
            saldo-=monto; 
            System.out.println(getName()+" extrajo la cantidad " + monto + "Saldo actual: " + saldo);
        }
        notifyAll();
    }
    
    public void run(){
        if(getName().equals("Deposito 1")||getName().equals("Deposito 2"))
            this.depositarDinero(100);
        else
            this.retirarDinero(50);
    }
    
    
    
    
    
    
}

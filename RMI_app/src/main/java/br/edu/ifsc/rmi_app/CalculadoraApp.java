/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.rmi_app;

import br.edu.ifsc.rmi_interface.CalculadoraInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author aluno
 */
public class CalculadoraApp extends UnicastRemoteObject implements CalculadoraInterface {

    public CalculadoraApp()throws RemoteException{
        
    }
    
    public int soma(int a, int b) throws RemoteException {
        System.out.println("Somando: "+ (a + b));
        return a + b;
    }

    public int sub(int a, int b) throws RemoteException {
         System.out.println("Subtraindo: "+ (a - b));
        return a - b;
    }

    public int multi(int a, int b) throws RemoteException {
         System.out.println("Multiplicando: "+ (a * b));
        return a * b;
    }

    public double div(int a, int b) throws RemoteException {
         System.out.println("Dividindo: "+ (a / b));
        return a / b;
    }

}

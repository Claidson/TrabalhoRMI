/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.rmi_server;

import br.edu.ifsc.rmi_app.CalculadoraApp;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author aluno
 */
public class CalcServer {
    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.createRegistry(1099);
            CalculadoraApp calc = new CalculadoraApp();
            reg.rebind("calculadora", calc);
            System.out.println("Servidor calculadora pronto...");
            
        } catch (Exception ex) {
        }
    }
}

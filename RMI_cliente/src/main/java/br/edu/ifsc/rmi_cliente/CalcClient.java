/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.rmi_cliente;

import br.edu.ifsc.rmi_interface.CalculadoraInterface;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author aluno
 */
public class CalcClient {

    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.getRegistry("127.0.0.1", 1099);
            CalculadoraInterface calc = (CalculadoraInterface) reg.lookup("calculadora");
            System.out.println("1 + 1: " + calc.soma(1, 1));
            System.out.println("1 - 1: " + calc.sub(1, 1));
            System.out.println("1 * 1: " + calc.multi(1, 1));
            System.out.println("1 / 1: " + calc.div(1, 1));

        } catch (Exception ex) {
        }
    }
}

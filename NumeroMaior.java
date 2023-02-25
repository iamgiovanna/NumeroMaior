/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maiornumero;
import javax.swing.JOptionPane;

/**
 *
 * @author Giovanna_aluno
 */
public class NumeroMaior {
    public static void main(String [] args) {
    int n1, n2;
    
    n1 =  Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
    
    if (n1>n2){
    
         JOptionPane.showMessageDialog(null, "O número " +n1+ " é maior que o número " +n2);
    }
    else{
    
        JOptionPane.showMessageDialog(null, " O número " + n2+ " é maior que o número " +n1);
    }
    }
}

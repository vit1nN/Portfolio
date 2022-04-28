package soluções;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Soluções {
    public static void main(String[] args) {
        
        //Concentração Comum (C)
        double m1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de m1:"));
        double V = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de V:"));
        double C = m1/V;
        JOptionPane.showMessageDialog(null, "A Concentração Comum é: "+C+" g/L");
        
        //Título (T)
        m1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de m1:"));
        double m2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de m2:"));
        double T = m1/(m1+m2);
        double T2 = 100*T;
        DecimalFormat f = new DecimalFormat("0.0");
        JOptionPane.showMessageDialog(null, "O Título é: "+f.format(T)+" e o Título em porcentagem é: "+f.format(T2)+"%");
        
        //Molaridade (Mr)
        m1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de m1:"));
        double M1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de M1:"));
        V = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de V:"));
        double Mr = m1/m1*V;
        JOptionPane.showMessageDialog(null, "A Molaridade é: "+Mr+" mol/L");
        
        //Fração molar do soluto (X1)
        
    }
    
}
//código pela metade, falta terminar

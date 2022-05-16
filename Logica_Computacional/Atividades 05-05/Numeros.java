package numeros;
import javax.swing.JOptionPane;

public class Numeros {
    public static void main(String[] args) {
        String numero1 = JOptionPane.showInputDialog("Digite o valor do primeiro número escolhido:");
        int a = Integer.parseInt(numero1);
        String numero2 = JOptionPane.showInputDialog("Digite o valor do segundo número escolhido:");
        int b = Integer.parseInt(numero2);
        String numero3 = JOptionPane.showInputDialog("Digite o valor do terceiro número escolhido:");
        int c = Integer.parseInt(numero3);
        String numero4 = JOptionPane.showInputDialog("Digite o valor do quarto número escolhido:");
        int d = Integer.parseInt(numero4);
    quadrado(a, b, c, d);
    }
    public static void quadrado(int a, int b, int c, int d){
        int q1 = a*a;
        int q2 = b*b;
        int q3 = c*c;
        int q4 = d*d;
    if(q3 >= 1000){
        JOptionPane.showMessageDialog(null, "O valor do quadrado do terceiro número é "+q3);  
        }
    else{
    JOptionPane.showMessageDialog(null, a+" Foi o primeiro número escolhido e o seu quadrado é "+q1);
    JOptionPane.showMessageDialog(null, b+" Foi o segundo número escolhido e o seu quadrado é "+q2);
    JOptionPane.showMessageDialog(null, c+" Foi o terceiro número escolhido e o seu quadrado é "+q3);
    JOptionPane.showMessageDialog(null, d+" Foi o segundo número escolhido e o seu quadrado é "+q4);
        }
    }        
}

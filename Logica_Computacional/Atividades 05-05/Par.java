package par;
import javax.swing.JOptionPane;

public class Par {
    public static void main(String[] args) {
    String a = JOptionPane.showInputDialog("Digite um número:");
    int b = Integer.parseInt(a);
    if(b % 2 == 0){
        JOptionPane.showMessageDialog(null, "O número escolhido é par");
        }
    else{
        JOptionPane.showMessageDialog(null, "O seu número é ímpar");
        }
    if(b < 0){
        JOptionPane.showMessageDialog(null, "O número escolhido é negativo");
    }
    else{
        JOptionPane.showMessageDialog(null, "O seu número é positivo");
        }
    }  
}

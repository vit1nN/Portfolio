package algoritmoinfo;
import javax.swing.JOptionPane;

public class AlgoritmoInfo {
    
    public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "Iai Campeão");
    String nome = JOptionPane.showInputDialog("Qual o seu nome?");
    String idade = JOptionPane.showInputDialog("E quantos anos você tem?");
    String endereço = JOptionPane.showInputDialog("E mora aonde?");
    int fim = JOptionPane.showConfirmDialog(null,"Então ta, "+nome+" você tem "+idade+" anos e mora na "+endereço+". Certo?");
    
    switch(fim){
        case 0:
        JOptionPane.showMessageDialog(null, "Que maravilha! Um prazer conhecê-lo");
        break;
        case 1:
        Object[] options = {"Nome", "Idade", "Endereço", "Todas"};
        int inicio = JOptionPane.showOptionDialog(null, "Qual informação você deseja alterar?", "Início", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        switch(inicio){
            case 0:
            String nome2 = JOptionPane.showInputDialog("Qual o seu nome?");
            JOptionPane.showMessageDialog(null, "Maravilha "+nome2+", você tem "+idade+" anos e mora na "+endereço+".");
            break;
            case 1:
            String idade2 = JOptionPane.showInputDialog("Qual sua idade?");
            JOptionPane.showMessageDialog(null, "Maravilha "+nome+", você tem "+idade2+" anos e mora na "+endereço+".");
            break;
            case 2:
            String endereço2 = JOptionPane.showInputDialog("Qual seu endereço?");
            JOptionPane.showMessageDialog(null, "Maravilha "+nome+", você tem "+idade+" anos e mora na "+endereço2+".");
            break;
            case 3:
            String nome3 = JOptionPane.showInputDialog("Qual o seu nome?");
            String idade3 = JOptionPane.showInputDialog("E quantos anos você tem?");
            String endereço3 = JOptionPane.showInputDialog("E mora aonde?");
            int fim3 = JOptionPane.showConfirmDialog(null,"Então ta, "+nome3+" você tem "+idade3+" anos e mora na "+endereço3+". Certo?");
            break;
                
        }
        break;
        
        }
    }
}
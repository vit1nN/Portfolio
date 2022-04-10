package testeaula2;
import javax.swing.JOptionPane;

public class TesteAula2{
    public static void main(String[] args){
    JOptionPane.showMessageDialog(null, "Bem Vindo!");
    JOptionPane.showMessageDialog(null, "As opções de conta são: adição, subtração, multiplicação e divisão");
    String n = JOptionPane.showInputDialog("Qual conta você deseja fazer?");

    if(n.equals("adição")){
            String e = JOptionPane.showInputDialog("Digite o primeiro valor da adição: ");
            int a = Integer.parseInt(e) ;
            String q = JOptionPane.showInputDialog("Digite o segundo valor da adição: ");
            int b = Integer.parseInt(q) ;
        adição(a, b);
        }
    if(n.equals("subtração")){
            String e = JOptionPane.showInputDialog("Digite o valor a ser subtraído: ");
            int a = Integer.parseInt(e) ;
            String q = JOptionPane.showInputDialog("Digite o valor a subtrair: ");
            int b = Integer.parseInt(q) ;
        subtração(a, b);
        }
    if(n.equals("multiplicação")){
            String e = JOptionPane.showInputDialog("Digite o primeiro valor a multiplicar: ");
            int a = Integer.parseInt(e) ;
            String q = JOptionPane.showInputDialog("Digite o segundo valor a multiplicar: ");
            int b = Integer.parseInt(q) ;
        multiplicação(a, b);
        }
    if(n.equals("divisão")){
            String e = JOptionPane.showInputDialog("Digite o valor a ser divido: ");
            int a = Integer.parseInt(e) ;
            String q = JOptionPane.showInputDialog("Digite o valor a dividir: ");
            int b = Integer.parseInt(q) ;
        divisão(a, b);
        }
        JOptionPane.showMessageDialog(null, "Ótimo!");
            int bla = JOptionPane.showConfirmDialog(
        null, 
        "Mais alguma coisa em que posso ajudar?",
        "Continua",
        JOptionPane.YES_NO_OPTION);
            
        switch(bla){
            case 0: JOptionPane.showMessageDialog(null, "SAI DESSA EM DOIDO, JÁ FIZ UM MONTE DE COISA PRA TI EU EM");
            break;
            case 1: JOptionPane.showMessageDialog(null, "Perfeito, qualquer coisa estou a disposição!");
            break;
        }
    }
    
    public static void adição(int a, int b){
        int c = a+b;
            JOptionPane.showMessageDialog(null, "O resultado da sua adição é "+c);           
    } 
    
    public static void subtração(int a, int b){
        int c = a-b;
            JOptionPane.showMessageDialog(null, "O resultado da sua subtração é "+c);           
    }  
    
     public static void multiplicação(int a, int b){
        int c = a*b;
            JOptionPane.showMessageDialog(null, "O resultado da sua multiplicação é "+c);           
    } 
     
     public static void divisão(int a, int b){
        double c = (double)a/b;
            JOptionPane.showMessageDialog(null, "O resultado da sua divisão é "+c);           
    }  
}
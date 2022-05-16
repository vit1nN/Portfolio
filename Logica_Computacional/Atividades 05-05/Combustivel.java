package combustivel;

import javax.swing.JOptionPane;

public class Combustivel {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bom dia, Boa Tarde, Boa Noite!");
        JOptionPane.showMessageDialog(null, "Seja bem vindo ao sistema de calculo com gastos em combustível.");
        String km = JOptionPane.showInputDialog("Qual a distância a ser percorrida pelo veículo? (em km)");
        int a = Integer.parseInt(km);
        String kmlitro = JOptionPane.showInputDialog("Qual o consumo do veículo em km/litro?");
        int b = Integer.parseInt(kmlitro);
        String preço = JOptionPane.showInputDialog("Por fim, qual o valor do preço do Litro do combustível?");
        double c = Double.parseDouble(preço);
        calculo(a, b, c);
    }
    public static void calculo(int a, int b, double c){
        double d = a/b*c;
        JOptionPane.showMessageDialog(null, "O preço a ser pago em combustível nesse trajeto é de R$"+d);
        
    }   
}

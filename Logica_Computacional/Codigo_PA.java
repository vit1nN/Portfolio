import java.util.Scanner; //Importa o Scanner
public class Main{
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in); //Cria e nomeia o Scanner. Faz importar dados
       
        System.out.println("Insira a variável que deseja calcular:");
        System.out.println("|1 para An|2 para A1|3 para R|4 para N|");
       
        int resposta = entrada.nextInt(); //Resposta = entrada de dados
       
        if (resposta == 1){ //Se a resposta for igual a 1, ...
            System.out.print("Insira o valor de A1: ");
            int a1 = entrada.nextInt(); // Entrada de dados para A1
            System.out.print("Insira o valor de N: ");
            int n = entrada.nextInt(); // Entrada de dados para N
            System.out.print("Insira o valor de R: ");
            int r = entrada.nextInt(); // Entrada de dados para R
            int an = a1 + (n-1)*r; // Fórmula utilizada
            System.out.println(); // Mostrará o resultado (+an)
            System.out.println("O valor de An é: "+an);}

        else if (resposta == 2){ //Caso contrário, se a resposta for igual a 2, ...
            System.out.print("Insira o valor de An: ");
            int an = entrada.nextInt();
            System.out.print("Insira o valor de N: ");
            int n = entrada.nextInt();
            System.out.print("Insira o valor de R: ");
            int r = entrada.nextInt();
            int a1 = an - (n-1)*r;
            System.out.println();
            System.out.println("O valor de A1 é: "+a1);}

        else if (resposta == 3){
            System.out.print("Insira o valor de An: ");
            int an = entrada.nextInt();
            System.out.print("Insira o valor de A1: ");
            int a1 = entrada.nextInt();
            System.out.print("Insira o valor de N: ");
            int n = entrada.nextInt();
            int r = (an-a1)/(n-1);
            System.out.println();
            System.out.println("O valor de R é: "+r);}
           
        else if (resposta == 4){
            System.out.print("Insira o valor de An: ");
            int an = entrada.nextInt();
            System.out.print("Insira o valor de A1: ");
            int a1 = entrada.nextInt();
            System.out.print("Insira o valor de R: ");
            int r = entrada.nextInt();
            int n = ((an-a1)/r)+1;
            System.out.println();
            System.out.println("O valor de N é: "+n);}
    }
}




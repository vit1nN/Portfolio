import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner alberto = new Scanner(System.in); //Criação de Scanner
        int n = alberto.nextInt(); //variável escolhida
        int i = 1;
        while (i<n){ // enquanto "i" for menor que "n" faça:
            int j = i;
            int d = 0;
            while (j > 0){ // enquanto "j" for maior que "0" faça:
                if(i % j == 0){ //se o resto da divisão de "i" por "j" for igual a 0 faça:
                    d++; //soma +1 a variável "d" se(i % j == 0)
                }
                j--; // soma +1 a variável "j"
            }
            if(d == 2){ //se a variável "d" for igual a 2 faça:
                System.out.println(i); // printa a variável "i" se(d == 2)
            }
            i++; //soma +1 a variável "i"
        }//fim do primeiro "while"
    }//fim do "public static void"
}//fim

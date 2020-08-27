import java.util.Scanner;

public class Aritmetica {
	public static void main(String[] args) {
		int n1;  // primeiro número solicitado
		int n2;  // segundo número solicitado
		int soma;           // soma dos dois números
		int subtracao;	    // subtracao dos dois números
		int multiplicacao;  // multiplicacao dos dois números
		int divisao;		// divisao dos dois números
		
		// Pedir 2 números para o usuário
		// Cria um objeto de Scanner que lê
		// da entrada padrão (System.in);
		Scanner entrada = new Scanner(System.in);
		// Carregar esses números como inteiros
		System.out.print("Insira o 1º número: ");
		n1 = entrada.nextInt();
		System.out.print("Insira o 2º número: ");
		n2 = entrada.nextInt();
		
		// Somar os dois números
		soma = n1 + n2;
		// Subtrair os dois números
		subtracao = n1 - n2;
		// Multiplicar os dois números
		multiplicacao = n1 * n2;
		// Dividir os dois números
		divisao = n1 / n2;
		
		if (n1 == n2) {
			System.out.println("Os numeros sao iguais");
		}
		else if (n1 > n2) {
			System.out.printf("O maior eh: %d\n", n1);
		}
		else {
			System.out.printf("O maior eh: %d\n", n2);
		}
		// Imprimir a soma
		System.out.printf("Soma: %d\n", soma);
		System.out.printf("Subtracao: %d\n", subtracao);
		System.out.printf("Multiplicacao: %d\n", multiplicacao);
		System.out.printf("Divisao: %d\n", divisao);
	}
}
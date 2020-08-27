import java.util.Scanner;

public class IndiceMC
{
	public static void main(String[] args) {
		double peso;
		double altura;
		double imc;
		Scanner input = new Scanner(System.in);
		System.out.println("Digite seu peso: ");
		peso = input.nextDouble();
		System.out.println("Digite sua altura: ");
		altura = input.nextDouble();
		imc = peso / (altura * altura);
		if (imc < 18.5){
			System.out.println("Abaixo do peso");
		}
		else if (imc < 25.0){
			System.out.println("Normal");
		}
		else if (imc < 30.0){
			System.out.println("Sobrepeso");
		}
		else{
			System.out.println("Obeso");
		}
		System.out.printf("Seu IMC eh: %.2f", imc);
	}
}